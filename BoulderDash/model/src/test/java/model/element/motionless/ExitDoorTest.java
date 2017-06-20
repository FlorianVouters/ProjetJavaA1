package model.element.motionless;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Sprite;

public class ExitDoorTest {
	
	private ExitDoor exitDoor;
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
	public void testIsAlive() {
		assertNotNull(exitDoor);
	}

	@Test
	public void testGetImage() {
		final Sprite expected = image;
		assertEquals(expected, this.image.getImage());
	}

}
