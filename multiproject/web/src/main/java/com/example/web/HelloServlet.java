package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="HelloServlet", urlPatterns={"/hello"})
public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
		res.setContentType("text/html");
        PrintWriter writer = res.getWriter();
        writer.println("<!DOCTYPE html><html><body>");
        writer.print("<h1>This is Sample Application</h1>");
        writer.print("<p>it is Servlet</p>");
        writer.println("</body></html>");
    }
}
