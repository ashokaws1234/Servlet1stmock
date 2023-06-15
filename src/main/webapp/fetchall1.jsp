<%@page import="dto.Studentdetails"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<Studentdetails> list=(List<Studentdetails>)request.getAttribute("list");%>
<div>
<table border='1' >
<tr>
<th>ID</th><th>Name</th><th>Mobile</th><th>edit</th><th>delete</th>
</tr>
<%for(Studentdetails std:list)
{%>
<tr>
<td><%=std.getEmpid() %></td>
<td><%=std.getName() %></td>
<td><%=std.getMobile() %></td>
<td><a href="Edit.jsp?id=<%=std.getEmpid() %>"><button> Edit</button></a></td>
<td><a href="delete?id=<%=std.getEmpid()%>"><button> Delete</button></a></td>
</tr>
<%} %>
</table>
</div> 
</body>
</html>