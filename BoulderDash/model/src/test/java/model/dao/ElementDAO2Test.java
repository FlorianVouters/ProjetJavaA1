package model.dao;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ElementDAO2Test {

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
	public void testGetMapHeight() {
		int height = 40;
		try {
			assertEquals(height, ElementDAO2.getMapHeight(1));
		} catch (SQLException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testGetMapWidth() {
		int width = 44;
		
		try {
			assertEquals(width, ElementDAO2.getMapWidth(1));
		} catch (SQLException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testGetMap() throws SQLException {
		fail("Not yet implemented");
		assertNotNull(ElementDAO2.getMap(1));
	}

}
