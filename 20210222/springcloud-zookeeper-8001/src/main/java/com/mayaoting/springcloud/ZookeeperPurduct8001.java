package com.mayaoting.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.mayaoting.springcloud.dao")
@EnableDiscoveryClient
public class ZookeeperPurduct8001 {
    public static void main(String[] args) {
        SpringApplication.run(ZookeeperPurduct8001.class,args);
        System.out.println("zookeeper Purduct8001启动完成");
    }
}
