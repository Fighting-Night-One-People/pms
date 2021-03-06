package com.gengshuaishuai.pms.test.datasource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.jdbc.DataSourceBuilder;
import redis.clients.jedis.Jedis;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.Set;

/**
 * @author 耿帅帅
 * @version 1.0
 * @date 2021/2/19 11:36
 * @description
 */
@Slf4j
public class DataSourceConnection {
    /**
     * 连接Mysql数据库
     */
    public static void connectionMysql() {
        Connection conn = null;
        DataSource dataSource = DataSourceBuilder.create()
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .url("jdbc:mysql://localhost:3306/pms?serverTimezone=GMT")
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

    /**
     * 连接Oracle数据库
     */
    public static void connectionOracle() {
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

    /**
     * 连接Redis数据库
     */
    public static void ConnectionRedis() {
        Jedis jedis = new Jedis();
        Set<String> keys = jedis.keys("*");
        log.info(keys.toString());
    }
}
