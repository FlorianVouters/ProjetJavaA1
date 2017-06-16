package model.element.motionfull;

import model.element.motionless.MotionlessElement;

public class MotionfullElementFactory {

	 /** The Constant character. */
    private static final Character          Character    = new Character();
	
    /** The Constant pointEnemy. */
    private static final PointEnemy         PointEnemy   = new PointEnemy();
    
    /** The Constant pointEnemy. */
    private static final DiamondEnemy       DiamondEnemy = new DiamondEnemy();
    
    
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
