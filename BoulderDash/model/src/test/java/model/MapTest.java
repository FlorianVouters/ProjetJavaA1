package model;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import controller.IController;

public class MapTest {
	
	private int height; //height of the map
	private int width; // width of the map
	
	private Map map;
	
	private Observable observable;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.map = new Map(1);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetHeight() {
		private final int expected = 21;
		assertEquals(expected, this.map.getHeight());
	}

	@Test
	public void testSetHeight() {
		final int expected = 21;
		this.map.setHeight(expected);
		assertEquals(expected, this.map.getHeight());
	}

	@Test
	public void testGetWidth() {
		private final int expected = 40;
		assertEquals(expected, this.map.getWidth);
	}

	@Test
	public void testSetWidth() {
		final int expected = 40;
		this.map.setWidth(expected);
		assertEquals(expected, this.map.getWidth());
	}

	@Test
	public void testGetMap() {
		private final expected = map;
		assertEquals(expected, this.map.getMap());
	}

	@Test
	public void testSetMap() {
		private final expected = map;
		this.map.setMap(expected);
		assertEquals(expected, this.map.getMap());
	}

	@Test
	public void testGetAllElements() {
		private final expected = List<IElement>;
		assertEquals(expected, this.List<IElement>.getAllElements());
	}

	@Test
	public void testGetElementByPosition() {
		private final expected = IElement;
		assertEquals(expected, this.IElement.getElementByPosition());
	}

	@Test
	public void testGetElementByID() {
		private final expected = IElement;
		assertEquals(expected, this.IElement.getElementByID());
	}

	@Test
	public void testGetElementByName() {
		private final expected = IElement;
		assertEquals(expected, this.IElement.getElementByName());
	}

	@Test
	public void testSetMapHasChanged() {
		private final expected = map;
		this.map.setMap(expected);
		assertEquals(expected, this.map.getMap());
	}

	@Test
	public void testGetObservable() {
		private final expected = observable;
		assertEquals(expected, this.observable.getObservable())
	}

}
