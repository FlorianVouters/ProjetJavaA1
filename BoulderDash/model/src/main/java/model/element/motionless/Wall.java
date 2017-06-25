package model.element.motionless;

import java.awt.Image;

import model.IDestructible;
import model.IElement;
import model.ITangible;
import model.Permeabilty;
import model.Sprite;

public class Wall extends MotionlessElement implements IDestructible{

	/** The Star's sprite*/
	private static final Sprite WALL = new Sprite('W');
	
	public Wall() {
		super(WALL, Permeabilty.BLOCKING);
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
