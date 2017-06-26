package controller;

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
		//fail("Not yet implemented");
	}

	@Test
	public void testGetView() {
		//fail("Not yet implemented");
		assertNotNull(controller.getView());
	}

	@Test
	public void testSetView() {
		//fail("Not yet implemented");
		assertNotNull(controller.getView());

	}

	@Test
	public void testGetModel() {
		//fail("Not yet implemented");
		assertNotNull(controller.getModel());
	}

	@Test
	public void testSetModel() {
		controller.setModel(model); // would set the instanciated model
		//fail("Not yet implemented");
		assertNotNull(controller.getModel());
	}

	@Test
	public void testGetOrder() {
		//fail("Not yet implemented");
		assertNotNull(controller.getOrder());
	}

	@Test
	public void testSetOrder() {
		Order expectedOrder = Order.DOWN;
		controller.setOrder(expectedOrder);
		//fail("Not yet implemented");
		assertEquals(expectedOrder, this.order);
		
	}

	@Test
	public void testClearOrder() {
		//fail("Not yet implemented");
		assertEquals(Order.NOP, controller.getOrder());
	}

	@Test
	public void testGetOrderPeformer() {
		//fail("Not yet implemented");
		assertNotNull(controller.getOrderPeformer());
	}

}
