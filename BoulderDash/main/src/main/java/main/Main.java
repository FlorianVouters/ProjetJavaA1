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
  
		/*	try {
				map.loadFile("Level1.txt"); //saves the file
			} catch (IOException e) {
				e.printStackTrace();
			} 
		*/
    	
    
    	
    	
    	System.out.println(ElementDAO2.getMapHeight(1));
			System.out.println(ElementDAO2.getMapWidth(1));
			
			char[][] level= ElementDAO2.getMap(1);
			
			for(int x=0; x<48; x++){
				for(int y=0; y<28; y++){
					System.out.print(level[y][x]);
				}
				System.out.println();
			}
			

    	
    	}

}
