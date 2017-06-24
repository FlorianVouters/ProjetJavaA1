package view;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.RepaintManager;
import javax.swing.SwingUtilities;

import controller.IOrderPerformer;
import fr.exia.showboard.BoardFrame;
import fr.exia.showboard.IPawn;
import fr.exia.showboard.ISquare;
import model.IElement;
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

	private int mapViewSizeX = 15;

	private int mapViewSizeY = 15;

	/**
	 * Instantiates a new view facade.
	 * 
	 * @throws IOException
	 */
	public ViewFacade(final IMap map, final IMotionfullElement character) throws IOException {
		// this.setView(viewMap); set la camera size , ne sert plus vu qu'on a
		// 2d on use les constantes

		this.setMap(map);

		this.setMainCharacter(character);
		this.getMainCharacter().getSprite().loadImage();
		this.setCloseView(new Rectangle(0, this.getMainCharacter().getY(), mapViewSizeX, mapViewSizeY));
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
		 //nop
	}

	@Override
	public final void keyPressed(final KeyEvent keyEvent) {
        try {
            this.getOrderPerformer().orderPerform(keyCodeToUserOrder(keyEvent.getKeyCode()));
        } catch (final IOException exception) {
            exception.printStackTrace();
        }
    }

	@Override
	public void keyReleased(KeyEvent e) {
		// Nop

	}

	@Override
	public void run() {
		final BoardFrame boardFrame = new BoardFrame("BoulderDash");
		boardFrame.setDimension(new Dimension(this.getMap().getWidth(), this.getMap().getHeight()));
		boardFrame.setDisplayFrame(closeView);
		boardFrame.setSize(this.closeView.width *SIZESPRITE*2, this.closeView.height * SIZESPRITE*2);
		boardFrame.addKeyListener(this);
		boardFrame.setFocusable(true);
		boardFrame.setFocusTraversalKeysEnabled(false);

		for (int x = 0; x < this.getMap().getWidth(); x++) {
			for (int y = 0; y < this.getMap().getHeight(); y++) {
				this.map.getElementByPosition(x, y).setX(x);
				this.map.getElementByPosition(x, y).setY(y);
				
				
				boardFrame.addSquare((ISquare)this.map.getElementByPosition(x, y),x,y);
				//boardFrame.addPawn((IPawn)this.getMap().getElementByPosition(x, y));
				boardFrame.addPawn((IPawn)this.map.getElementByPosition(x, y));
			}
		}

		boardFrame.addPawn(this.getMainCharacter());

		this.getMap().getObservable().addObserver(boardFrame.getObserver());
		

		boardFrame.setVisible(true);

	}

	public void show() {
		// // TODO Remplir la fonction show qui ne renvoie rien, mais print les
		// // sprites
		// System.out.println("afficher");
		// int y = yStart % this.getMap().getHeight();
		// for (int view = 0; view < this.getViewMapX(); view++) {
		// for (int x = 0; x < this.getViewMapY(); x++) {
		// if ((x == this.getMainCharacter().getX()) && (y == yStart)) {
		// System.out.print(this.getMainCharacter().getSprite().getConsoleImage());
		// } else {
		// System.out.print(this.getMap().getElementByPosition(x,
		// y).getSprite().getConsoleImage());
		// }
		// }
		// y = (y + 1) % this.getMap().getHeight();
		// System.out.print("\n");
		// }
	}

	@Override
	public void cameraMove() {
		int x;
		int y;
		x = (int) this.getMainCharacter().getX();
		y = (int) this.getMainCharacter().getY();
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
		return mapViewSizeX;
	}

	public void setViewMapX(int viewMapX) {
		this.mapViewSizeX = viewMapX;
	}

	public int getViewMapY() {
		return mapViewSizeY;
	}

	public void setViewMapY(int viewMapY) {
		this.mapViewSizeY = viewMapY;
	}

}
