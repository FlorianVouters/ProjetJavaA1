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
