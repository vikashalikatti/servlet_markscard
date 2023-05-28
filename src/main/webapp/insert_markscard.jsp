<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Insert Markscard Details</title>
</head>
<body>
    <h1>Insert Markscard Details</h1>
    <form action="InsertStudentRecord" method="post">
        <label for="studentName">Student Name:</label><br>
        <input type="text" id="studentName" name="studentName" placeholder="Student Name"><br>
        
        <label for="dob">Date of Birth:</label><br>
        <input type="date" id="dob" name="dob" placeholder="Date of Birth"><br>
        
        <label for="fatherName">Father's Name:</label><br>
        <input type="text" id="fatherName" name="fatherName" placeholder="Father Name"><br>
        
        <label for="motherName">Mother's Name:</label><br>
        <input type="text" id="motherName" name="motherName" placeholder="Mother Name"><br>
        
        <label for="kannada">Kannada Marks:</label><br>
        <input type="number" id="kannada" name="kannada" placeholder="Enter Kannada marks"><br>
        
        <label for="english">English Marks:</label><br>
        <input type="number" id="english" name="english" placeholder="Enter English marks"><br>
        
        <label for="hindi">Hindi Marks:</label><br>
        <input type="number" id="hindi" name="hindi" placeholder="Enter Hindi marks"><br>
        
        <label for="maths">Mathematics Marks:</label><br>
        <input type="number" id="maths" name="maths" placeholder="Enter Mathematics marks"><br>
        
        <label for="socialscience">Social Science Marks:</label><br>
        <input type="number" id="socialscience" name="socialscience" placeholder="Enter Social Science marks"><br>
        
        <label for="science">Science Marks:</label><br>
        <input type="number" id="science" name="science" placeholder="Enter Science marks"><br>

        <button type="submit">Insert Record</button>
    </form>
    	<a href="admin_portal.jsp"><button >KSEEB</button></a>
</body>
</html>
