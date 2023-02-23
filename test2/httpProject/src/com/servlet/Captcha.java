package com.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.awt.Color;
import javax.imageio.ImageIO;
import java.util.Random;

@WebServlet("/captcha")
public class Captcha extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res){
        System.out.println("captcha");

        int width = 80;
        int height = 40;
        BufferedImage im = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        Graphics gs = im.getGraphics();
        gs.setColor(Color.BLUE);
        gs.fillRect(0, 0, width, height);

        // border
        gs.setColor(Color.PINK);
        gs.drawRect(0, 0, width - 1, height - 1);


        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZqwertyuiopasdfghjklzxcvbnm1234567890";
        gs.setColor(Color.white);
        Random rm = new Random();
        for(int i = 0; i < 4; i++){
            int index = rm.nextInt(str.length());
            char c = str.charAt(index);
            gs.drawString(c + "", width / 5 * i + 10, height / 2 + 4);
        }

        // lines
        gs.setColor(Color.BLACK);
        for(int k = 0; k <= 10; k++){
            int x1 = rm.nextInt(width);
            int x2 = rm.nextInt(width);

            int y1 = rm.nextInt(height);
            int y2 = rm.nextInt(height);
            gs.drawLine(x1, y1, x2, y2);
        }


        try {
            ImageIO.write(im, "jpg", res.getOutputStream());
        }catch(Exception e){
            e.printStackTrace();
        }finally{

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res){

    }
}
