package model.element.motionfull;

import java.awt.Point;

import model.IMotionfullElement;
import model.Map;
import model.Permeabilty;
import model.Sprite;
import model.element.Element;

public abstract class MotionfullElement extends Element implements IMotionfullElement {

	Point position;
	Map map;
	Boolean alive;
	Direction EDirection = Direction.NORD;
	
	  public MotionfullElement(Sprite sprite, Permeabilty permeability,Map map, int x, int y) {
		super(sprite, permeability);
		this.setMap(map);
		this.setX(x);
		this.setY(y);
	}

	 public MotionfullElement(Sprite sprite, Permeabilty permeability, Map map) {
	        super(sprite, permeability);
	        this.setMap(map);
	        this.position = new Point();
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
