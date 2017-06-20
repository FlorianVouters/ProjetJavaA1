package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ModelFacadeTest {

	private Map map;
	
	private IModel character;
	
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
		Map expected = map;
		fail("Not yet implemented");
		assertEquals(expected, this.map.getMap());
	}

	@Test
	public void testGetCharacter() {
		IModel expected = character;
		fail("Not yet implemented");
		assertEquals(expected, this.character.getCharacter());
	}

}
