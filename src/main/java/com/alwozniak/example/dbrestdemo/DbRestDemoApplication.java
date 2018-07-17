package com.alwozniak.example.dbrestdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DbRestDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbRestDemoApplication.class, args);
    }
}
