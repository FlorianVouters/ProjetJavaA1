package model.element.motionfull;

import java.awt.Point;

import model.IMotionfullElement;
import model.Permeabilty;
import model.Sprite;
import model.element.Element;

public abstract class MotionfullElement extends Element implements IMotionfullElement {

	
	  public MotionfullElement(Sprite sprite, Permeabilty permeability) {
		super(sprite, permeability);
	}

	/**
     * Move up.
     */
    public void moveUp(){
    	// TODO Auto-generated method stub
    }

    /**
     * Move left.
     */
    public void moveLeft(){
    	
    }

    /**
     * Move down.
     */
    public void moveDown(){
    	
    }

    /**
     * Move right.
     */
    public void moveRight(){
    	
    }

    /**
     * Do nothing.
     */
    public void doNothing(){
    	
    }

    /**
     * Gets the x.
     *
     * @return the x
     */
    @Override
    public int getX(){
    	return 0;
    }

    /**
     * Gets the y.
     *
     * @return the y
     */
    @Override
    public int getY(){
    	return 0;
    }

    
    
    
    /*
     * (non-Javadoc)
     * @see fr.exia.showboard.IPawn#getPosition()
     */
    @Override
    public Point getPosition(){
    	return null;
    }
}
