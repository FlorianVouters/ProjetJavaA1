package main.java.controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import controller.ControllerFacade;
import model.IModel;
import model.Order;
import view.IView;

public class ControllerFacadeTest {

	/** The view. */
	private IView view;

	/** The model. */
	private IModel model;

	/** Order to execute */
	private Order order = Order.UP;

	private ControllerFacade controller;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		// I'd instanciate a view and a model to use but since we avoid
		// inter-dependencies I can't
		this.controller = new ControllerFacade(view, model);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPlay() {
		// I have no idea what to test here
		
	}

	@Test
	public void testGetView() {
		assertNotNull(controller.getView());
	}

	@Test
	public void testSetView() {
		assertNotNull(controller.getView());

	}

	@Test
	public void testGetModel() {
		assertNotNull(controller.getModel());
	}

	@Test
	public void testSetModel() {
		controller.setModel(model); // would set the instanciated model
		assertNotNull(controller.getModel());
	}

	@Test
	public void testGetOrder() {
		assertNotNull(controller.getOrder());
	}

	@Test
	public void testSetOrder() {
		Order expectedOrder = Order.DOWN;
		controller.setOrder(expectedOrder);
		assertEquals(expectedOrder, this.order);
		
	}

	@Test
	public void testClearOrder() {
		assertEquals(Order.NOP, controller.getOrder());
	}

	@Test
	public void testGetOrderPeformer() {
		assertNotNull(controller.getOrderPeformer());
	}

}
