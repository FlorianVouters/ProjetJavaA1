package model.element;

import model.IElement;
import model.Permeabilty;
import model.Sprite;

public abstract class Element implements IElement {

	@Override
	public int getId() {
		return 0;
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public void setName(final String name) {

	}

	@Override
	public Sprite getSprite() {
		return null;
	}

	@Override
	public String toString() {
		return null;
	}

	@Override
	public Permeabilty getPermeability() {
		return null;
	}

}
