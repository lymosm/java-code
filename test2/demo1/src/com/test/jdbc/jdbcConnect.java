package com.test.jdbc;


import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.util.ArrayList;
import com.test.util.Db;

public class jdbcConnect {

    public static void main(String[] args){
        System.out.println("Start jdbc");
        try {
           // conn();
           // update();
            int ret = delete();
            System.out.println("delete status: " + ret);
        }catch(Exception e){

        }
    }

    public static void conn() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/www_esr";
        String user = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement();
        String sql = "select * from esr_users limit 4";
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            String name = rs.getString("user_email");
            Integer id = rs.getInt("ID");
            System.out.println("ID: " + id + " user email: " + name);
        }
    }

    public static ArrayList<Person> select() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement();
        String sql = "select * from user";
        ResultSet rs = stmt.executeQuery(sql);
        ArrayList arr = new ArrayList<>();

        while(rs.next()){
            Person pr = new Person();
            pr.setId(rs.getInt("id"));
            pr.setName(rs.getString("name"));
            arr.add(pr);
        }
        return arr;
    }

    public static int update() throws Exception{
        System.out.println("start update");
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/www_esr";
        String user = "root";
        String password = "root";
        Statement stmt = null;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();
            String sql = "update esr_users set user_email = '9999999' where ID = 1";
            int ret = stmt.executeUpdate(sql);
            if(ret >= 0){
                System.out.println("update success");
            }else{
                System.out.println("update failed");
            }
            return ret;
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }finally{
            if(stmt != null){
                stmt.close();
            }
            if(conn != null){
                conn.close();
            }
        }
        return 0;
    }

    public static int delete() throws Exception{
        String sql = "delete from esr_users where ID = 14";
        Db db = new Db();
        int ret = db.connection(sql);
        db.close();
        return ret;
    }
}
