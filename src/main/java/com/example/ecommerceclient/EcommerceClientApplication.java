package com.example.ecommerceclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EcommerceClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceClientApplication.class, args);
    }

}
