package model.element.motionless;

import java.awt.Image;

import model.IElement;
import model.ITangible;
import model.Permeabilty;
import model.Sprite;

public class Border extends MotionlessElement implements ITangible{
	
	private static final Sprite BORDER = new Sprite('|');

	public Border() {
		super(BORDER, Permeabilty.BLOCKING);
	}

	@Override
	public void checkColision(IElement element1, IElement element2) {
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
