package model.element.motionfull;

import java.awt.Image;
import java.awt.Point;

import model.IDestructible;
import model.Map;
import model.Permeabilty;
import model.Sprite;

public class MainCharacter extends MotionfullElement implements IDestructible{

	private static final Sprite MAIN_CHARACTER = new Sprite('H');
	
	
	public MainCharacter(Map map){
		super(MAIN_CHARACTER, Permeabilty.BLOCKING, map);
	}

	

	@Override
	public Boolean isAlive() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void die() {
		// TODO Auto-generated method stub
		
	}

}
