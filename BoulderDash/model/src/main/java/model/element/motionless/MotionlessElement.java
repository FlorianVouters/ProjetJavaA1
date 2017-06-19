package model.element.motionless;

import model.IMotionlessElement;
import model.Permeabilty;
import model.Sprite;
import model.element.Example;

public abstract class MotionlessElement extends Example implements IMotionlessElement {

	public MotionlessElement(Sprite sprite, final Permeabilty permeability) {
		super(sprite, permeability);
	}
}
