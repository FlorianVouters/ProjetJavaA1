package model.element.motionless;

import model.IMotionlessElement;
import model.Permeabilty;
import model.Sprite;
import model.element.Element;

public abstract class MotionlessElement extends Element implements IMotionlessElement {

	public MotionlessElement(Sprite sprite, final Permeabilty permeability) {
		super(sprite, permeability);
	}
}
