package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class practice5 {
	public static void main(String[] args){
		String query ="SELECT* FROM users";
		
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb", "root", "root");
			System.out.println("Connection Success....");
			
			Statement st = con.createStatement();
			ResultSet rs= st.executeQuery(query);
			java.sql.ResultSetMetaData meta = rs.getMetaData();
			
			System.out.println(meta.getColumnCount());
			System.out.println(meta.getColumnName(1));
			System.out.println(meta.getColumnType(1));
			System.out.println(meta.getTableName(1));

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
