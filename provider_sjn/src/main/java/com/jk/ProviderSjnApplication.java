package com.jk;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jk.mapper")
@EnableDubboConfiguration
public class ProviderSjnApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderSjnApplication.class, args);
    }

}
