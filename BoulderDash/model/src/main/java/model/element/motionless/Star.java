package model.element.motionless;

import java.awt.Image;

import model.IElement;
import model.ITangible;
import model.Permeabilty;
import model.Sprite;

public class Star extends MotionlessElement implements ITangible{

	private static final Sprite STAR = new Sprite('*');
	
	public Star() {
		super(STAR, Permeabilty.BLOCKING);
		this.alive = true;
	}

	@Override
	public void checkColision(IElement element1, IElement element2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean isAlive() {
		return this.alive;
	}



}
