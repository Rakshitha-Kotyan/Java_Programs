<%--8a. Q1. Read all the existing records from the table coffee which is from the database test and insert a
new coffee product into it [Create a table coffee with fields ( id,coffee_name,price)] using HTML and
JSP to get the fields and display the results respectively --%>


<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>

<html>
<head>
    <title>Coffee Records</title>
</head>
<body>

<%
    String coffeeName = request.getParameter("coffee_name");
    String priceStr = request.getParameter("priced");

    Connection conn = null;
    PreparedStatement ps = null;
    Statement st = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");

        // Insert logic
        if(coffeeName != null && priceStr != null) {
            int price = Integer.parseInt(priceStr);
            ps = conn.prepareStatement("INSERT INTO coffee (coffee_name, priced) VALUES (?, ?)");
            ps.setString(1, coffeeName);
            ps.setInt(2, price);
            ps.executeUpdate();
            out.println("<p><b>Coffee added successfully!</b></p>");
        }

        // Read & display logic
        out.println("<h2>All Coffee Records</h2>");
        st = conn.createStatement();
        rs = st.executeQuery("SELECT * FROM coffee");

        out.println("<table border='1'>");
        out.println("<tr><th>ID</th><th>Name</th><th>Price</th></tr>");
        while (rs.next()) {
            out.println("<tr><td>" + rs.getInt("id") + "</td><td>" +
                        rs.getString("coffee_name") + "</td><td>" +
                        rs.getInt("priced") + "</td></tr>");
        }
        out.println("</table>");
    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    } finally {
        if (ps != null) ps.close();
        if (rs != null) rs.close();
        if (st != null) st.close();
        if (conn != null) conn.close();
    }
%>

</body>
</html>
