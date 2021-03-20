package com.gengshuaishuai.pms.test.datasource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.jdbc.DataSourceBuilder;

/**
 * @author 耿帅帅
 * @version 1.0
 * @date 2021/1/27 13:09
 * @description
 */
@Slf4j
public class Main {
    public static void main(String[] args) {
        //连接oracle数据库
        DataSourceConnection.connectionOracle();
        //连接Mysql数据库
        DataSourceConnection.connectionMysql();
        DataSourceConnection.connectionMysql();
        DataSourceConnection.connectionMysql();
        DataSourceConnection.connectionMysql();
        //执行mysql语句
        SqlExecute.mysqlExecute("select * from example");
        //连接redis数据库
        DataSourceConnection.ConnectionRedis();
    }
}
