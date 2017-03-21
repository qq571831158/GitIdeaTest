package com.ch.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by apple on 2017/3/21.
 */
public class UserController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("charset=utf8;");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if (username.equals("cheng")&&password.equals("123456")){
            out.print("helloworld你好");
        }
        else {
            out.print("error");
        }
    }
}
