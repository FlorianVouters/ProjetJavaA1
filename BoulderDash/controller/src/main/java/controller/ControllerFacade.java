package controller;

import java.sql.SQLException;
import java.util.List;

import model.Example;
import model.IModel;
import model.Order;
import view.IView;

/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ControllerFacade implements IController {

    /** The view. */
    private IView  view;

    /** The model. */
    private IModel model;
    
    /**Order to execute */
    private Order order;

    /**
     * Instantiates a new controller facade.
     *
     * @param view
     *            the view
     * @param model
     *            the model
     */
    public ControllerFacade(final IView view, final IModel model) {
        super();
        this.view = view;
        this.model = model;
    }

    
    
    /**
     * Start.
     *
     * @throws SQLException
     *             the SQL exception
     */
    @Override
    public void play() throws SQLException {
    	// TODO Auto-generated method stub
    	
    }
    
    
   //	actually is the play method
   
    public void start() throws SQLException {
      
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
    
    public void setModel(IModel model){
    	this.model = model;
    }

    
    
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	public void clearOrder(){
		
	}


	@Override
	public IOrderPerformer getOrderPeformer() {
		// TODO Auto-generated method stub
		return null;
	}
}