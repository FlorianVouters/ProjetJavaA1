package model.element.motionfull;

import model.Sprite;

public class Amoeba extends Enemy{

	private static final Sprite AMOEBA = new Sprite('A');

	
	public Amoeba(Sprite sprite) {
		super(sprite);
		// TODO Auto-generated constructor stub
	}

	int timer; //multiply at some point and turns into a rock at the end
	
	public void kill(){
		//turn any enemy into 9 diamonds
	}
	
	public void die(){
		//if surrounded by four rocks turns into diamond
	}
	
	public void multiply(){
		//multiplies at random moments
	}
}
