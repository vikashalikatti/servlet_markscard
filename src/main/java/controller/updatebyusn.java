package controller;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Admin_dao;
import dto.Admin_dto;

@WebServlet("/UpdateStudentRecord")
public class updatebyusn extends HttpServlet {
	private Admin_dao studentDAO = new Admin_dao();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Admin_dto student = new Admin_dto();
		student.setUniversitySeatNumber(Integer.parseInt(req.getParameter("usn")));
		student.setStudentName(req.getParameter("studentName"));
		student.setDob(Date.valueOf(req.getParameter("dob")));
		student.setFatherName(req.getParameter("fatherName"));
		student.setMotherName(req.getParameter("motherName"));
		student.setKannada(Integer.parseInt(req.getParameter("kannada")));
		student.setEnglish(Integer.parseInt(req.getParameter("english")));
		student.setHindi(Integer.parseInt(req.getParameter("hindi")));
		student.setMathematics(Integer.parseInt(req.getParameter("maths")));
		student.setSocialScience(Integer.parseInt(req.getParameter("socialscience")));
		student.setScience(Integer.parseInt(req.getParameter("science")));

		// calculate total marks and percentage here, then set
		int totalMarks = student.getKannada() + student.getHindi() + student.getMathematics()
				+ student.getSocialScience() + student.getScience();
		double percentage = totalMarks / 5.0; // assuming each subject is out of 100
		student.setTotalMarks(totalMarks);
		student.setPercentage(percentage);

		// calculate type based on percentage
		if (percentage >= 85) {
			student.setResult_type("Distinction");
		} else if (percentage >= 70) {
			student.setResult_type("First Class");
		} else if (percentage >= 50) {
			student.setResult_type("Second Class");
		} else if (percentage >= 35) {
			student.setResult_type("Third Class");
		} else {
			student.setResult_type("Fail");
		}
		studentDAO.update(student);
		resp.getWriter().print("<h1><center>Record Updated</center></h1>");
		req.getRequestDispatcher("admin_portal.jsp").include(req, resp);
	}
}
