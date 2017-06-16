package view;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

import controller.IOrderPerformer;
import model.IMap;
import model.Order;
import model.IMotionfullElement;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacade implements IView, Runnable, KeyListener {

	//Size of the sprites
	private static final int 		SIZESPRITE = 16;
	
	//Size of the full screen
	private static final int		VIEWSIZE = SIZESPRITE * 15;

	//CloseView of the game
	private Rectangle        		closeView;
	
	//Map of the game 
	private IMap 					map;
	
	//MainCharacter
	private IMotionfullElement 		mainCharacter;
	
	//Position of the main character 
	private Point					characterPosition;
	
	//The Order Performer
	private IOrderPerformer			orderPerformer;
	
	
	
    /**
     * Instantiates a new view facade.
     */
    public ViewFacade() {
        super();
    }

    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    /*
     * (non-Javadoc)
     * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
     */
	@Override
	public void keyTyped(KeyEvent e) {
		// Nope
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Remplir la méthode concernant la pression des touches
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// Nope
		
	}

	@Override
	public void run() {
		// TODO Fonction run de la vue, c'est le thread de l'IHM
		
	}
	

	public void show() {
		// TODO Remplir la fonction show qui ne renvoie rien, mais print les sprites
	}

	@Override
	public void cameraMove() {
		// TODO CameraMove, cette méthode permet de déplacer la vue en fonction des déplacements du personnage
		
	}
	
	/**
	 * 
	 * @param keyCode Touche entrée
	 * @return
	 */
    private static Order keyCodeToUserOrder(final int keyCode) {
        return null;
    }
    
	public Rectangle getCloseView() {
		return closeView;
	}

	public void setCloseView(Rectangle closeView) {
		this.closeView = closeView;
	}

	public IMap getMap() {
		return map;
	}

	public void setMap(IMap map) {
		this.map = map;
	}

	public IMotionfullElement getMainCharacter() {
		return mainCharacter;
	}

	public void setMainCharacter(IMotionfullElement mainCharacter) {
		this.mainCharacter = mainCharacter;
	}

	public Point getCharacterPosition() {
		return characterPosition;
	}

	public void setCharacterPosition(Point characterPosition) {
		this.characterPosition = characterPosition;
	}

	public IOrderPerformer getOrderPerformer() {
		return orderPerformer;
	}

	public void setOrderPerformer(IOrderPerformer orderPerformer) {
		this.orderPerformer = orderPerformer;
	}

}
