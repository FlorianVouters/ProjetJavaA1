package model.dao;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AbstractDAOTest.class, BoulderDashBDDConnectorTest.class, ElementDAO2Test.class })
public class AllTests {

}
