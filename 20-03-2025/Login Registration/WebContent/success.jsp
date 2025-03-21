<%
if(session.getAttribute("userid")!= null){
	out.println("Welcome Back "+ session.getAttribute("username"));
}
else{
	out.println("Session expired...");
	}
	%>
	<a href='logout.jsp'>Logout</a>