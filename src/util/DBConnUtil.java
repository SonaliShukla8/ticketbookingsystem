package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnUtil {

	public static Connection getDBConnection(String cString) {
		Connection con =null;
		try {
			String className = DBPropertyUtil.getClassName("resources\\\\application.properties");
			Class.forName(className);
			con = DriverManager.getConnection(cString,"root","Sonali@12345");
		} catch (SQLException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		return con;

	}
}