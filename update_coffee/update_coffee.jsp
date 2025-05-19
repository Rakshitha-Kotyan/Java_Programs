<%-- 8b. Read all the existing records from the table coffee which is from the database test and update an
existing coffee product in the table with its id. [Create a table coffee with fields
( id,coffee_name,price)] using HTML and JSP to get the fields and display the results respectively--%>

  <%@ page import="java.sql.*" %>
<html>
<head>
    <title>Updated Coffee List</title>
</head>
<body>
<%
    String id = request.getParameter("id");
    String coffee_name = request.getParameter("coffee_name");
    String priced = request.getParameter("priced");

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");

        // Update Query
        String query = "UPDATE coffee SET coffee_name = ?, priced = ? WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, coffee_name);
        ps.setInt(2, Integer.parseInt(priced));
        ps.setInt(3, Integer.parseInt(id));

        int rows = ps.executeUpdate();

        if (rows > 0) {
            out.println("<h3 style='color:green;'>Record updated successfully!</h3>");
        } else {
            out.println("<h3 style='color:red;'>No record found with ID = " + id + "</h3>");
        }

        // Display all records
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM coffee");

        out.println("<h2>Updated Coffee List</h2>");
        out.println("<table border='1' cellpadding='10'>");
        out.println("<tr><th>ID</th><th>Name</th><th>Price</th></tr>");

        while (rs.next()) {
            out.println("<tr><td>" + rs.getInt("id") + "</td><td>" + rs.getString("coffee_name") +
                    "</td><td>" + rs.getInt("priced") + "</td></tr>");
        }

        out.println("</table>");

        rs.close();
        stmt.close();
        con.close();
    } catch (Exception e) {
        out.println("<h3 style='color:red;'>Error: " + e.getMessage() + "</h3>");
    }
%>
</body>
</html>
