package model;

import java.sql.SQLException;
import java.util.List;
import java.util.Observable;

public class Map extends Observable implements IMap {

	private int height; //height of the map
	private int width; // width of the map
	private IElement[][] map; //double array of element which constitute the map
	private ICAD cad;
	public int score;
	private int timer;
	public int objective;
	
	public Map(int level){
		loadLevel(level);
	}

	
	private void loadLevel(int level) {
		// TODO Auto-generated method stub
		//goes get the map in the DB
	}
	
	void setElementPosition(int x,int y) {  
		
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IElement getElementByPosition(int x, int y) {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public Observable getObservable() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
