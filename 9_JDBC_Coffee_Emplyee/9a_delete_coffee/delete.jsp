<%--9a. Read all the existing records from the table coffee which is from the database test and delete
an existing coffee product from the table with its id and display the rest of the records using
HTML and JSP to get the field and display the results respectively--%>

  <%@ page import="java.sql.*" %>
<%
    String id = request.getParameter("id");
    Connection conn = null;
    Statement stmt = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
        stmt = conn.createStatement();

        int rows = stmt.executeUpdate("DELETE FROM coffee WHERE id=" + id);
        if (rows > 0) {
            out.println("<h3>Record with ID " + id + " deleted successfully!</h3>");
        } else {
            out.println("<h3>No record found with ID " + id + "</h3>");
        }

        out.println("<h2>Remaining Coffee Products:</h2>");
        ResultSet rs = stmt.executeQuery("SELECT * FROM coffee");
        while (rs.next()) {
            out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("coffee_name") + ", Price: " + rs.getInt("priced") + "<br>");
        }

    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    } finally {
        if (stmt != null) stmt.close();
        if (conn != null) conn.close();
    }
%>
