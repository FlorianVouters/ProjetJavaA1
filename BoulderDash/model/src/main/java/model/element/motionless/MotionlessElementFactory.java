package model.element.motionless;


public class MotionlessElementFactory {
	
	private static int LEVEL;

	/** The Constant background. */
	private static final Background 		Background = new Background();

	/** The Constant border. */
	private static final Border 			Border = new Border();

	/** The Constant exitDoor. */
	private static final ExitDoor 			ExitDoor = new ExitDoor();

	/** The Constant mud. */
	private static final Mud 				Mud = new Mud();

	/** The Constant specialStoneWall. */
	private static final SpecialStoneWall 	SpecialStoneWall = new SpecialStoneWall();

	/** The Constant star. */
	private static final Star 				Star = new Star();

	/** The Constant wall. */
	private static final Wall 				Wall = new Wall();
	
	
	 public static void setLevel(int level){
		 LEVEL = level;
	 }
	
	 public static MotionlessElement createBackground(int level){
		 return null; //will simply return the constant backgroud
	 }
	
	 public static MotionlessElement createBorder(int level){
		 return null; //will simply return the constant border
	 }
	 
	 public static MotionlessElement createExitDoor(int level){
		 return null; //will simply return the constant exitDoor
		 }
	 
	 public static MotionlessElement createMud(int level){
		 return null; //will simply return the constant mud
	 }
	 
	 public static MotionlessElement createSpecialStoneWall(int level){
		 return null; //will simply return the constant specialStoneWall
	 }
	 
	 public static MotionlessElement createStar(int level){
		 return null; //will simply return the constant star
		 }
	 
	 public static MotionlessElement createWall(int level){
		 return null; //will simply return the constant wall
	 }
	 
}
