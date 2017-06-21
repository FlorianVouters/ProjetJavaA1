package model.element;

import model.IElement;
import model.element.motionfull.MotionfullElementFactory;
import model.element.motionless.MotionlessElementFactory;

public class ElementFactory {

	public static IElement getFromFileSymbol(char c) {
		switch(c){
		
			case 'A':
			case 'D':
			case 'E':
			case 'H':
			case 'P':
			case 'R':
				return MotionfullElementFactory.getFromFileSymbol(c);
			case ' ':
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
