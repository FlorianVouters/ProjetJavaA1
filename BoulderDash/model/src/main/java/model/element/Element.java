package model.element;

import java.awt.Image;
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
    private Point position;
    
    /**If the element is alive or dead*/
    public Boolean alive;

	public Element(Sprite sprite, Permeabilty permeability) {
		this.setSprite(sprite);
		this.setPermeability(permeability);
		this.position = new Point();
	}

	/**
	 * Unused method
	 * 
	 * @return id, the element's ID
	 * */
	@Override
	public int getId() {
		return 0;
	}

	/**
	 * Unused method
	 * 
	 * @return name, the element's name
	 * */
	@Override //shan't be used
	public String getName() {
		return "";
	}

	/**
	 * Unused method
	 * 
	 * */
	@Override // shan't be used
	public void setName(final String name) {

	}

	
	/**
	 * Gets the sprite
	 * 
	 * @return the spirte
	 */
	@Override
	public Sprite getSprite() {
		return sprite;
	}
	
	
	 /**
     * Sets the sprite.
     *
     * @param sprite
     *            the new sprite
     */
	public void setSprite(Sprite sprite){
		this.sprite = sprite;
	}

	/**
	 * Get the permeability
	 * 
	 * @return the permeability
	 */
	@Override
	public Permeabilty getPermeability() {
		return this.permeability;
	}

	/**
	 * Sets the permeability
	 * 
	 * @param permeability
	 * 					the new permeability
	 */
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
    
   
    /**
     * Sets the x.
     *
     * @param x
     * 			the new x
     */
    public void setX(int x){
    	this.getPosition().x = x;
    	//check collisions
    }

    /**
     * Fets the y.
     *
     * @return the y
     */
    @Override
    public int getY(){
    	return this.getPosition().y;
    }

    /**
     * Sets the y.
     *
     * @param y
     * 			the new y
     */
    public void setY(int y){
    	this.getPosition().y = y;
    	//checkcollisions
    }
    
    
    /**
     * Gets the position
     * 
     * @return position
     */
    @Override
    public Point getPosition(){
    	return this.position;
    }
    
    /**
     * Gets the image
     * 
     * @return the image
     */
    public Image getImage(){
    	return this.getSprite().getImage();
    	
    }
}
