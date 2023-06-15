package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Studentdao;
import dto.Studentdetails;

@WebServlet("/signup")
public class Signup extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Studentdetails student = new Studentdetails();
		student.setName(req.getParameter("name"));
		student.setEmpid(Integer.parseInt(req.getParameter("eid")));
		student.setMobile(Long.parseLong(req.getParameter("phone")));
		
		Studentdao dao=new Studentdao();
		dao.save(student);
		
		resp.getWriter().print("<h1> Data Saved Succesfully</h1>");
	
	}
	
}