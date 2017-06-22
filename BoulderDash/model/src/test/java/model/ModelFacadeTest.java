package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ModelFacadeTest {

	private Map map;
	
	private IMotionfullElement character;
	
	private ModelFacade model;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		model = new ModelFacade(1);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetMap() {
		Map expected = map;
		assertEquals(expected, this.map.getMap());
	}

	@Test
	public void testGetCharacter() {
		IMotionfullElement expected = character;
		assertEquals(expected, model.getCharacter());
	}

}
