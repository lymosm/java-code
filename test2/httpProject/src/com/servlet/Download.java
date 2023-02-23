package com.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletContext;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.servlet.ServletOutputStream;
import java.io.IOException;

@WebServlet("/download")
public class Download extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res){
        int i = test1();
        System.out.println(i);

        String file = req.getParameter("file");

        ServletContext sc = req.getServletContext();
        String path = sc.getRealPath(file);

        FileInputStream fis = null;
        try {
            if(path != null){
                fis = new FileInputStream(path);
            }

        }catch(Exception e){
            e.printStackTrace();
        }
        ServletOutputStream fos = null;
        try {
            fos = res.getOutputStream();
        }catch(Exception e){
            e.printStackTrace();
        }
        res.setHeader("Content-Type", "jpeg");
        res.setHeader("Content-Disposition", "attachment;filename=" + file);

        byte[] buff = new byte[1024 * 8];
        int len = 0;
        try {
            if(fis != null) {
                while ((len = fis.read(buff)) != -1) {
                    fos.write(buff, 0, len);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        try {
            if(fis != null) {
                fis.close();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static int test1(){
        int i = 0;
        try{
            i = 2;
            return i;
        }finally{
            i = 3;
        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res){

    }
}
