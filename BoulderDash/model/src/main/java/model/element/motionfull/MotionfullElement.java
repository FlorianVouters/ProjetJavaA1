package model.element.motionfull;

import java.awt.Point;

import model.IElement;
import model.IMotionfullElement;
import model.Map;
import model.Permeabilty;
import model.Sprite;
import model.element.Element;
import model.element.ElementFactory;
import model.element.motionless.MotionlessElementFactory;

public abstract class MotionfullElement extends Element implements IMotionfullElement {

	Map map;

	public MotionfullElement(Sprite sprite, Permeabilty permeability, Map map, int x, int y) {
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
	public void moveUp() {
		if (this.getMap().getElementByPosition(this.getX(), this.getY() - 1).getPermeability() == Permeabilty.PENETRABLE) {
			System.out.println(this.getMap().getElementByPosition(this.getX(), this.getY() - 1).getSprite().getConsoleImage());
			fillEmptySpace(this.getX(), this.getY());
			this.setY(this.getY() - 1);
			System.out.println("x: "+this.getX()+"y: "+this.getY());
			this.getMap().setElementPosition(this, this.getX(), this.getY());
			this.setHasMoved();
		}
		// TODO suppr this debug
		else {
			System.out.println(this.getMap().getElementByPosition(this.getX(), this.getY() - 1).getSprite().getConsoleImage());
			System.out.println("can't go through");
		}
	}

	/**
	 * Move left.
	 */
	public void moveLeft() {
		if (this.getMap().getElementByPosition(this.getX() - 1, this.getY()).getPermeability() == Permeabilty.PENETRABLE) {
			System.out.println(this.getMap().getElementByPosition(this.getX() - 1, this.getY()).getSprite().getConsoleImage());
			System.out.println("x: "+this.getX()+"y: "+this.getY());
			fillEmptySpace(this.getX(), this.getY());
			this.setX(this.getX() - 1);
			System.out.println("x: "+this.getX()+"y: "+this.getY());
			this.getMap().setElementPosition(this, this.getX(), this.getY());
			this.setHasMoved();
		}
		// TODO suppr this debug
		else {
			System.out.println(this.getMap().getElementByPosition(this.getX() - 1, this.getY()).getSprite().getConsoleImage());
			System.out.println("can't go through");
		}
	}

	/**
	 * Move down.
	 */
	public void moveDown() {
		if (this.getMap().getElementByPosition(this.getX(), this.getY() + 1).getPermeability() == Permeabilty.PENETRABLE) {
			System.out.println(this.getMap().getElementByPosition(this.getX(), this.getY() + 1).getSprite().getConsoleImage());
			System.out.println("x: "+this.getX()+"y: "+this.getY());
			fillEmptySpace(this.getX(), this.getY());
			this.setY(this.getY() + 1);
			System.out.println("x: "+this.getX()+"y: "+this.getY());
			this.getMap().setElementPosition(this, this.getX(), this.getY());
			this.setHasMoved();
		}
		// TODO suppr this debug
		else {
			System.out.println(this.getMap().getElementByPosition(this.getX(), this.getY() + 1).getSprite().getConsoleImage());
			System.out.println("can't go through");
		}
	}

	/**
	 * Move right.
	 */
	public void moveRight() {
		if (this.getMap().getElementByPosition(this.getX() + 1, this.getY()).getPermeability() == Permeabilty.PENETRABLE) {
			System.out.println(this.getMap().getElementByPosition(this.getX() + 1, this.getY()).getSprite().getConsoleImage());
			System.out.println("x: "+this.getX()+"y: "+this.getY());
			fillEmptySpace(this.getX(), this.getY());
			this.setX(this.getX() + 1);
			System.out.println("x: "+this.getX()+"y: "+this.getY());
			this.getMap().setElementPosition(this, this.getX(), this.getY());
			this.setHasMoved();
		}
		// TODO suppr this debug
		else {
			System.out.println(this.getMap().getElementByPosition(this.getX() + 1, this.getY()).getSprite().getConsoleImage());
			System.out.println("can't go through");
		}
	}

	/**
	 * Do nothing.
	 */
	public void doNothing() {
		// told ya, nothing
	}

	
	/**
	 * Places a Mud at x,y
	 * @param x
	 * @param y
	 */
	public void fillEmptySpace(int x, int y) {
		IElement bg = MotionlessElementFactory.getFromFileSymbol('_');
		bg.setX(x);
		bg.setY(y);
		this.getMap().setElementPosition(bg, x, y);
	}

	/**
	 * Gets the map
	 * 
	 * @return the map
	 */
	public Map getMap() {
		return map;
	}

	/**
	 * Sets the map
	 * 
	 * @param map
	 * 			the new map
	 */
	public void setMap(Map map) {
		this.map = map;
	}

	
	/**
	 * Notifies the observers it has changed
	 * 
	 */
	public void setHasMoved() {
		this.getMap().setMapHasChanged();

	}

}
