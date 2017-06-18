package model.element.motionless;

import java.awt.Image;

import model.INotTangible;
import model.Permeabilty;
import model.Sprite;

public class Background extends MotionlessElement implements INotTangible{


	private static final Sprite BACKGROUND = new Sprite(' ', "Mud.jpg");
	 
	public Background() {
		super(BACKGROUND, Permeabilty.PENETRABLE);
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
