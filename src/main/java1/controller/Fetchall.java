package controller;


import java.io.IOException;

import javax.persistence.Entity;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Studentdao;

@WebServlet("/f")
public class Fetchall extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Studentdao dao=new Studentdao();
		req.setAttribute("list",dao.fetch());
		req.getRequestDispatcher("fetchall1.jsp").include(req, resp);
	}

}