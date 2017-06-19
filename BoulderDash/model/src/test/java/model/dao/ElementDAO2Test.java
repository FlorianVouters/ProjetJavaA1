package model.dao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ElementDAO2Test {

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
	public void testGetMapHeight() {
		int height = 40;
		fail("Not yet implemented");
		assertEquals(height, ElementDAO2.getMapHeight(1));
	}

	@Test
	public void testGetMapWidth() {
		int width = 44;
		fail("Not yet implemented");
		assertEquals(width, ElementDAO2.getMapWidth(1));
	}

	@Test
	public void testGetMap() {
		fail("Not yet implemented");
		assertNotNull(ElementDAO2.getMap(1));
	}

}
