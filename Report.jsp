<%-- This is a JSP file of 8c --%>


<%@ page import="java.sql.*" %>
<html>
<head>
    <title>Employee Report</title>
    <style>
        body {
            font-family: monospace;
            white-space: pre;
        }
    </style>
</head>
<body>
<pre>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                    Salary Report
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
<%
    int grandTotal = 0;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Emp");

        while(rs.next()) {
            int empNo = rs.getInt("Emp_NO");
            String empName = rs.getString("Emp_Name");
            int salary = rs.getInt("Basicsalary");
            grandTotal += salary;
%>
Emp_No    : <%= empNo %>  
Emp_Name  : <%= empName %>  
Basic     : <%= salary %>  
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
<%
        }

%>
Grand Total Salary = <%= grandTotal %>  
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
<%
        conn.close();
    } catch(Exception e) {
        out.println("Error: " + e.getMessage());
    }
%>
</pre>
</body>
</html>
s
