package controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Admin_dao;
import dto.Admin_dto;

@WebServlet("/StudentLogin")
public class CheckMarksCard extends HttpServlet {
	Admin_dao studentDAO = new Admin_dao();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int usn = Integer.parseInt(req.getParameter("usn"));
			Date dob = Date.valueOf(req.getParameter("dob"));

			Admin_dto student = studentDAO.find(usn, dob);
			if (student != null) {
				req.setAttribute("student", student);
				req.getRequestDispatcher("markscard.jsp").forward(req, resp);
			}
		} catch (Exception e) {
			resp.getWriter().print("<h1>No mark card available for the provided USN or Date of Birth.</h1>");
			req.getRequestDispatcher("student_login.html").include(req, resp);
		}
	}
}
