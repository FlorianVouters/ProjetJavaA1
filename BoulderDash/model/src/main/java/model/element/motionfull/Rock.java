package model.element.motionfull;

import java.awt.Image;
import java.awt.Point;

import model.Map;
import model.Permeabilty;
import model.Sprite;

public class Rock extends MotionfullElement implements IGravitable{
	
	private static final Sprite ROCK = new Sprite('O');

	public Rock(Map map) {
		super(ROCK, Permeabilty.BLOCKING, map);
	}

	

	@Override
	public Boolean isAlive() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void fall() {
				
	}
	
	public void fallLeft(){
		
	}
	
	public void fallRight(){
		
	}

}
