package com.mayaoting.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ConsuOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsuOrder80.class,args);
        System.out.println("consul Order80启动成功");
    }
}
