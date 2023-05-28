package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdminLogin")
public class Admin_login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user = req.getParameter("username");
		String password = req.getParameter("password");

		if (user.equals("admin") && password.equals("admin")) {
			resp.getWriter().print("<h1><center>Welcome KSEEB</center></h1>");
			req.getRequestDispatcher("admin_portal.jsp").include(req, resp);

		} else {
			resp.getWriter().print("<h1><center>Invalid Credentials</center></h1>");
			req.getRequestDispatcher("admin_login.html").include(req, resp);
		}
	}

}
