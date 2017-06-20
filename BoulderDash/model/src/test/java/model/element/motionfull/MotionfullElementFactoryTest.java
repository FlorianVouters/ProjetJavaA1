package model.element.motionfull;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MotionfullElementFactoryTest {

	private DiamondEnemy diamondEnemy;
	private PointEnemy pointEnemy;
	private Character character;
	
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
	public void testCreateCharacter() {
		assertNotNull(character);
	}

	@Test
	public void testCreatePoint() {
		assertNotNull(pointEnemy);
	}

	@Test
	public void testCreateDiamondEnemy() {
		assertNotNull(diamondEnemy);
	}

}
