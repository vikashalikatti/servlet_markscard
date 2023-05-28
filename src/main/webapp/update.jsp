<%@ page import="dto.Admin_dto" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <title>Update Student Details</title>
</head>
<body>
    <h1>Update Student Details</h1>

    <% 
    Admin_dto student = (Admin_dto) request.getAttribute("student");
    if (student != null) {
    %>
    <form action="UpdateStudentRecord" method="post">
        <label for="usn">USN:</label><br>
        <input type="number" readonly="readonly" name="usn" value="<%= student.getUniversitySeatNumber() %>"><br>
        <label for="studentName">Student Name:</label><br>
        <input type="text" id="studentName" name="studentName" value="<%= student.getStudentName() %>"><br>
        <label for="dob">Date of Birth:</label><br>
        <input type="date" id="dob" name="dob" value="<%= student.getDob() %>"><br>
        <label for="fatherName">Father Name:</label><br>
        <input type="text" id="fatherName" name="fatherName" value="<%= student.getFatherName() %>"><br>
        <label for="motherName">Mother Name:</label><br>
        <input type="text" id="motherName" name="motherName" value="<%= student.getMotherName() %>"><br>
        <label for="kannada">Kannada Marks:</label><br>
        <input type="number" id="kannada" name="kannada" value="<%= student.getKannada() %>"><br>
        <label for="english">English Marks:</label><br>
        <input type="number" id="english" name="english" value="<%= student.getEnglish() %>"><br>
        <label for="hindi">Hindi Marks:</label><br>
        <input type="number" id="hindi" name="hindi" value="<%= student.getHindi() %>"><br>
        <label for="maths">Mathematics Marks:</label><br>
        <input type="number" id="maths" name="maths" value="<%= student.getMathematics() %>"><br>
        <label for="socialscience">Social Science Marks:</label><br>
        <input type="number" id="socialscience" name="socialscience" value="<%= student.getSocialScience() %>"><br>
        <label for="science">Science Marks:</label><br>
        <input type="number" id="science" name="science" value="<%= student.getScience() %>"><br>

        <button type="submit">Update Record</button>
    </form>
    <% 
    } else {
    %>
    <h3>No data found</h3>
    <% 
    }
    %>
</body>
</html>
