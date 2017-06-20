package model;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Observable;

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
	private int List;
	private IElement[][] sizeMap;
	private IElement element;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.map = new Map(List);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetHeight() {
		final int expected = 21;
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
		final int expected = 40;
		assertEquals(expected, this.map.getWidth());
	}

	@Test
	public void testSetWidth() {
		final int expected = 40;
		this.map.setWidth(expected);
		assertEquals(expected, this.map.getWidth());
	}

	@Test
	public void testGetMap() {
		final Map expected = map;
		assertEquals(expected, this.map.getMap());
	}

	@Test
	public void testSetMap() {
		final Map expected = map;
		this.map.setMap(sizeMap);
		assertEquals(expected, this.map.getMap());
	}

	@Test
	public void testGetAllElements() {
		IElement expected = element;
		assertEquals(expected, this.element.getAllElements());
	}

	@Test
	public void testGetElementByPosition() {
		IElement expected = element;
		assertEquals(expected, this.element.getElementByPosition());
	}

	@Test
	public void testGetElementByID() {
		IElement expected = element;
		assertEquals(expected, this.element.getElementByID());
	}

	@Test
	public void testGetElementByName() {
		IElement expected = element;
		assertEquals(expected, this.element.getElementByName());
	}

	@Test
	public void testSetMapHasChanged() {
		final Map expected = map;
		this.map.setMap(sizeMap);
		assertEquals(expected, this.map.getMap());
	}

	@Test
	public void testGetObservable() {
		Observable expected = observable;
		assertEquals(expected, ((Map) this.observable).getObservable());
	}

}
