package com.asiainfo.qish.springcloud.providerserver01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderServer01Application {

    public static void main(String[] args) {
        SpringApplication.run(ProviderServer01Application.class, args);
    }

}
