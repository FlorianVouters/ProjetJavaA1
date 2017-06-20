package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.element.motionfull.MotionfullElement;

public class ModelFacadeTest {

	private Map map;
	
	private MotionfullElement character;
	
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
		assertEquals(expected, this.map.getMap());
	}

	@Test
	public void testGetCharacter() {
		MotionfullElement expected = character;
		assertEquals(expected, this.character.getCharacter());
	}

}
