package model.element.motionfull;

import model.Map;


public class MotionfullElementFactory {
	
	private static Map MAP;
	
	 /** The Constant character. */
    private static final MainCharacter          Character    = new MainCharacter(MAP); //must be set before
	
    /** The Constant pointEnemy. */
    private static final PointEnemy         PointEnemy   = new PointEnemy(MAP);
    
    /** The Constant pointEnemy. */
    private static final DiamondEnemy       DiamondEnemy = new DiamondEnemy(MAP);
    
    public static void setMap(Map map){
    	MAP = map;
    }
    
    public static MotionfullElement createCharacter(Map map){
    	setMap(map);
		return Character;
	 }
    
    public static MotionfullElement createPoint(Map map){
    	setMap(map);
		return PointEnemy;
	 }
    
    public static MotionfullElement createDiamondEnemy(Map map){
    	setMap(map);
		return DiamondEnemy;
	 }
}
