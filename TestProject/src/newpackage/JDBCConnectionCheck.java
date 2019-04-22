package newpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionCheck {

	public static final String CRSTATUS = "select * from CRSTATUS"; 
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection c = DriverManager.getConnection("jdbc:oracle:thin:@camvlcpt1cn.netcracker.com:1521/CPT1.WORLD", "cpt","cpt");
		PreparedStatement s = c.prepareStatement(JDBCConnectionCheck.CRSTATUS);
		
		
		ResultSet rs = s.executeQuery();
		while (rs.next()){
			
			System.out.println("Status : " + rs.getString("STATUS"));
		}
	}

}
