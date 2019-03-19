package com.hr.springboot5;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hr.springboot5.dao")
public class Springboot5Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot5Application.class, args);
    }

}
