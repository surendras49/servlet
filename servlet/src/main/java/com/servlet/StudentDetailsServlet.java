package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/details")
public class StudentDetailsServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,
                           HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String course = request.getParameter("course");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Student Details</h1>");
        out.println("<h3>Name: " + name + "</h3>");
        out.println("<h3>Email: " + email + "</h3>");
        out.println("<h3>Course: " + course + "</h3>");
        out.println("</body>");
        out.println("</html>");
    }
}