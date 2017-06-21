package model.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ElementDAO2 extends AbstractDAO {

	char[][] map;
	public static String saveMapSize = "{call saveMapSize(?,?,?}";
	public static String saveMapElement = "{call saveMapElement(?,?,?,?)";
	public static String mapHeightQuerry = "{call getMapHeight(?)}";
	public static String mapWidthQuerry = "{call getMapWidth(?)}";
	public static String getMap = "{call getElement(?,?,?)}";
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

	public static char[][] getMap(int level) throws SQLException {
		int width = getMapWidth(level);
		int height = getMapHeight(level);
		char[][] map = new char[width][height];
		for(int x=1; x<=width; x++){
			for(int y =1; y<=height; y++){
				CallableStatement callStatement = prepareCall(getMap);
				callStatement.setInt(1, level);
				callStatement.setInt(2, x);
				callStatement.setInt(3, y);
				
				if(callStatement.execute()){
					ResultSet result = callStatement.getResultSet();
					if(result.next()){
					map[x-1][y-1] = result.getString(1).charAt(0);
					}
					result.close();
				}
			}
		}
		return map;
	}

	@Deprecated
	public static void saveMapHeight(int level, int height, int width) throws SQLException{
		CallableStatement callStatement = prepareCall(saveMapSize);
		callStatement.setInt(1, level);
		callStatement.setInt(2, height);
		callStatement.setInt(3, width);
		
		callStatement.execute();
			
	}
	
	@Deprecated
	public static void saveMapElement(int level, int height, int width, char element) throws SQLException{ //doesn't work because it wants a char not a string
		CallableStatement callStatement = prepareCall(saveMapElement);
		
		for(int x= 1; x<=width;x++){
			for(int y =1; y<height; y++){

				callStatement.setInt(1, level);
				callStatement.setInt(2, y);
				callStatement.setInt(3, x);
				String buffer = ""+element;
				callStatement.setString(4, buffer); //there's no method to send a single char
				
				callStatement.execute();
				
			}
		}
		
		
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