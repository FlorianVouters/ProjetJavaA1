package model.element.motionfull;

import java.awt.Image;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import model.IDestructible;
import model.Map;
import model.Permeabilty;
import model.Sprite;

public class MainCharacter extends MotionfullElement implements IDestructible{

	private static final Sprite MAIN_CHARACTER = new Sprite('H');
	
	BufferedImage buffer;
	

	
	
	public MainCharacter(Map map){
		super(MAIN_CHARACTER, Permeabilty.BLOCKING, map);
		this.alive =true;
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
	 * Sets alive to false
	 */
	@Override
	public void die() {
		this.alive = false;
		
	}

}
