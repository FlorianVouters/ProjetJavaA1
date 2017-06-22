package model;

import java.awt.Point;

import fr.exia.showboard.IPawn;
import fr.exia.showboard.ISquare;

public interface IElement extends ISquare, IPawn { //extends ISquare so it can be displayed on a IBoard
	
/*	*//** The id. *//*
   public int id;

    *//** The name. *//*
   public String    name;*/

	
	
	/**
     * Checks if is alive.
     *
     * @return the alive
     */
    public Boolean isAlive();
 
   
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
    
   public Permeabilty getPermeability();
   
   /**
    * Gets the x.
    *
    * @return the x
    */
   @Override
   int getX();

   /**
    * Gets the y.
    *
    * @return the y
    */
   @Override
   int getY();

   void setX(int x);
   
   void setY(int y);
   
   
   /*
    * (non-Javadoc)
    * @see fr.exia.showboard.IPawn#getPosition()
    */
   @Override
   Point getPosition();
    
}
