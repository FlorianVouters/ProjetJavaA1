package model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import model.dao.ElementDAO2;
import model.element.ElementFactory;
import model.element.motionfull.Enemy;
import model.element.motionfull.Diamond;
import model.element.motionfull.MotionfullElement;
import model.element.motionfull.MotionfullElementFactory;
import model.element.motionfull.Rock;
import model.element.motionless.Background;
import model.element.motionless.MotionlessElementFactory;

public class Map extends Observable implements IMap {

	private int level;
	private int height; // height of the map
	private int width; // width of the map
	private IElement[][] map; // double array of element which constitute the
								// map
	private ArrayList<IElement> elements;
	public int score;
	private int timer;
	public int objective;

	public Map(int level) throws SQLException {
		super(); // for observable ?
		this.setLevel(level);
		this.loadLevel(getLevel());
	}

	private void loadLevel(int level) throws SQLException {
		this.setHeight(ElementDAO2.getMapHeight(level));
		this.setWidth(ElementDAO2.getMapWidth(level));
		map = new IElement[this.getWidth()][this.getHeight()];
		MotionfullElementFactory.setMap(this);

		char[][] consoleMap = ElementDAO2.getMap(level);
		for (int y = 0; y < this.getHeight(); y++) {
			for (int x = 0; x < this.getWidth(); x++) {
				this.setElementPosition(ElementFactory.getFromFileSymbol(consoleMap[x][y]), x, y);
			}
		}
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
		Sprite.LEVEL = level;
	}

	public void setElementPosition(IElement element, int x, int y) { //TODO should probably be private but changed it for easier debug, might not change it back
		element.setX(x);
		element.setY(y);
		this.map[x][y] = element;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public IElement[][] getMap() {
		return map;
	}

	public void setMap(IElement[][] map) {
		this.map = map;
	}

	@Override
	public List<IElement> getAllElements() throws SQLException {
		return this.elements;
	}

	@Override
	public IElement getElementByPosition(int x, int y) {
		return map[x][y];
	}

	@Override
	public IElement getElementByID(int ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IElement getElementByName(String name) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMapHasChanged() {
		this.setChanged();
		this.notifyObservers();
	}

	@Override
	public Observable getObservable() {
		return this;
	}

	public boolean isEmpty(int x, int y) {
		if (getElementByPosition(x, y).getClass().equals(Background.class)) {
			return true;
		}
		return false;
	}

	public void moveEnemy(MotionfullElement element) {
		int x = 0;
		int y = 0;
		x = element.getX();
		y = element.getY();

		if (isEmpty(x + 1, y)) {
			element.setX(x + 1);
			element.setY(y);
		} else if (isEmpty(x, y - 1) && !isEmpty(x + 1, y)) {
			element.setX(x);
			element.setY(y - 1);
		} else if (isEmpty(x - 1, y) && !isEmpty(x, y - 1) && !isEmpty(x + 1, y)) {
			element.setX(x - 1);
			element.setY(y);
		} else if (isEmpty(x, y - 1) && !isEmpty(x - 1, y) && !isEmpty(x, y - 1) && !isEmpty(x + 1, y)) {
			element.setX(x);
			element.setY(y - 1);
		} else {
			element.doNothing();
		}
	}

	public void lookForAndMoveEnemy() {
		IElement[][] elem = getMap();
		for (int j = 0; j < elem.length; j++) {
			for (int i = 0; i < elem[i].length; i++) {
				if (getElementByPosition(i, j).getClass().equals(Enemy.class)) {
					moveEnemy((MotionfullElement) getElementByPosition(i, j));
				}
			}
		}
	}

	@Deprecated // only used to push the maps in the database
	public void loadFile(final String fileName) throws IOException {
		final BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
		String line;
		int y = 0;
		line = buffer.readLine();
		this.setHeight(Integer.parseInt(line));
		line = buffer.readLine();
		this.setWidth(Integer.parseInt(line));
		line = buffer.readLine();
		int level = Integer.parseInt(line);
		line = buffer.readLine();
		char map[][] = new char[this.getWidth()][this.getHeight()];
		while (line != null) {
			for (int x = 0; x < line.toCharArray().length; x++) {

				map[x][y] = line.toCharArray()[x];

			}
			line = buffer.readLine();
			y++;
		}
		buffer.close();

		ElementDAO2.saveMap(map, level, this.getHeight(), this.getWidth());

	}

	public void applyPhysics() {
		for (int y = 0; y < getHeight(); y++) {
			for (int x = 0; x < getWidth(); x++) {
				if (map[x][y].getClass().equals(Rock.class) || map[x][y].getClass().equals(Diamond.class)) {

					MotionfullElement element = (MotionfullElement.class.cast((map[x][y])));
					if (map[element.getX()][element.getY() - 1].getClass().equals(Background.class)) {
						element.setY(element.getY() - 1);
						map[x][y] = MotionlessElementFactory.createBackground(level);
						map[x][y - 1] = element;
					} else if ((map[element.getX()][element.getY() - 1].getClass().equals(Rock.class)
							|| map[element.getX()][element.getY() - 1].getClass().equals(Diamond.class))
							&& map[element.getX() + 1][element.getY()].getClass().equals(Background.class)
							&& map[element.getX() - 1][element.getY()].getClass().equals(Background.class)) {
						int rand = (int) (Math.random() * 10);
						element.setY(element.getY() - 1);
						if (rand == 0) {
							element.setX(element.getX() + 1);
							map[x + 1][y - 1] = element;
						} else {
							element.setX(element.getX() - 1);
							map[x - 1][y - 1] = element;
						}
						map[x][y] = MotionlessElementFactory.createBackground(level);

					} else if ((map[element.getX()][element.getY() - 1].getClass().equals(Rock.class)
							|| map[element.getX()][element.getY() - 1].getClass().equals(Diamond.class))
							&& map[element.getX() - 1][element.getY()].getClass().equals(Background.class)) {
						element.setY(element.getY() - 1);
						element.setX(element.getX() - 1);
						map[x][y] = MotionlessElementFactory.createBackground(level);
						map[x - 1][y - 1] = element;
					} else if ((map[element.getX()][element.getY() - 1].getClass().equals(Rock.class)
							|| map[element.getX()][element.getY() - 1].getClass().equals(Diamond.class))
							&& map[element.getX() + 1][element.getY()].getClass().equals(Background.class)) {
						element.setY(element.getY() - 1);
						element.setX(element.getX() + 1);
						map[x][y] = MotionlessElementFactory.createBackground(level);
						map[x + 1][y - 1] = element;
					}
				}
			}
		}
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getObjective() {
		return objective;
	}

	public void setObjective(int objective) {
		this.objective = objective;
	}
	
	

}
