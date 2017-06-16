package model;

import fr.exia.showboard.ISquare;

public interface IElement extends ISquare{ //extends ISquare so it can be displayed on a IBoard
	
/*	*//** The id. *//*
   public int id;

    *//** The name. *//*
   public String    name;*/

 
   
    /**
     * Gets the id.
     *
     * @return the id
     */
    public int getId();

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName();

    /**
     * Sets the name.
     *
     * @param name
     *            the new name
     */
    public void setName(final String name);
    
    /**
     * Gets the sprite.
     *
     * @return the sprite
     */
    public Sprite getSprite();
    
    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString();
    
    Permeabilty getPermeability();
    
}
