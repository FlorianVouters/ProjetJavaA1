package model.element.motionfull;

import static org.junit.Assert.*;

import java.awt.Image;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Permeabilty;
import model.Sprite;

public class CharacterTest {
	
	private int id;
	private String name;
	private Sprite sprite;
	private Permeabilty permeability;
	private Character character;
	private int x;
	private int y;
	private Image image;

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
		final int expected = id;
		assertEquals(expected, this.id.getId());
	}

	@Test
	public void testGetName() {
		final String expected = name;
		assertEquals(expected, this.name.getName());
	}

	@Test
	public void testSetName() {
		final String expected = name;
		this.name.getName();
		assertEquals(expected, this.name.getName());
	}

	@Test
	public void testGetSprite() {
		final Sprite expected = sprite;
		assertEquals(expected, this.sprite.getSprite());
	}

	@Test
	public void testGetPermeability() {
		final Permeabilty expected = permeability;
		assertEquals(expected, this.permeability.getPermeability());
	}

	@Test
	public void testMoveUp() {
		assertNotNull(character);
	}

	@Test
	public void testMoveLeft() {
		assertNotNull(character);
	}

	@Test
	public void testMoveDown() {
		assertNotNull(character);
	}

	@Test
	public void testMoveRight() {
		assertNotNull(character);
	}

	@Test
	public void testDoNothing() {
		assertNotNull(character);
	}

	@Test
	public void testGetX() {
		final int expected = x;
		assertEquals(expected, this.x.getX());
	}

	@Test
	public void testGetY() {
		final int expected = y;
		assertEquals(expected, this.y.getY());
	}

	@Test
	public void testGetPosition() {
		final int expected = x;
		assertEquals(expected, this.x.getX());
		final int expected2 = y;
		assertEquals(expected2, this.y.getY());
	}

	@Test
	public void testCharacter() {
		assertNotNull(character);
	}

	@Test
	public void testIsAlive() {
		assertNotNull(character);
	}

	@Test
	public void testGetImage() {
		final Image expected = image;
		assertEquals(expected, this.image.getImage());
	}

	@Test
	public void testDie() {
		assertNotNull(character);
	}

}
