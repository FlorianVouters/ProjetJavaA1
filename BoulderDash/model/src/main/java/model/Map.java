package model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;
import java.util.Observable;

import model.dao.ElementDAO2;

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
	
	
	@Deprecated //only used to push the maps in the database
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
	            	
	            	map [x][y] = line.toCharArray()[x]; //mettre le char lu ici
	            	
	               
	            }
	            line = buffer.readLine();
	            y++;
	        }
	        buffer.close();
	        
	            
	       ElementDAO2.saveMap(map, level, this.getHeight(), this.getWidth());       
	      
	    }
	
}
