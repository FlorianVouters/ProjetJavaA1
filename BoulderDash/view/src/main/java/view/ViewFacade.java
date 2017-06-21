package view;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.Map;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import controller.IOrderPerformer;
import fr.exia.showboard.BoardFrame;
import model.IMap;
import model.Order;
//import model.dao.ElementDAO2;
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
	
	private static final int viewMap = 10;
	
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

	private int view;
	
//	Map map = new Map(1);
	
	
    /**
     * Instantiates a new view facade.
     * @throws IOException 
     */
    public ViewFacade(final IMap map, final IMotionfullElement character) throws IOException {
        this.setView(viewMap);
        this.setMap(map);
        this.setMainCharacter(character);
        this.getMainCharacter().getSprite().loadImage('H');
        this.setCloseView(new Rectangle(0, this.getMainCharacter().getY(), this.getMap().getWidth(), viewMap));
        SwingUtilities.invokeLater(this);
      this.setMainCharacter(character);
//      this.getMainCharacter().getSprite().loadImage();
        
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
		final BoardFrame boardFrame = new BoardFrame("Close View");
		boardFrame.setDimension(new Dimension(this.getMap().getWidth() * 16, this.getMap().getHeight() * 16));
		boardFrame.setDisplayFrame(closeView);
		boardFrame.setSize(this.closeView.width * SIZESPRITE, this.closeView.height * SIZESPRITE);
		boardFrame.addKeyListener(this);
		boardFrame.setFocusable(true);
		boardFrame.setFocusTraversalKeysEnabled(false);
		
		for(int x = 0 ; x < this.getMap().getWidth(); x++){
			for(int y = 0; y < this.getMap().getHeight(); y++){
				boardFrame.addSquare(this.map.getElementByPosition(x, y), x, y);
			}
		}
		
		boardFrame.addPawn(this.getMainCharacter());
		
//		this.getMap().getObservable().addObserver(boardFrame.getObserver());
		
		boardFrame.setVisible(true);
	}
	

	public void show(final int yStart) {
		// TODO Remplir la fonction show qui ne renvoie rien, mais print les sprites
		int y = yStart % this.getMap().getHeight();
        for (int view = 0; view < this.getView(); view++) {
            for (int x = 0; x < this.getMap().getWidth(); x++) {
                if ((x == this.getMainCharacter().getX()) && (y == yStart)) {
                    System.out.print(this.getMainCharacter().getSprite().getConsoleImage());
                } else {
                    System.out.print(this.getMap().getElementByPosition(x, y).getSprite().getConsoleImage());
                }
            }
            y = (y + 1) % this.getMap().getHeight();
            System.out.print("\n");
        }		
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

	public void setMap(IMap map) throws IOException {
		char charatereImage;
		this.map = map;
		for (int x = 0; x < this.getMap().getWidth(); x++) {
            for (int y = 0; y < this.getMap().getHeight(); y++) {
                this.getMap().getElementByPosition(x, y).getSprite().loadImage('H');
            }
        }
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
	
	public int getView(){
		return this.view;
	}
	
	public void setView(final int view){
		this.view = view;
	}

}
