<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ page import="dto.Admin_dto" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <title>List of Students</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid black;
            padding: 5px;
            text-align: left;
        }
    </style>
</head>
<body>
    <h1>List of Students</h1>

    <table id="studentsTable" border="1">
        <tr>
            <th>USN</th>
            <th>Student Name</th>
            <th>Date of Birth</th>
            <th>Father Name</th>
            <th>Mother Name</th>
            <th>Kannada</th>
            <th>Hindi</th>
            <th>English</th>
            <th>Mathematics</th>
            <th>Social Science</th>
            <th>Science</th>
            <th>Total Marks</th>
            <th>Percentage</th>
            <th>Result Type</th>
        </tr>
        <%
        List<Admin_dto> students = (List<Admin_dto>) request.getAttribute("students");
        
        if(students != null) {
            for (Admin_dto student : students) {
        %>
        <tr>
            <td><%= student.getUniversitySeatNumber() %></td>
            <td><%= student.getStudentName() %></td>
            <td><%= student.getDob() %></td>
            <td><%= student.getFatherName() %></td>
            <td><%= student.getMotherName() %></td>
            <td><%= student.getKannada() %></td>
            <td><%= student.getHindi() %></td>
            <td><%= student.getEnglish() %></td>
            <td><%= student.getMathematics() %></td>
            <td><%= student.getSocialScience() %></td>
            <td><%= student.getScience() %></td>
            <td><%= student.getTotalMarks() %></td>
            <td><%= student.getPercentage() %></td>
            <td><%= student.getResult_type() %></td>
        </tr>
        <%
            }
        }
        %>
    </table>
    <a href="admin_portal.jsp" ><button>home</button></a>
</body>
</html>
