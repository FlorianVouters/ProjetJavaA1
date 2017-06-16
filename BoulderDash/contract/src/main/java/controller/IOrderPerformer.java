package controller;

import java.io.IOException;

import model.Order;



public interface IOrderPerformer {

	 void orderPerform(Order order) throws IOException;
	
}
