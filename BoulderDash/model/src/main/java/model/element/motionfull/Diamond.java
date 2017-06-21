package model.element.motionfull;

import java.awt.Image;
import java.awt.Point;

import model.IDestructible;
import model.Map;
import model.Permeabilty;
import model.Sprite;


public class Diamond extends MotionfullElement implements IGravitable, IDestructible{

	private static final Sprite DIAMOND = new Sprite('D');

	
	public Diamond(Map map) {
		super(DIAMOND, Permeabilty.BLOCKING, map);
	}

	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doNothing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		
	}
	
	public void die(){
		//TODO get looted
	}

}
