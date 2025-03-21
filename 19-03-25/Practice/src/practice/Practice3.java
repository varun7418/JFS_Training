package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Practice3 {

	public static void main(String[] args) {
		String query = "UPDATE users SET username =? , gmail = ? ,userpass= ? WHERE userid =? ";
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb", "root", "root");
			System.out.println("Connection established success...");
			
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,"priya_sharmila");
			ps.setString(2,"priya.sharma12@gmail.com");
			ps.setString(3,"password665");
			ps.setInt(4, 1001);
			
			
			int rows = ps.executeUpdate();
			System.out.println( rows + " column(s) affected");			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}