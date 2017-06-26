package model.element;

import model.IElement;
import model.element.motionfull.MotionfullElementFactory;
import model.element.motionless.MotionlessElementFactory;

public class ElementFactory {

	/**
	 * Creates the wanted element
	 * @param c the char identifying the element
	 * @return the corresponding element
	 */
	public static IElement getFromFileSymbol(char c) {
		switch(c){
		
			case 'A':
			case 'D':
			case 'E':
			case 'H':
			case 'P':
			case 'O':
				return MotionfullElementFactory.getFromFileSymbol(c);
			case '_':
			case '|':
			case 'X':
			case 'M':
			case 'S':
			case '*':
			case 'W':
				return MotionlessElementFactory.getFromFileSymbol(c);
			
			default: return null; 
					
				
		}
	}

}
