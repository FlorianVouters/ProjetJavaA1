package model.element.motionless;

import java.awt.Image;

import model.INotTangible;
import model.Permeabilty;
import model.Sprite;

public class ExitDoor extends MotionlessElement {
	
	/** The Exit Door's sprite*/
	private static final Sprite EXIT_DOOR = new Sprite('X');
	
	public ExitDoor(){
		super(EXIT_DOOR, Permeabilty.PENETRABLE);
		this.alive = true;
	}

	


}
