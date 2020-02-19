package com.example.boxeworker;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan("com.example.boxeworker.dao")
@SpringBootApplication
@EnableTransactionManagement
public class BoxeworkerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoxeworkerApplication.class, args);
    }

}
