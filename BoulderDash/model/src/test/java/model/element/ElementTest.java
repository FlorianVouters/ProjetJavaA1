package model.element;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Example;
import model.IElement;
import model.Permeabilty;
import model.Sprite;

public class ElementTest {
	
	private Example id;
	private Example name;
	private IElement sprite;
	private IElement permeabilty;
	private String string;
	
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
	public void testGetId() {
		final Example expected = id;
		fail("Not yet implemented");
		assertEquals(expected, this.id.getId());
	}

	@Test
	public void testGetName() {
		final Example expected = name;
		fail("Not yet implemented");
		assertEquals(expected, this.name.getName());
	}

	@Test
	public void testSetName(final String name) {
		final String expected = name;
		this.name.getName();
		fail("Not yet implemented");
		assertEquals(expected, this.name.getName());
	}

	@Test
	public void testGetSprite() {
		IElement  expected = sprite;
		fail("Not yet implemented");
		assertEquals(expected, this.sprite.getSprite());
	}
	
	@Test
	public void testSetSprite(Sprite sprite){
		final Sprite expected = sprite;
		this.sprite.getSprite();
		fail("Not yet implemented");
		assertEquals(expected, this.sprite.getSprite());
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
		assertNotNull(string);
	}

	@Test
	public void testGetPermeability() {
		final IElement expected = permeabilty;
		fail("Not yet implemented");
		assertEquals(expected, this.permeabilty.getPermeability());
	}

	@Test
	public void testSetPermeability(Permeabilty permeability) {
		final IElement expected = permeabilty;
		this.permeabilty.getPermeability();
		fail("Not yet implemented");
		assertEquals(expected, this.permeabilty.getPermeability());
	}
}
