package com.mayaoting.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 开启mapper的扫描
 * */
@MapperScan("com.mayaoting.springcloud.dao")
/**
 *Spring自动引入的数据源会报错
 * */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
/**
 * 开启服务注册
 * */
@EnableDiscoveryClient
public class Purduct8001 {
    public static void main(String[] args) {
        SpringApplication.run(Purduct8001.class,args);
        System.out.println("Purduct8001启动完毕");
    }
}
