package com.example.demo_tomcat;

import jakarta.servlet.Servlet;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "ServerTimeServlet", value = "/index")
public class ServerTimeServlet extends  HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        writer.println("");
        Date today = new Date();
        writer.println("<h1>" + today + "<h1>");
        writer.println("");
    }
}
