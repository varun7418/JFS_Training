<%@ page import="java.sql.*" %>
    

%<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%
    
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/projectdb";
        
        Connection conn = DriverManager.getConnection(url, "root", "root");
        out.println("Connection established success...");
        
        
        String usermail= request.getParameter("usermail");
        String userpass = request.getParameter("userpass");
        
        
        String query = "SELECT * FROM users WHERE gmail = ? and userpass = ?;";
        PreparedStatement ps = conn.prepareStatement(query);
        
        ps.setString(1,usermail);
        ps.setString(2,userpass);
        
        ResultSet rs= ps.executeQuery();
        
        if(rs.next()){
        	session.setAttribute("userid",rs.getInt("userid"));
        	session.setAttribute("username",rs.getString("username"));
        	session.setAttribute("usermail",usermail);
        	session.setAttribute("userpass",userpass);
        	
        	response.sendRedirect("Success.jsp");
        	
        }
        
        else{
        	out.println("User Not Found ...");
        	out.println("<a href='index.jsp'>Login</a>");
        
        }
    }

    catch (SQLException e) {
        out.println(e);
    } 
    %>
