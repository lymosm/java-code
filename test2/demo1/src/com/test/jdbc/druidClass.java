package com.test.jdbc;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.io.InputStream;
import javax.sql.DataSource;
import java.sql.Connection;

public class druidClass {
    public static void main(String[] args) throws Exception{
        Properties po = new Properties();
        InputStream is = druidClass.class.getResourceAsStream("/druid.properties");
        po.load(is);

        DataSource ds = DruidDataSourceFactory.createDataSource(po);
        Connection conn = ds.getConnection();
        System.out.println(conn);
        for(int i = 0; i <= 10; i++){
            Connection conn2 = ds.getConnection();
            System.out.println(String.valueOf(i) + "===" + conn2);
        }

        String sql = "select * from user where name like ?";
        PreparedStatement pres = conn.prepareStatement(sql);
        pres.setString(1,"%yy%");
        ResultSet rs = pres.executeQuery();
        while(rs.next()){
            System.out.println("name: " + rs.getString("name"));
        }
    }
}
