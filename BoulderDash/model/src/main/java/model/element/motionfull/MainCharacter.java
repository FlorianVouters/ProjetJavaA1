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
	
	private static final BufferedImage MAIN_CHARACTER_LEFT = ImageIO.read(new File("pics/charspritesheet.png")).getSubimage(0, 16, 16, 16);
	
	private static final BufferedImage MAIN_CHARACTER_RIGHT = ImageIO.read(new File("pics/charspritesheet.png")).getSubimage(0, 48, 16, 16);
	
	private static final BufferedImage MAIN_CHARACHTER_DOWN = ImageIO.read(new File("pics/charspritesheet.png")).getSubimage(0, 64, 16, 16);
	
	private static final BufferedImage MAIN_CHARACTER_UP = ImageIO.read(new File("pics/charspritesheet.png")).getSubimage(0, 32, 16, 16);
	
	
	public MainCharacter(Map map){
		super(MAIN_CHARACTER, Permeabilty.BLOCKING, map);
	}

	

	@Override
	public Boolean isAlive() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
		
	}

}
