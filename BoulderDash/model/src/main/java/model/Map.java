package model;

import java.util.Observable;

public class Map extends Observable implements IMap {

	private int height; //height of the map
	private int width; // width of the map
	private IElement[][] map; //double array of element which constitute the map
	
	public Map(int level){
		loadLevel(level);
	}
	
	private void loadLevel(int level) {
		// TODO Auto-generated method stub
		//goes get the map in the DB
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
	
}
