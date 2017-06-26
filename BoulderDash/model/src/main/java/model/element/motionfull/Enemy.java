package model.element.motionfull;

import java.awt.Image;
import java.awt.Point;

import model.IDestructible;
import model.Map;
import model.Permeabilty;
import model.Sprite;

public class Enemy extends MotionfullElement implements IDestructible{

	
	public Enemy(Sprite sprite, Map map) {
		super(sprite, Permeabilty.BLOCKING, map );
		
	}

	
	/**
	 * Checks if is alive.
     *
     * @return  alive
     */
	@Override
	public Boolean isAlive() {
		return this.alive;
	}

	
/**
 * Awaiting override
 * */
	@Override
	public void die() {
	}

}
