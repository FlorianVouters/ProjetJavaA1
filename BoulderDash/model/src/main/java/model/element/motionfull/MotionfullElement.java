package model.element.motionfull;

import java.awt.Point;

import model.IMotionfullElement;
import model.Map;
import model.Permeabilty;
import model.Sprite;
import model.element.Element;

public abstract class MotionfullElement extends Element implements IMotionfullElement {

	
	Map map;
	Boolean alive;
	
	  public MotionfullElement(Sprite sprite, Permeabilty permeability,Map map, int x, int y) {
		super(sprite, permeability);
		this.setMap(map);
		this.setX(x);
		this.setY(y);
	}

	 public MotionfullElement(Sprite sprite, Permeabilty permeability, Map map) {
	        super(sprite, permeability);
	        this.setMap(map);
	        
	    }
	  
	/**
     * Move up.
     */
    public void moveUp(){
    	   this.setY(this.getY() + 1);
           this.setHasMoved();
    }

    /**
     * Move left.
     */
    public void moveLeft(){
    	this.setY(this.getX() - 1);
        this.setHasMoved();
    }

    /**
     * Move down.
     */
    public void moveDown(){
    	this.setY(this.getY() - 1);
        this.setHasMoved();	
    }

    /**
     * Move right.
     */
    public void moveRight(){
    	this.setY(this.getX() + 1);
        this.setHasMoved();
    }

    /**
     * Do nothing.
     */
    public void doNothing(){
    	this.doNothing();
    }

   
    
    
    public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	private void setHasMoved() {
        this.getMap().setMapHasChanged();
        
    }
	
	public void applyPhysics(){
		//not sure it will be here but
		// will make all object fall
	}
	
}
