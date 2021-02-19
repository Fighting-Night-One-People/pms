package com.gengshuaishuai.pms.test.datasource;

import com.gengshuaishuai.pms.test.constant.Constant;
import org.springframework.boot.jdbc.DataSourceBuilder;

import javax.sql.DataSource;
import java.sql.*;

/**
 * @author 耿帅帅
 * @version 1.0
 * @date 2021/2/1 15:22
 * @description
 */
public class SqlExecute {
    public static String mysqlExecute(String sql){
        Connection connection=null;
        PreparedStatement psmt=null;
        ResultSet result=null;
        DataSource build = DataSourceBuilder.create()
                .driverClassName(Constant.DATA_SOURCE_MYSQL)
                .url("jdbc:mysql://localhost:3306/pms")
                .username("root")
                .password("root")
                .build();
        try {
            connection = build.getConnection();
            psmt = connection.prepareStatement(sql);
            result = psmt.executeQuery();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
        return "";
    }
}
