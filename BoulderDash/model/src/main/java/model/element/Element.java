package model.element;

import java.awt.Point;

import model.IElement;
import model.Permeabilty;
import model.Sprite;

public abstract class Element implements IElement {
	
	 /** The sprite. */
    private Sprite       sprite;

    /** The permeability. */
    private Permeabilty permeability;
    
    /**The element's position */
    Point position;

	public Element(Sprite sprite, Permeabilty permeability) {
		this.setSprite(sprite);
		this.setPermeability(permeability);
		this.position = new Point();
	}

	@Override
	public int getId() {
		return 0;
	}

	@Override //shan't be used
	public String getName() {
		return null;
	}

	@Override // shan't be used
	public void setName(final String name) {

	}

	@Override
	public Sprite getSprite() {
		return sprite;
	}
	
	public void setSprite(Sprite sprite){
		this.sprite = sprite;
	}

	@Override
	public String toString() {
		return null;
	}

	@Override
	public Permeabilty getPermeability() {
		return this.permeability;
	}

	public void setPermeability(Permeabilty permeability) {
		this.permeability = permeability;
	}

	 /**
     * Gets the x.
     *
     * @return the x
     */
    @Override
    public int getX(){
    	return this.getPosition().x;
    }
    
    public void setX(int x){
    	this.getPosition().x = x;
    	//check collisions
    }

    /**
     * Gets the y.
     *
     * @return the y
     */
    @Override
    public int getY(){
    	return this.getPosition().y;
    }

    public void setY(int y){
    	this.getPosition().y = y;
    	//checkcollisions
    }
    
    
    /*
     * (non-Javadoc)
     * @see fr.exia.showboard.IPawn#getPosition()
     */
    @Override
    public Point getPosition(){
    	return this.position;
    }
}
