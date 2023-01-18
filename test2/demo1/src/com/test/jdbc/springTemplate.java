package com.test.jdbc;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.test.util.Db;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.Properties;

public class springTemplate {

    public static void main(String[] args) throws Exception {
        Properties po = new Properties();
        InputStream is = springTemplate.class.getResourceAsStream("/druid.properties");
        po.load(is);

        DataSource ds = DruidDataSourceFactory.createDataSource(po);

        try {
            JdbcTemplate jt = new JdbcTemplate(ds);

            String sql = "update user set name = ? where id = ?";
            int row = jt.update(sql, "admin", 1);
            System.out.println("update row is: " + row);

        }catch(Exception e){
            e.printStackTrace();
        }finally{

        }

    }
}
