package model.element.motionless;

import java.awt.Image;

import model.IDestructible;
import model.Permeabilty;
import model.Sprite;

public class SpecialStoneWall extends MotionlessElement implements IDestructible {

	private static final Sprite SPECIAL_STONE_WALL = new Sprite('S');

	public SpecialStoneWall() {
		super(SPECIAL_STONE_WALL, Permeabilty.PENETRABLE);
		this.alive = true;
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub

	}

	@Override
	public Boolean isAlive() {
		return this.alive;
	}

	

}
