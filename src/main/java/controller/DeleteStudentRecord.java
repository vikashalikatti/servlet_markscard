package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Admin_dao;

@WebServlet("/DeleteStudentRecord")
public class DeleteStudentRecord extends HttpServlet {
	Admin_dao studentDAO = new Admin_dao();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int usn = Integer.parseInt(req.getParameter("usn"));
		if (studentDAO.check(usn) != null) {
			studentDAO.deleteByUSN(usn);
			resp.getWriter().print("<h1>Record Deleted Sucessfully</h1>");
		}else {
			resp.getWriter().print("<h1>No Record Found in the Given USN</h1>");
		}
		req.getRequestDispatcher("admin_portal.jsp").include(req, resp);
	}
}
