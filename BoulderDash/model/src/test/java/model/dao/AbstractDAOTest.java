package model.dao;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AbstractDAOTest {

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
	public void testExecuteQuery() {
		String query = "SELECT * FROM example";
	//	fail("Not yet implemented");
		assertNotNull(BoulderDashBDDConnector.getInstance().executeQuery(query));
		
	}

	@Test
	public void testExecuteUpdate() {
		String query = "DELETE FROM `example` WHERE `example`.`id` = 5";
		String query2 = "INSERT INTO `example`(`id`, `name`) VALUES (5,'exemple5')";
		String query3 = "SELECT * FROM example WHERE example.id = 5";
	//	fail("Not yet implemented");
		BoulderDashBDDConnector.getInstance().executeUpdate(query);
		BoulderDashBDDConnector.getInstance().executeUpdate(query2);
		assertNotNull(BoulderDashBDDConnector.getInstance().executeQuery(query3));
	}

	@Test
	public void testPrepareCall() {
		int height = 28;
	//	fail("Not yet implemented");
		try {
			assertEquals(height, ElementDAO2.getMapHeight(1));
		} catch (SQLException e) {
					
			//I don't know what to compare the exception message to since it will depend
		}
	}

}
