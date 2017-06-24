package model.element.motionless;

import java.awt.Image;

import model.IDestructible;
import model.INotTangible;
import model.Permeabilty;
import model.Sprite;

public class Mud extends MotionlessElement implements IDestructible, INotTangible {

	private static final Sprite MUD = new Sprite('M');

	public Mud() {
		super(MUD, Permeabilty.PENETRABLE);
		this.alive = true;
	}

	@Override
	public Boolean isAlive() {
		return this.alive;
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub

	}

}
