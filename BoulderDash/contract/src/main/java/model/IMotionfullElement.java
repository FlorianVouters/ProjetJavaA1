package model;

import java.awt.Point;

import fr.exia.showboard.IPawn;

public interface IMotionfullElement extends IElement{ //extends IPAwn so it can be moved on the IBoard
	
	  /**
     * Move up.
     */
    void moveUp();

    /**
     * Move left.
     */
    void moveLeft();

    /**
     * Move down.
     */
    void moveDown();

    /**
     * Move right.
     */
    void moveRight();

    /**
     * Do nothing.
     */
    void doNothing();

  
    
    

}
