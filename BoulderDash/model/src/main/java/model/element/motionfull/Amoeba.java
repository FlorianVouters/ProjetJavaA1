package model.element.motionfull;

import model.Map;
import model.Sprite;

public class Amoeba extends Enemy{

	private static int LEVEL;
	private static final Sprite AMOEBA = new Sprite('A');

	
	public Amoeba(Sprite sprite, Map map) {
		super(sprite, map);
		this.LEVEL = map.getLevel();
		this.alive = true;
	}

	/**
	 * Time since born
	 * */
	int timer; //multiply at some point and turns into a rock at the end
	
	/**
	 * Turns any enemy into 9 diamonds
	 */
	public void kill(){
		//turn any enemy into 9 diamonds
	}
	
	/**
	 * Turns into a diamond
	 */
	public void die(){
		//if surrounded by four rocks turns into diamond
	}
	
	/**
	 * Spawns another Amoeba
	 */
	public void multiply(){
		//multiplies at random moments
	}
}
