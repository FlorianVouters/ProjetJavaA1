package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ModelFacadeTest {

	private Map map;
	
	private IMotionFullElement character;
	
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
	public void testGetMap() {
		private final expected = map;
		assertEquals(expected, this.map.getMap());
	}

	@Test
	public void testGetCharacter() {
		private final expected = character;
		assertEquals(expected, this.character.getCharacter());
	}

}
