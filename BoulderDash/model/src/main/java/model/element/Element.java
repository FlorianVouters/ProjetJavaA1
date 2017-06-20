package model.element;

import model.IElement;
import model.Permeabilty;
import model.Sprite;

public abstract class Element implements IElement {
	
	 /** The sprite. */
    private Sprite       sprite;

    /** The permeability. */
    private Permeabilty permeability;

	public Element(Sprite sprite, Permeabilty permeability) {
		this.setSprite(sprite);
		this.setPermeability(permeability);
	}

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
	
	public void setSprite(Sprite sprite){
		//this.sprite = sprite;
	}

	@Override
	public String toString() {
		return null;
	}

	@Override
	public Permeabilty getPermeability() {
		return null;
	}

	public void setPermeability(Permeabilty permeability) {
		//this.permeability = permeability;
	}

}
