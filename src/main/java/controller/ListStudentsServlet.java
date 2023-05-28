package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Admin_dao;
import dto.Admin_dto;

@WebServlet("/listStudents")
public class ListStudentsServlet extends HttpServlet {
	private Admin_dao studentDAO = new Admin_dao();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Admin_dto> students = studentDAO.findAll();
		System.out.println(students);
		if (students.isEmpty()) {
			resp.getWriter().print("<h1>No students found.</h1>");
			req.getRequestDispatcher("admin_portal.jsp").include(req, resp);
		} else {
			
			System.out.println("Students fetched successfully"); // logging statement
			req.setAttribute("students", students);
			req.getRequestDispatcher("view_all_details.jsp").forward(req, resp);
		}
	}
}
