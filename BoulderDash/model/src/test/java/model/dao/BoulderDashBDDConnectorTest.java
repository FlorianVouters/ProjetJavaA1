package model.dao;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BoulderDashBDDConnectorTest {

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
	public void testGetInstance() {
	//	fail("Not yet implemented");
		assertNotNull(BoulderDashBDDConnector.getInstance());
	}

	@Test
	public void testExecuteQuery() {
		String query = "SELECT * FROM example";
		// fail("Not yet implemented");
		assertNotNull(BoulderDashBDDConnector.getInstance().executeQuery(query));

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

	@Test
	public void testExecuteUpdate() {
		String query = "DELETE FROM `example` WHERE `example`.`id` = 5";
		String query2 = "INSERT INTO `example`(`id`, `name`) VALUES (5,'exemple5')";
		String query3 = "SELECT * FROM example WHERE example.id = 5";
		// fail("Not yet implemented");
		BoulderDashBDDConnector.getInstance().executeUpdate(query);
		BoulderDashBDDConnector.getInstance().executeUpdate(query2);
		assertNotNull(BoulderDashBDDConnector.getInstance().executeQuery(query3));
	}

	@Test
	public void testGetConnection() {
	//	fail("Not yet implemented");
		assertNotNull(BoulderDashBDDConnector.getInstance().getConnection());
	}

	@Test
	public void testSetConnection() {
		try {
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost/JavaProject?useSSL=false&serverTimezone=UTC",
					"root",
			         "0000");
			//fail("Not yet implemented");
			BoulderDashBDDConnector.getInstance().setConnection(connection);
			assertNotNull(BoulderDashBDDConnector.getInstance().getConnection());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetStatement() {
		//fail("Not yet implemented");
		assertNotNull(BoulderDashBDDConnector.getInstance().getStatement());
	}

	@Test
	public void testSetStatement() {
		//fail("Not yet implemented");
		try {
			Statement statement = BoulderDashBDDConnector.getInstance().getConnection().createStatement();
			BoulderDashBDDConnector.getInstance().setStatement(statement);
			assertNotNull(BoulderDashBDDConnector.getInstance().getStatement());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
