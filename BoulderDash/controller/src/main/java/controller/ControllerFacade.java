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
    	// TODO Rempir la méthode play
    	while (this.getModel().getCharacter().isAlive()) {
    		Thread.sleep(speedCharacter);
    		switch (this.getOrder()) {
    			case UP :
    				this.getModel().getCharacter().moveUp();
    				break;
    			case DOWN :
    				this.getModel().getCharacter().moveDown();
    				break;
    			case RIGHT :
    				this.getModel().getCharacter().moveRight();
    				break;
    			case LEFT :
    				this.getModel().getCharacter().moveLeft();
    			case NOP :
    			default :
    				this.getModel().getCharacter().doNothing();
    				break;	
    		}
    		this.clearOrder();
    		this.getModel().getMap().lookForAndMoveEnemy();
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
		// TODO Auto-generated method stub
		return this;
	}
}
