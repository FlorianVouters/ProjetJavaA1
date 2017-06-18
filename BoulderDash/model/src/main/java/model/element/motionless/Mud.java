package model.element.motionless;

import java.awt.Image;

import model.IDestructible;
import model.INotTangible;
import model.Permeabilty;
import model.Sprite;

public class Mud extends MotionlessElement implements IDestructible, INotTangible {
	
	
	 private static final Sprite MUD = new Sprite('M', "Mud.jpg");

	public Mud() {
		super(MUD, Permeabilty.PENETRABLE);
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
	public void die() {
		// TODO Auto-generated method stub
		
	}

}
