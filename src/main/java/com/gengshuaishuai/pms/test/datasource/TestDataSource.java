package com.gengshuaishuai.pms.test.datasource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.jdbc.DataSourceBuilder;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 * @author 耿帅帅
 * @version 1.0
 * @date 2021/1/27 13:09
 * @description
 */
@Slf4j
public class TestDataSource {
    public static void main(String[] args) {
        TestDataSource.testOracle();
    }

    public static void testMysql() {
        Connection conn = null;
        DataSource dataSource = DataSourceBuilder.create()
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .url("jdbc:mysql://localhost:3306/pms")
                .username("root")
                .password("root")
                .build();
        try {
            log.info("开始连接mysql---------->");
            conn = dataSource.getConnection();
            log.info("连接mysql成功-------------->");
        } catch (Exception e) {
            e.printStackTrace();
            log.info("连接mysql失败-------------->");
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void testOracle(){
        Connection conn = null;
        DataSource dataSource = DataSourceBuilder.create()
                .driverClassName("oracle.jdbc.driver.OracleDriver")
                .url("jdbc:oracle:thin@127.0.0.1:1521:pms")
                .username("root")
                .password("root")
                .build();
        try {
            log.info("开始连接oracle---------->");
            conn = dataSource.getConnection();
            log.info("连接oracle成功-------------->");
        } catch (Exception e) {
            e.printStackTrace();
            log.info("连接oracle失败-------------->");
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
