<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <title>Check USN Record</title>
</head>
<body>
    <h1>Check USN Record</h1>
    <form action="CheckUSNRecord" method="post">
        <label for="usn">USN:</label><br>
        <input type="number" id="usn" name="usn" placeholder="Enter USN"><br>
        <button type="submit">Check Record</button>
    </form>
</body>
</html>
