package controller;

import java.io.IOException;
import java.sql.SQLException;

import model.IElement;
import model.IModel;
import model.Order;
import view.IView;

/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ControllerFacade implements IController, IOrderPerformer {

    /** The view. */
    private IView  view;

    /** The model. */
    private IModel model;
    
    /**Order to execute */
    private Order order;
    
    
    private static final int 	speedCharacter = 250;

    /**
     * Instantiates a new controller facade.
     *
     * @param view
     *            the view
     * @param model
     *            the model
     */
    public ControllerFacade(final IView view, final IModel model) {
//        super();
        this.setView(view);
        this.setModel(model);
        this.clearOrder();
    }

    
    
//    public void start() throws SQLException, InterruptedException {
//    	
//    	
//    }
    
    
    /**
     * Beggining of the character thread
     *
     * @throws SQLException
     *             the SQL exception
     * @throws InterruptedException 
     */
    @Override
    public void play() throws SQLException, InterruptedException {
    	int i=0; //TODO suppr
    	while (this.getModel().getCharacter().isAlive()) {
    		Thread.sleep(speedCharacter);
    		
    		//TODO suppr, debug of the map repaint
    		if(i==0)
    		this.setOrder(Order.DOWN);
    		else if(i<3)
    			this.setOrder(Order.RIGHT);
    		//
    		i++;
    		//
    		switch (this.getOrder()) {
    			case UP :
    				System.out.println("go up");
    				this.getModel().getCharacter().moveUp();
    				break;
    			case DOWN :
    				System.out.println("go down");
    				this.getModel().getCharacter().moveDown();
    				break;
    			case RIGHT :
    				System.out.println("go right");
    				this.getModel().getCharacter().moveRight();
    				break;
    			case LEFT :
    				System.out.println("go left");
    				this.getModel().getCharacter().moveLeft();
    			case NOP :
    			default :
    				this.getModel().getCharacter().doNothing();
    				break;	
    		}
    		this.clearOrder();

    		//
    		updateBoard();
    		
    		//
    		
//    		this.getModel().getMap().lookForAndMoveEnemy();
    		this.getModel().getMap().applyPhysics();
    		this.getView().cameraMove();
    	}
    	this.getView().displayMessage("Game Over !");
    }
    

    /**
     * Gets the view.
     *
     * @return the view
     */
    public IView getView() {
        return this.view;
    }
    
    public void setView(IView view){
    	this.view = view;
    }

    /**
     * Gets the model.
     *
     * @return the model
     */
    public IModel getModel() {
        return this.model;
    }
    
    /**
     * Sets the Model
     * 
     * @param model of the game
     */
    public void setModel(IModel model){
    	this.model = model;
    }

    
    /**
     * 	Gets the order
     * 
     * @return an order
     */
	public Order getOrder() {
		return order;
	}
	
	/**
	 * 
	 * @param order
	 * 			Send order to the Setter
	 */
	public void setOrder(Order order) {
		this.order = order;
	}
	
	/**
	 * Clear the order
	 */
	public void clearOrder(){
		this.order = Order.NOP;
	}
	
	/**
	 * 
	 * @param order
	 * 			Send Order to the Setter
	 * @throws IOException
	 */
	@Override
	public void orderPerform(Order order) throws IOException {
		this.setOrder(order);
	}

	/**
	 * Gets the Order Performer who return this control
	 */
	@Override
	public IOrderPerformer getOrderPeformer() {
		return this;
	}
	
	
	//TODO debug of board repaint
	public void updateBoard(){
		
		
		
		//already works-ish by itself
		for (int x = 0; x < this.getModel().getMap().getWidth(); x++) {
			for (int y = 0; y < this.getModel().getMap().getHeight(); y++) {
				this.getView().getBoard().addSquare(this.getModel().getMap().getElementByPosition(x, y),
						this.getModel().getMap().getElementByPosition(x, y).getX(),
						this.getModel().getMap().getElementByPosition(x, y).getY());
				this.getView().getBoard().addPawn(this.getModel().getMap().getElementByPosition(x, y));
				
				
			}
			
		}	
		//yes I know it spawn ConcurentModif ex sometimes but they don't seem to be a great deal and it's the only way I found
		this.getView().getBoard().repaint();
	}
	
	
}