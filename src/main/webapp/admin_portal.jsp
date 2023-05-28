<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Admin Portal</title>
</head>
<body>
    <h1>Welcome Admin</h1>
    <button onclick="window.location.href='insert_markscard.jsp'">Insert Markscard Details</button>
    <button onclick="window.location.href='update_markscard.jsp'">Update Markscard Details</button>
    <button onclick="window.location.href='delete_record.jsp'">Delete Markscard Details</button>
    <form action="listStudents" method="get">
    <a href="view_all_details.jsp"><button>View All Details</button></a>
    </form>
 	<form action="logout" method="get">
    <a><button>Logout</button></a>
    </form>
</body>
</html>
