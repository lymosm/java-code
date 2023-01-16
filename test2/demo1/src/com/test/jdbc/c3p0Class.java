package com.test.jdbc;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.sql.Connection;
import com.mysql.jdbc.Driver;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class c3p0Class {

    public static void main(String[] args) throws Exception{
        String path = c3p0Class.class.getClassLoader().getResource("c3p0-config.xml").getPath();
        System.out.println(path);
        ComboPooledDataSource ds = new ComboPooledDataSource("hellc3p0");
        System.out.println(ds);
        Connection conn = ds.getConnection();
        for(int i = 0; i <= 5; i++){
            Connection conn2 = ds.getConnection();
            System.out.println(String.valueOf(i) + conn2);
        }

        Statement stmt = conn.createStatement();
        String sql2 = "select * from user where name = ?";
        PreparedStatement pres = conn.prepareStatement(sql2);
        pres.setString(1, "admin");
        ResultSet rs2 = pres.executeQuery();
        String sql = "select * from user limit 1";
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            String name = rs.getString("name");
            System.out.println("name is " + name);
        }
        stmt.close();
        pres.close();
        conn.close();
    }

}
