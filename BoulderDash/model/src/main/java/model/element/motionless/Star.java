package model.element.motionless;

import java.awt.Image;

import model.IElement;
import model.ITangible;
import model.Permeabilty;
import model.Sprite;

public class Star extends MotionlessElement {

	/** The Star's sprite*/
	private static final Sprite STAR = new Sprite('*');
	
	public Star() {
		super(STAR, Permeabilty.BLOCKING);
		this.alive = true;
	}

}
