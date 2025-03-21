<%
session.setAttribute("userid",null);
session.setAttribute("username",null);
session.setAttribute("usermail",null);
session.setAttribute("userpass",null);

response.sendRedirect("index.jsp");
%>