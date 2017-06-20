package model.element.motionfull;

import static org.junit.Assert.*;

import java.awt.Image;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.IMotionfullElement;
import model.Permeabilty;
import model.Sprite;

public class DiamondTest {

	private Diamond diamond;
	private IMotionfullElement x;
	private IMotionfullElement y;
	private Sprite image;

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
	public void testMoveUp() {
		assertNotNull(diamond);
	}

	@Test
	public void testMoveLeft() {
		assertNotNull(diamond);
	}

	@Test
	public void testMoveDown() {
		assertNotNull(diamond);
	}

	@Test
	public void testMoveRight() {
		assertNotNull(diamond);
	}

	@Test
	public void testDoNothing() {
		assertNotNull(diamond);
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
		assertNotNull(diamond);
	}

	@Test
	public void testGetImage() {
		final Sprite expected = image;
		assertEquals(expected, this.image.getImage());
	}
	
	@Test
	public void testFall(){
		assertNotNull(diamond);
	}

	@Test
	public void testDie() {
		assertNotNull(diamond);
	}

}
