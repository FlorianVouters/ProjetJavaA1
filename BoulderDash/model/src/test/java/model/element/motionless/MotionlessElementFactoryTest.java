package model.element.motionless;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MotionlessElementFactoryTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	private Wall wall;
	private Background background;
	private Border border;
	private ExitDoor exitDoor;
	private Mud mud;
	private SpecialStoneWall stoneWall;
	private Star star;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreateBackground() {
		assertNotNull(background);
	}

	@Test
	public void testCreateBorder() {
		assertNotNull(border);
	}

	@Test
	public void testCreateExitDoor() {
		assertNotNull(exitDoor);
	}

	@Test
	public void testCreateMud() {
		assertNotNull(mud);
	}

	@Test
	public void testCreateSpecialStoneWall() {
		assertNotNull(stoneWall);
	}

	@Test
	public void testCreateStar() {
		assertNotNull(star);
	}

	@Test
	public void testCreateWall() {
		assertNotNull(wall);
	}

}
