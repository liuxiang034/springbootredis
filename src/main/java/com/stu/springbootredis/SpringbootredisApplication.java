package com.stu.springbootredis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.stu.springbootredis.dao")
@SpringBootApplication
public class SpringbootredisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootredisApplication.class, args);
    }

}
