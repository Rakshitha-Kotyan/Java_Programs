<%--9b. Read all the existing records from the table coffee which is from the database test and query
coffee name starting with ‘D’ in the table using HTML and JSP to get the field and display the
results respectively--%>

  <%@ page import="java.sql.*" %>
<%
    Connection conn = null;
    Statement stmt = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
        stmt = conn.createStatement();

        out.println("<h2>Coffee Products Starting with 'D':</h2>");
        ResultSet rs = stmt.executeQuery("SELECT * FROM coffee WHERE coffee_name LIKE 'D%'");

        boolean found = false;
        while (rs.next()) {
            found = true;
            out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("coffee_name") + ", Price: " + rs.getInt("priced") + "<br>");
        }

        if (!found) {
            out.println("No coffee products found starting with 'D'.");
        }

    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    } finally {
        if (stmt != null) stmt.close();
        if (conn != null) conn.close();
    }
%>
