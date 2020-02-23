package com.example.land;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.example.land.Dao")
public class LandApplication {

    public static void main(String[] args) {
        SpringApplication.run(LandApplication.class, args);
    }

}
