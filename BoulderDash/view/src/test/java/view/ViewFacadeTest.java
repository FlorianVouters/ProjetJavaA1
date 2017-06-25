package view;

import static org.junit.Assert.*;

import java.awt.event.KeyEvent;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.IModel;
import model.Order;
import view.IView;
import view.ViewFacade;

public class ViewFacadeTest {
	
	private IView interView;
	
	private IModel interModel;
	
	private Order order = Order.UP;
	
	private ViewFacade view;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDisplayMessage() {
		String expectedString = "Test of the display method";
		view.displayMessage(expectedString);
		fail("Not yet implemented");
		assertEquals(expectedString, "Test of the display method");
	}

	@Test
	public void testKeyTyped() {
		int expectedKeyEvent = KeyEvent.VK_RIGHT;
		fail("Not yet implemented");
		assertEquals(expectedKeyEvent, Order.RIGHT);
	}

	@Test
	public void testKeyPressed() {
		int expectedKeyEvent = KeyEvent.VK_RIGHT;
//		view.keyTyped(expectedOrder);  TODO
		fail("Not yet implemented");
		assertEquals(expectedKeyEvent, Order.RIGHT);
	}

	@Test
	public void testKeyReleased() {
		int expectedKeyEvent = KeyEvent.VK_RIGHT;
//		view.keyTyped(expectedOrder);    TODO
		fail("Not yet implemented");
		assertEquals(expectedKeyEvent, Order.RIGHT);
	}

	@Test
	public void testRun() {
		//I don't know what i need to test here
		fail("Not yet implemented");
	}

	@Test
	public void testShow() {
		// I don't know what i need to test here
		fail("Not yet implemented");
	}

	@Test
	public void testCameraMove() {
		int y = 2; int x = 3;
		view.getCharacterPosition().y = y;
		view.getCharacterPosition().x = x;
		fail("Not yet implemented");
		assertEquals(y, view.getCloseView().y);
		assertEquals(x, view.getCloseView().x);
	}

	@Test
	public void testGetCloseView() {
		fail("Not yet implemented");
		assertNotNull(view.getCloseView());
	}

	@Test
	public void testSetCloseView() {
		fail("Not yet implemented");
		assertNotNull(view.getCloseView());
	}

	@Test
	public void testGetMap() {
		fail("Not yet implemented");
		assertNotNull(view.getMap());
	}

	@Test
	public void testSetMap() {
		fail("Not yet implemented");
		assertNotNull(view.getMap());
	}

	@Test
	public void testGetMainCharacter() {
		fail("Not yet implemented");
		assertNotNull(view.getMainCharacter());
	}

	@Test
	public void testSetMainCharacter() {
		fail("Not yet implemented");
		assertNotNull(view.getMainCharacter());
	}

	@Test
	public void testGetCharacterPosition() {
		fail("Not yet implemented");
		assertNotNull(view.getCharacterPosition());
	}

	@Test
	public void testSetCharacterPosition() {
		fail("Not yet implemented");
		assertNotNull(view.getCharacterPosition());
	}

	@Test
	public void testGetOrderPerformer() {
		fail("Not yet implemented");
		assertNotNull(view.getOrderPerformer());
	}

	@Test
	public void testSetOrderPerformer() {
		fail("Not yet implemented");
		assertNotNull(view.getOrderPerformer());
	}

}
