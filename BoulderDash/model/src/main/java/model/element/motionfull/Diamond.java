package model.element.motionfull;

import java.awt.Image;
import java.awt.Point;

import model.IDestructible;
import model.Map;
import model.Permeabilty;
import model.Sprite;


public class Diamond extends MotionfullElement implements IGravitable, IDestructible{

	private static final Sprite DIAMOND = new Sprite('D');

	
	public Diamond(Map map) {
		super(DIAMOND, Permeabilty.BLOCKING, map);
	}



	@Override
	public Boolean isAlive() {
		return this.alive;
	}

	

	@Override
	public void fall() {
		// TODO Auto-generated method stub
		
	}
	
	public void die(){
		this.alive=false;
		this.getMap().setObjective(this.getMap().getObjective()-1);
	}

}
