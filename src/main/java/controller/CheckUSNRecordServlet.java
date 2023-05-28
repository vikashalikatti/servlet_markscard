package controller;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Admin_dao;
import dto.Admin_dto;

@WebServlet("/CheckUSNRecord")
public class CheckUSNRecordServlet extends HttpServlet {
	Admin_dao studentDAO = new Admin_dao();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String usn = req.getParameter("usn");
		try {
			int usnInt = Integer.parseInt(usn);
			Optional<Admin_dto> studentOpt = studentDAO.findByUSN(usnInt);
			if (studentOpt.isPresent()) {
				Admin_dto student = studentOpt.get();
				req.setAttribute("student", student);
				req.getRequestDispatcher("update.jsp").forward(req, resp);
			} else {
				resp.getWriter().print("<h1>No record found for the given USN.</h1>");
				req.getRequestDispatcher("admin_portal.jsp").include(req, resp);
			}
		} catch (NumberFormatException e) {
			resp.getWriter().print("<h1>Invalid USN format. Please enter a valid number.</h1>");
			req.getRequestDispatcher("admin_portal.jsp").include(req, resp);
		}
	}
}
