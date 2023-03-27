package com.servlet;

import com.po.user;
import com.service.userservice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class login extends HttpServlet {

   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      System.out.println("正在dopost");
      userservice us=new userservice();
      String username=req.getParameter("loginname");
      String password=req.getParameter("password");
      user user=new user();
      user.setLoginame(username);
      user.setLoginpassword(password);
      boolean result=false;
       result=us.login(user);
       if(result)
    {
        //resp.sendRedirect("sucess.html");
       //转发
      req.getRequestDispatcher("sucess.jsp").forward(req,resp);

    }
else
    {
        //重定向
        resp.sendRedirect("error.jsp");

    }
   }

   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     doGet(req, resp);
   }
}
