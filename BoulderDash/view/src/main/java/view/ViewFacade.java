package view;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import controller.IOrderPerformer;
import fr.exia.showboard.BoardFrame;
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

	// Size of the sprites
	private static final int SIZESPRITE = 16;

	// Size of the full screen
	private static final int VIEWSIZE = SIZESPRITE * 15;

	// CloseView of the game (cam)
	private Rectangle closeView;

	// Map of the game
	private IMap map;

	// MainCharacter
	private IMotionfullElement mainCharacter;

	// Position of the main character
	private Point characterPosition;

	// The Order Performer
	private IOrderPerformer orderPerformer;

	private int viewMapX = 15;

	private int viewMapY = 15;

	/**
	 * Instantiates a new view facade.
	 */
	public ViewFacade(final IMap map, final IMotionfullElement character) {
		// this.setView(viewMap); set la camera size , ne sert plus vu qu'on a
		// 2d on use les constantes
		try {
			this.setMap(map);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setMainCharacter(character);
		try {
			this.getMainCharacter().getSprite().loadImage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setCloseView(new Rectangle(0, this.getMainCharacter().getY(), viewMapX, viewMapY));
		SwingUtilities.invokeLater(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see view.IView#displayMessage(java.lang.String)
	 */
	@Override
	public final void displayMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}

	/*
	 * (non-Javadoc)
	 * 
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
		boardFrame.setDimension(
				new Dimension(this.getMap().getWidth() * SIZESPRITE, this.getMap().getHeight() * SIZESPRITE));
		boardFrame.setDisplayFrame(closeView);
		boardFrame.setSize(this.closeView.width * SIZESPRITE, this.closeView.height * SIZESPRITE);
		boardFrame.addKeyListener(this);
		boardFrame.setFocusable(true);
		boardFrame.setFocusTraversalKeysEnabled(false);

		for (int x = 0; x < this.getMap().getWidth(); x++) {
			for (int y = 0; y < this.getMap().getHeight(); y++) {
				boardFrame.addSquare(this.map.getElementByPosition(x, y), x, y);
				}
		}

		boardFrame.addPawn(this.getMainCharacter());

		this.getMap().getObservable().addObserver(boardFrame.getObserver());

		boardFrame.setVisible(true);

	}

	public void show() {
//		// TODO Remplir la fonction show qui ne renvoie rien, mais print les
//		// sprites
//		System.out.println("afficher");
//		int y = yStart % this.getMap().getHeight();
//		for (int view = 0; view < this.getViewMapX(); view++) {
//			for (int x = 0; x < this.getViewMapY(); x++) {
//				if ((x == this.getMainCharacter().getX()) && (y == yStart)) {
//					System.out.print(this.getMainCharacter().getSprite().getConsoleImage());
//				} else {
//					System.out.print(this.getMap().getElementByPosition(x, y).getSprite().getConsoleImage());
//				}
//			}
//			y = (y + 1) % this.getMap().getHeight();
//			System.out.print("\n");
//		}
	}

	@Override
	public void cameraMove() {
		// TODO CameraMove, cette méthode permet de déplacer la vue en fonction
		// des déplacements du personnage
		int x; int y;
        x = (int) this.getCharacterPosition().getX();
        y = (int) this.getCharacterPosition().getY();
        if (x < this.getCloseView().x + 5) {
            this.getCloseView().x--;
        } else if (x > this.getCloseView().x + 10) {
            this.getCloseView().x++;
        }
        if (y < this.getCloseView().y + 4) {
            this.getCloseView().y--;
        } else if (y > this.getCloseView().y + 10) {
            this.getCloseView().y++;
        }
	}

	/**
	 * 
	 * @param keyCode
	 *            Touche entrée
	 * @return
	 */
	private static Order keyCodeToUserOrder(final int keyCode) {
		Order userOrder;
		switch (keyCode) {
		case KeyEvent.VK_RIGHT:
			userOrder = Order.RIGHT;
			break;
		case KeyEvent.VK_LEFT:
			userOrder = Order.LEFT;
			break;
		case KeyEvent.VK_UP:
			userOrder = Order.UP;
			break;
		case KeyEvent.VK_DOWN:
			userOrder = Order.DOWN;
			break;
		default:
			userOrder = Order.NOP;
			break;
		}
		return userOrder;
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
		this.map = map;
		for (int y = 0; y < this.getMap().getHeight(); y++) {
			for (int x = 0; x < this.getMap().getWidth(); x++) {
				this.getMap().getElementByPosition(x, y).getSprite().loadImage();
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

	public int getViewMapX() {
		return viewMapX;
	}

	public void setViewMapX(int viewMapX) {
		this.viewMapX = viewMapX;
	}

	public int getViewMapY() {
		return viewMapY;
	}

	public void setViewMapY(int viewMapY) {
		this.viewMapY = viewMapY;
	}

}
