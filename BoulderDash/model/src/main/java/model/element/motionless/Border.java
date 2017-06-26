package model.element.motionless;

import java.awt.Image;

import model.IElement;
import model.ITangible;
import model.Permeabilty;
import model.Sprite;

public class Border extends MotionlessElement{
	
	/** The Border's sprite*/
	private static final Sprite BORDER = new Sprite('|');

	public Border() {
		super(BORDER, Permeabilty.BLOCKING);
	}

	

	



}
