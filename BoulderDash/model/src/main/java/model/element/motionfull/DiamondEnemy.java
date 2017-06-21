package model.element.motionfull;

import model.Map;
import model.Sprite;

public class DiamondEnemy extends Enemy{
	
	private static final Sprite DIAMOND_ENEMY = new Sprite('E');
	
	public DiamondEnemy(Map map) {
		super(DIAMOND_ENEMY, map);
	}

	public void die(){

		
		// spawn diamond
	}


}
