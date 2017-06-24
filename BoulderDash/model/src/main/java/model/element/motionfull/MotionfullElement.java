package model.element.motionfull;

import java.awt.Point;

import model.IMotionfullElement;
import model.Map;
import model.Permeabilty;
import model.Sprite;
import model.element.Element;

public abstract class MotionfullElement extends Element implements IMotionfullElement {

	
	Map map;
	
	
	  public MotionfullElement(Sprite sprite, Permeabilty permeability,Map map, int x, int y) {
		super(sprite, permeability);
		this.setMap(map);
		this.setX(x);
		this.setY(y);
		this.alive = true;
	}

	 public MotionfullElement(Sprite sprite, Permeabilty permeability, Map map) {
	        super(sprite, permeability);
	        this.setMap(map);
	        
	    }
	  
	/**
     * Move up.
     */
    public void moveUp(){
    	if (this.getMap().getElementByPosition(this.getX(), this.getY() + 1).getPermeability() == Permeabilty.PENETRABLE) {
    	this.setY(this.getY() + 1);
    	this.setHasMoved();
    	}
    }

    /**
     * Move left.
     */
    public void moveLeft(){
    	if (this.getMap().getElementByPosition(this.getX() -1, this.getY()).getPermeability() == Permeabilty.PENETRABLE) {
    	this.setY(this.getX() - 1);
        this.setHasMoved();
    	}
    }

    /**
     * Move down.
     */
    public void moveDown(){
    	if (this.getMap().getElementByPosition(this.getX(), this.getY() - 1).getPermeability() == Permeabilty.PENETRABLE) {
    	this.setY(this.getY() - 1);
        this.setHasMoved();	
    	}
    }

    /**
     * Move right.
     */
    public void moveRight(){
    	if (this.getMap().getElementByPosition(this.getX() +1, this.getY()).getPermeability() == Permeabilty.PENETRABLE) {
    	this.setY(this.getX() + 1);
        this.setHasMoved();
    	}
    }

    /**
     * Do nothing.
     */
    public void doNothing(){
    	//told ya, nothing
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
