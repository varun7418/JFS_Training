package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class practice4 {
	public static void main(String [] args){
		String url="jdbc:mysql://localhost:3306/projectdb";
		String query ="SELECT * FROM users WHERE userid= ?";
		
		try {
			Connection con = DriverManager.getConnection(url, "root", "root");
			System.out.println("Connection established Successfully....");
			
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, 1004);
			
			ResultSet  rs = ps.executeQuery();
			while(rs.next()){
				System.out.println(rs.getInt("userid") + " " 
			            + rs.getString("username")+ " "+
						rs.getString("gmail") + " " +
			            rs.getString("userpass"));
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		
		}
	}

	}
