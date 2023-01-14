package com.test.util;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.util.Properties;
import java.net.URL;

public class Db {

    private Connection conn = null;
    private Statement stmt = null;
    private static String url;
    private static String user;
    private static String password;
    private static String driver;
    static{
        Properties po = null;
        try {
            po = new Properties();
            ClassLoader ld = Db.class.getClassLoader();
            URL res = ld.getResource("db.properties");
            if(res != null){
                String path = res.getPath();
                System.out.println(path);
                po.load(new FileReader(path));
            }

        }catch(Exception e){
            e.printStackTrace();
        }
        url = po.getProperty("url");
        user = po.getProperty("user");
        password = po.getProperty("password");
        driver = po.getProperty("driver");
    }

    public int connection(String sql) throws Exception{
        Class.forName(driver);
        int row = 0;
        try {

            conn = DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();
            row = stmt.executeUpdate(sql);
        }catch(Exception e){
            e.printStackTrace();
        }
        return row;
    }

    public void close(){
        if(stmt != null){
            try {
                stmt.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        if(conn != null){
            try{
                conn.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
