<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <title>Delete Student Record</title>
</head>
<body>
    <h1>Delete Student Record</h1>

    <form action="DeleteStudentRecord" method="post">
        <label for="usn">USN:</label><br>
        <input type="number" id="usn" name="usn" placeholder="Enter USN"><br>
        <button type="submit">Delete Record</button>
    </form>
</body>
</html>
