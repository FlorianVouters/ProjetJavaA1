package model.element;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Permeabilty;
import model.Sprite;

public class ElementTest {
	
	private int id;
	private String name;
	private Sprite sprite;
	private Permeability permeabilty;
	
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
	public int testGetId() {
		private final expected = id;
		assertEquals(expected, this.id.getId());
	}

	@Test
	public String getName() {
		private final expected = name;
		assertEquals(expected, this.name.getName());
	}

	@Test
	public void setName(final String name) {
		private final expected = name;
		this.name.getName();
		assertEquals(expected, this.name.getName());
	}

	@Test
	public Sprite getSprite() {
		private final expected = sprite;
		assertEquals(expected, this.sprite.getSprite());
	}
	
	@Test
	public void setSprite(Sprite sprite){
		private final expected = sprite;
		this.sprite.getSprite();
		assertEquals(expected, this.sprite.getSprite());
	}

	@Test
	public String toString() {
		assertNotNull();
	}

	@Test
	public Permeabilty getPermeability() {
		private final expected = permeabilty;
		assertEquals(expected, this.permeabilty.getPermeability());
	}

	@Test
	public void setPermeability(Permeabilty permeability) {
		private final expected = permeabilty;
		this.permeabilty.getPermeability();
		assertEquals(expected, this.permeabilty.getPermeability());
	}
}
