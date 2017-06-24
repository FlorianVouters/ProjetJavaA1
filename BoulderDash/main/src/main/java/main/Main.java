package main;

import java.io.IOException;
import java.sql.SQLException;

import controller.ControllerFacade;
import model.IMotionfullElement;
import model.Map;
import model.ModelFacade;
import model.dao.ElementDAO2;
import model.element.motionfull.MainCharacter;
import view.ViewFacade;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class Main {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 * @throws SQLException
	 * @throws IOException
	 * @throws InterruptedException 
	 */
	public static void main(final String[] args) throws IOException, SQLException, InterruptedException {
		final ModelFacade model = new ModelFacade(1);
		final ViewFacade view = new ViewFacade(model.getMap(), model.getCharacter());
		final ControllerFacade controller = new ControllerFacade(view, model);
		view.setOrderPerformer(controller.getOrderPeformer());

		controller.play();

	}
	
	

}
