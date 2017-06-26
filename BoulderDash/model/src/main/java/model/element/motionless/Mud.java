package model.element.motionless;

import java.awt.Image;

import model.IDestructible;
import model.INotTangible;
import model.Permeabilty;
import model.Sprite;

public class Mud extends MotionlessElement implements IDestructible {

	/** The Mud's sprite*/
	private static final Sprite MUD = new Sprite('M');

	public Mud() {
		super(MUD, Permeabilty.PENETRABLE);
		this.alive = true;
	}

	/**
	 * Sets alive to false
	 */
	@Override
	public void die() {
		this.alive=false;
	}

}
