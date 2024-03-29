package com.mayaoting.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
/**
 * 开启hystirix服务降级
 * */
@EnableCircuitBreaker
public class HystirixOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(HystirixOrder80.class,args);
        System.out.println("HystirixOrder80 启动完毕");
    }
}
