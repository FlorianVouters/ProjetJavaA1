package model.element.motionfull;

import model.Map;
import model.Sprite;

public class DiamondEnemy extends Enemy{
	
	private static final Sprite DIAMOND = new Sprite('D', 1);
	
	public DiamondEnemy(Sprite sprite, Map map) {
		super(sprite, map);
	}

	public void die(){

		
		// spawn diamond
	}


}
