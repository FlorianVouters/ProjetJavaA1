package model.element.motionless;

import java.awt.Image;

import model.INotTangible;
import model.Permeabilty;
import model.Sprite;

public class Background extends MotionlessElement implements INotTangible{

	private static int LEVEL;
	private static final Sprite BACKGROUND = new Sprite('_');
	 
	public Background() {
		super(BACKGROUND, Permeabilty.PENETRABLE);
		this.alive = true;
	}
	 
	@Override
	public Boolean isAlive() {
		return this.alive;
	}


}
