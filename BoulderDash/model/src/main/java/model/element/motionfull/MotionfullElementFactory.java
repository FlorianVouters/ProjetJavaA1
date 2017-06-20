package model.element.motionfull;

import model.Map;
import model.element.motionless.MotionlessElement;

public class MotionfullElementFactory {
	
	private static Map MAP;
	
	 /** The Constant character. */
    private static final Character          Character    = new Character(MAP); //must be set before
	
    /** The Constant pointEnemy. */
    private static final PointEnemy         PointEnemy   = new PointEnemy(null);
    
    /** The Constant pointEnemy. */
    private static final DiamondEnemy       DiamondEnemy = new DiamondEnemy(null);
    
    
    public static MotionlessElement createCharacter(){
		 return null; //will simply return the constant character
	 }
    
    public static MotionlessElement createPoint(){
		 return null; //will simply return the constant pointEnemy
	 }
    
    public static MotionlessElement createDiamondEnemy(){
		 return null; //will simply return the constant diamondEnemy
	 }
}
