package com.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import javax.servlet.ServletContext;

@WebServlet("/httpweb")  //  use http://localhost/httpweb to visit
public class Http extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) {
        String path = req.getContextPath();
        int status = res.getStatus();
        String aa = req.getParameter("aa");
        System.out.println("path: " + path);
        res.setContentType("Content-Type: text/html");
        // res.setContentLength(8);
        try {

            // echo 1
        //    PrintWriter writer = res.getWriter();
         //   writer.write("path: " + path);

            //  echo 2
            ServletOutputStream os = res.getOutputStream();
            os.println("path: " + path);
            os.println("status: " + String.valueOf(status));
            os.println("parameter aa: " + aa);
        }catch(Exception e){
            e.printStackTrace();
            // log
        }finally{

        }

        // proxy to other service
        try {
          //  req.getRequestDispatcher("/proxy").forward(req, res);
        }catch(Exception e){
            e.printStackTrace();
        }

        // 302 redirect
        try {
          //  res.sendRedirect("/proxy");
        }catch(Exception e){
            e.printStackTrace();
        }

        // cookie
        Cookie co_user = new Cookie("user", "admin");
        co_user.setMaxAge(60 * 60 * 24);
        res.addCookie(co_user);

        Cookie[] cookies = req.getCookies();
        for(Cookie item: cookies){
            String name = item.getName();
            String value = item.getValue();
        }

        // Session
        HttpSession se = req.getSession();
        se.setAttribute("user", "admin");
        String name_session = (String)se.getAttribute("user");


        // Context
        ServletContext sc = req.getServletContext();
        String path_jsp = sc.getRealPath("/index.jsp");
        System.out.println("Servlet Context Path: " + path_jsp);
        String mime = sc.getMimeType("index.jsp");
        System.out.println("Servlet Context mime: " + mime);


        System.out.println("http web");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res){
        System.out.println("post 800888");
    }
}
