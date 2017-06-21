package model.element.motionless;

import java.awt.Image;

import model.IDestructible;
import model.IElement;
import model.ITangible;
import model.Permeabilty;
import model.Sprite;

public class Wall extends MotionlessElement implements IDestructible, ITangible{

	private static final Sprite WALL = new Sprite('W');
	
	public Wall() {
		super(WALL, Permeabilty.BLOCKING);
	}

	@Override
	public void checkColision(IElement element1, IElement element2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
		
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

}
