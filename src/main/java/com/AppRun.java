package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: Mr.Yu
 * @Date: 2022/1/3 14:32
 * @description
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan("com.aaa.dao")
public class AppRun {
    public static void main(String[] args) {
        SpringApplication.run(AppRun.class, args);
    }
}

