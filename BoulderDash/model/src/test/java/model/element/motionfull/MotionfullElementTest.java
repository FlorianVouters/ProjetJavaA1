package model.element.motionfull;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.IMotionfullElement;

public class MotionfullElementTest {

	private IMotionfullElement x;
	private IMotionfullElement y;
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
	public void testMoveUp() {
		final int expected = yDimension;
		yDimension--;
		fail("Not yet implemented");
		assertEquals(expected, this.y.getY());
	}

	@Test
	public void testMoveLeft() {
		final int expected = xDimension;
		xDimension--;
		fail("Not yet implemented");
		assertEquals(expected, this.x.getX());
	}

	@Test
	public void testMoveDown() {
		final int expected = yDimension;
		yDimension++;
		fail("Not yet implemented");
		assertEquals(expected, this.y.getY());
	}

	@Test
	public void testMoveRight() {
		final int expected = xDimension;
		xDimension++;
		fail("Not yet implemented");
		assertEquals(expected, this.x.getX());
	}

	@Test
	public void testDoNothing() {
		final int expected = xDimension;
		final int expected2 = yDimension;
		fail("Not yet implemented");
		assertEquals(expected, this.x.getX());
		assertEquals(expected2, this.y.getY());
	}

	@Test
	public void testGetX() {
		final IMotionfullElement expected = x;
		fail("Not yet implemented");
		assertEquals(expected, this.x.getX());
	}

	@Test
	public void testGetY() {
		final IMotionfullElement expected = y;
		fail("Not yet implemented");
		assertEquals(expected, this.y.getY());
	}

	@Test
	public void testGetPosition() {
		final IMotionfullElement expected = x;
		final IMotionfullElement expected2 = y;
		fail("Not yet implemented");
		assertEquals(expected, this.x.getX());
		assertEquals(expected2, this.y.getY());
	}

}
