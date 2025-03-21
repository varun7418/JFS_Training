package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Practice2 {

	public static void main(String[] args) {
		String query = "DELETE FROM users WHERE userid = ? ;";
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb", "root", "root");
			System.out.println("Connection established success...");
			
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1,1007);
			
			int rows = ps.executeUpdate();
			System.out.println( rows + " column(s) affected");			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}