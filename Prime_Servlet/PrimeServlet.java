/*6c. Build a servlet program to check the given number is prime number or not using HTML with step
by step procedure.*/
// File: PrimeServlet.java
package com.primecheck;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/checkprime")
public class PrimeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int num = Integer.parseInt(request.getParameter("number"));
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            out.println("<html><head><title>Prime Checker</title></head><body>");
            out.println("<h2>Result:</h2>");
            out.println("<p>The number <strong>" + num + "</strong> is " + (isPrime ? "<span style='color:green;'>a Prime Number</span>" : "<span style='color:red;'>not a Prime Number</span>") + ".</p>");
            out.println("<br><a href='index.html'>Check Another Number</a>");
            out.println("</body></html>");
        } catch (NumberFormatException e) {
            out.println("<html><body><h3 style='color:red;'>Invalid input. Please enter a valid number.</h3>");
            out.println("<a href='index.html'>Try Again</a></body></html>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.sendRedirect("index.html");
    }
}
