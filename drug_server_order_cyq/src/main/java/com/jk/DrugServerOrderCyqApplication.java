package com.jk;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DrugServerOrderCyqApplication {

    public static void main(String[] args) {
        SpringApplication.run(DrugServerOrderCyqApplication.class, args);
    }

}
