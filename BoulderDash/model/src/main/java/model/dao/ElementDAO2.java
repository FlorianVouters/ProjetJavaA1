package model.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ElementDAO2 extends AbstractDAO {

	char[][] map;
	public static String mapHeightQuerry = "{call getMapHeight(?)}";
	public static String mapWidthQuerry = "{call getMapWidth(?)}";
	public static String getMap;
	/*int height;
	int width;*/
	
	public static int getMapHeight(int level) throws SQLException {
		CallableStatement callStatement = prepareCall(mapHeightQuerry);
		callStatement.setInt(1, level);
		int height=0;
		if(callStatement.execute()){
			ResultSet result = callStatement.getResultSet();
			if(result.next()){
			height = result.getInt(1);  // if it break it's probably because of this	
			}
			result.close();
		}
		return height;
	}

	public static int getMapWidth(int level) throws SQLException {
		CallableStatement callStatement = prepareCall(mapWidthQuerry);
		callStatement.setInt(1, level);
		int width=0;
		if(callStatement.execute()){
			ResultSet result = callStatement.getResultSet();
			if(result.next()){
			width = result.getInt(1);  // if it breaks it's probably because of this	
			}
			result.close();
		}
		return width;
	}

	public static char[][] getMap(int level) {
		return null;
	}

	@Deprecated  //only used to push the maps in the database
	public static void saveMap(char[][] map, int level, int height, int width) {
				
		try{
		Connection cn = BoulderDashBDDConnector.getInstance().getConnection();
		Statement st = BoulderDashBDDConnector.getInstance().getStatement();
		
		

			String setNbLigneEtColone ="INSERT INTO `infolevel`(`Level`, `Height`, `Width`) VALUES ("+level+"," + width + ", " + height + ")";
			st.executeUpdate(setNbLigneEtColone);

			for (int i = 0; i < height; i++) {
				for (int j = 0; j < width; j++) {
					String setElement = "INSERT INTO `level`(`levelNum`, `element`, `line`, `column`) VALUES ("+level+",'"
							+ map[j][i] + "', " + (i + 1) + ", " + (j + 1) + ")";
					Statement st2 = cn.createStatement();
					st2.executeUpdate(setElement);
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
