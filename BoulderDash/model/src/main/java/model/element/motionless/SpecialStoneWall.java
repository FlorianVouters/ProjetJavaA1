package model.element.motionless;

import java.awt.Image;

import model.IDestructible;
import model.Permeabilty;
import model.Sprite;

public class SpecialStoneWall extends MotionlessElement implements IDestructible {

	/** The Special Stonewall's sprite*/
	private static final Sprite SPECIAL_STONE_WALL = new Sprite('S');

	public SpecialStoneWall() {
		super(SPECIAL_STONE_WALL, Permeabilty.PENETRABLE);
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
