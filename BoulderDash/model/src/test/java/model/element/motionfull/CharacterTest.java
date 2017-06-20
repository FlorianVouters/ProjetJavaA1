package model.element.motionfull;

import static org.junit.Assert.*;

import java.awt.Image;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Example;
import model.IElement;
import model.IMotionfullElement;
import model.Permeabilty;
import model.Sprite;

public class CharacterTest {
	
	private Example id;
	private Example name;
	private IElement sprite;
	private IElement permeability;
	private Character character;
	private IMotionfullElement x;
	private IMotionfullElement y;
	private Sprite image;
	private int xDimension;
	private int yDimension;

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
		assertEquals(expected, this.id.getId());
	}

	@Test
	public void testGetName() {
		final Example expected = name;
		assertEquals(expected, this.name.getName());
	}

	@Test
	public void testSetName() {
		final Example expected = name;
		this.name.getName();
		assertEquals(expected, this.name.getName());
	}

	@Test
	public void testGetSprite() {
		final IElement expected = sprite;
		assertEquals(expected, this.sprite.getSprite());
	}

	@Test
	public void testGetPermeability() {
		final IElement expected = permeability;
		assertEquals(expected, this.permeability.getPermeability());
	}

	@Test
	public void testMoveUp() {
		final int expected = yDimension;
		yDimension--;
		assertEquals(expected, this.y.getY());
	}

	@Test
	public void testMoveLeft() {
		final int expected = xDimension;
		xDimension--;
		assertEquals(expected, this.x.getX());
	}

	@Test
	public void testMoveDown() {
		final int expected = yDimension;
		yDimension++;
		assertEquals(expected, this.y.getY());
	}

	@Test
	public void testMoveRight() {
		final int expected = xDimension;
		xDimension++;
		assertEquals(expected, this.x.getX());
	}

	@Test
	public void testDoNothing() {
		final int expected = xDimension;
		final int expected2 = yDimension;
		assertEquals(expected, this.x.getX());
		assertEquals(expected2, this.y.getY());
	}

	@Test
	public void testGetX() {
		final IMotionfullElement expected = x;
		assertEquals(expected, this.x.getX());
	}

	@Test
	public void testGetY() {
		final IMotionfullElement expected = y;
		assertEquals(expected, this.y.getY());
	}

	@Test
	public void testGetPosition() {
		final IMotionfullElement expected = x;
		assertEquals(expected, this.x.getX());
		final IMotionfullElement expected2 = y;
		assertEquals(expected2, this.y.getY());
	}

	@Test
	public void testIsAlive() {
		assertNotNull(character);
	}

	@Test
	public void testGetImage() {
		final Sprite expected = image;
		assertEquals(expected, this.image.getImage());
	}

	@Test
	public void testDie() {
		//Unknown implementation yet
	}

}
