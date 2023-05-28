<%@page import="dto.Admin_dto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Mark Card</title>
</head>
<body>
    <h1>Mark Card</h1>

    <% if (request.getAttribute("student") != null) {
        Admin_dto student = (Admin_dto) request.getAttribute("student");
    %>
        <h2>Student Details:</h2>
        <p>USN: <%= student.getUniversitySeatNumber() %></p>
        <p>Student Name: <%= student.getStudentName() %></p>
        <p>Date of Birth: <%= student.getDob() %></p>
        <p>Father Name: <%= student.getFatherName() %></p>
        <p>Mother Name: <%= student.getMotherName() %></p>

        <h2>Marks:</h2>
        <table>
            <tr>
                <th>Subject</th>
                <th>Marks</th>
            </tr>
            <tr>
                <td>Kannada</td>
                <td><%= student.getKannada() %></td>
            </tr>
            <tr>
                <td>English</td>
                <td><%= student.getEnglish() %></td>
            </tr>
            <tr>
                <td>Hindi</td>
                <td><%= student.getHindi() %></td>
            </tr>
            <tr>
                <td>Mathematics</td>
                <td><%= student.getMathematics() %></td>
            </tr>
            <tr>
                <td>Social Science</td>
                <td><%= student.getSocialScience() %></td>
            </tr>
            <tr>
                <td>Science</td>
                <td><%= student.getScience() %></td>
            </tr>
        </table>

        <h2>Total Marks: <%= student.getTotalMarks() %></h2>
        <h2>Percentage: <%= student.getPercentage() %></h2>
        <h2>Result Type: <%= student.getResult_type() %></h2>
    <% } else { %>
        <h2>No mark card available for the provided USN and Date of Birth.</h2>
    <% } %>
    <a href="student_login.html"><button>student_home</button></a>
</body>
</html>
