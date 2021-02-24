package com.mayaoting.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Gateway9525 {
    public static void main(String[] args) {
        SpringApplication.run(Gateway9525.class,args);
        System.out.println("Gateway9525启动完毕");
    }
}
