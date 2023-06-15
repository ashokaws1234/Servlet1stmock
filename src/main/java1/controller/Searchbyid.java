package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Studentdao;
import dto.Studentdetails;
@WebServlet("/id")
public class Searchbyid extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		Studentdao dao=new Studentdao();
		Studentdetails student;
		student=dao.fetch(id);
		if(student==null)
		{
			resp.getWriter().print("<h1>Invalid id</h1>");
			//req.getRequestDispatcher("Home.html").include(req, resp);
		}
		else if(student.getEmpid()==id){
			resp.getWriter().print("<div>");
			resp.getWriter().print("<table border='1'>"
					+ "<tr>"
					+ "<th>id</th>"
					+ "<th>name</th>"
					+ "<th>mobile</th>"+ "<th>Edit</th>"
					+"<th>delete</th>"
					+ "</tr>"
					+ "<tr>"
					+ "<th>"+student.getEmpid()+"</th>"
					+ "<th>"+student.getName()+"</th>"
					+ "<th>"+student.getMobile()+"</th>"
					+"<th><button>edit</button></th>"
					+"<th><button>Delete</button></th>"
					+ "</tr>");
			resp.getWriter().print("</table></div>");
		}
	}

}
