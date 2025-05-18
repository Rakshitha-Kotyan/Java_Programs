<%--9d. Develop a JDBC project using MySQL to delete the records in the table Emp of the database
Employee by getting the name starting with ‘S’ through keyboard and Generate the report as
follows using HTML and JSP to get the field and display the results respectively--%>


<%@ page import="java.sql.*" %>
<html>
<head>
    <title>Delete Employee</title>
</head>
<body>
    <h2>Delete Employee Record</h2>

    <form method="post">
        Enter Employee ID to Delete: <input type="text" name="empid" required />
        <input type="submit" value="Delete" />
    </form>

<%
    String empIdStr = request.getParameter("empid");

    if (empIdStr != null && !empIdStr.isEmpty()) {
        int empId = Integer.parseInt(empIdStr);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");
            PreparedStatement pstmt = conn.prepareStatement("DELETE FROM Emp WHERE Emp_NO = ?");
            pstmt.setInt(1, empId);

            int rows = pstmt.executeUpdate();

            if (rows > 0) {
                out.println("<p style='color:green;'>Employee with ID " + empId + " deleted successfully.</p>");
            } else {
                out.println("<p style='color:red;'>Employee with ID " + empId + " not found.</p>");
            }

            conn.close();
        } catch (Exception e) {
            out.println("<p>Error: " + e.getMessage() + "</p>");
        }
    }
%>
</body>
</html>
