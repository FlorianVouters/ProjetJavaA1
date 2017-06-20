package model.element;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Permeabilty;
import model.Sprite;

public class ExampleTest {
	
	private int id;
	private String name;
	private Sprite sprite;
	private Permeabilty permeabilty;
	
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
		final int expected = id;
		assertEquals(expected, this.id.getId());
	}

	@Test
	public String getName() {
		final String expected = name;
		assertEquals(expected, this.name.getName());
	}

	@Test
	public void setName(final String name) {
		final String expected = name;
		this.name.getName();
		assertEquals(expected, this.name.getName());
	}

	@Test
	public Sprite getSprite() {
		Sprite  expected = sprite;
		assertEquals(expected, this.sprite.getSprite());
	}
	
	@Test
	public void setSprite(Sprite sprite){
		final Sprite expected = sprite;
		this.sprite.getSprite();
		assertEquals(expected, this.sprite.getSprite());
	}

	@Test
	public String toString() {
		assertNotNull();
	}

	@Test
	public Permeabilty getPermeability() {
		final Permeabilty expected = permeabilty;
		assertEquals(expected, this.permeabilty.getPermeability());
	}

	@Test
	public void setPermeability(Permeabilty permeability) {
		final Permeabilty expected = permeabilty;
		this.permeabilty.getPermeability();
		assertEquals(expected, this.permeabilty.getPermeability());
	}
}
