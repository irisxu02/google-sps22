package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form-handler")
public class FormHandlerServlet extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    // Get the value entered in the form.
    String name = request.getParameter("name-input");
    String email = request.getParameter("email-input");
    String subject = request.getParameter("subject-input");
    String message = request.getParameter("message-input");

    // Print the value so you can see it in the server logs.
    System.out.println("name: " + name);
    System.out.println("email: " + email);
    System.out.println("subject: " + subject);
    System.out.println("message: " + message);
    
    // Write the value to the response so the user can see it.
    response.setContentType("text/html;");
    response.getWriter().println("<p>Name: " + name + "</p>");
    response.getWriter().println("<p>Email: " + email + "</p>");
    response.getWriter().println("<p>Subject: " + subject + "</p>");
    response.getWriter().println("<p>Message: " + message + "</p>");
  }
}
