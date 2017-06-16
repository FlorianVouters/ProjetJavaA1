package model.element.motionless;


public class MotionlessElementFactory {

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
	
	
	 public static MotionlessElement createBackground(){
		 return null; //will simply return the constant backgroud
	 }
	
	 public static MotionlessElement createBorder(){
		 return null; //will simply return the constant border
	 }
	 
	 public static MotionlessElement createExitDoor(){
		 return null; //will simply return the constant exitDoor
		 }
	 
	 public static MotionlessElement createMud(){
		 return null; //will simply return the constant mud
	 }
	 
	 public static MotionlessElement createSpecialStoneWall(){
		 return null; //will simply return the constant specialStoneWall
	 }
	 
	 public static MotionlessElement createStar(){
		 return null; //will simply return the constant star
		 }
	 
	 public static MotionlessElement createWall(){
		 return null; //will simply return the constant wall
	 }
	 
}
