package model.element.motionless;

import java.awt.Image;

import model.IDestructible;
import model.Permeabilty;
import model.Sprite;

public class SpecialStoneWall extends MotionlessElement implements IDestructible {

	private static final Sprite SPECIAL_STONE_WALL = new Sprite('S', "SpecialStoneWall.jpg");

	public SpecialStoneWall() {
		super(SPECIAL_STONE_WALL, Permeabilty.PENETRABLE);
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
