package main;

import java.io.IOException;
import java.sql.SQLException;

import controller.ControllerFacade;
import model.Map;
import model.ModelFacade;
import model.dao.ElementDAO2;
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
     */
    public static void main(final String[] args) throws SQLException {
       /* final ControllerFacade controller = new ControllerFacade(new ViewFacade(), new ModelFacade());

        try {
            controller.start();
        } catch (final SQLException exception) {
            exception.printStackTrace();
        }*/
    	Map map = new Map(1);
  
			//map.loadFile("Level1.txt"); //saves the file
			System.out.println(ElementDAO2.getMapHeight(1));
			System.out.println(ElementDAO2.getMapWidth(1));

    	}

}
