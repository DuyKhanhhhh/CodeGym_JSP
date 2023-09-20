package com.example.b3_jsp_jst2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "loginServlet", value = "/login")
public class loginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if ("admin".equals(username)&&"admin".equals(password)){
            HttpSession session = req.getSession();//HttpSession đùng để lưu trữ và quản lý thông tin phiên đang làm việc
            session.setAttribute("username", username);
            resp.sendRedirect("home.jsp");
            //Chuyển hướng đến một trang web khác
        }else {
            resp.sendRedirect("login.jsp?error=true");
        }
    }
}
