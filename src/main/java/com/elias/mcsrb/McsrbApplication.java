package com.elias.mcsrb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.elias.mcsrb.mapper")
public class McsrbApplication {

    public static void main(String[] args) {
        SpringApplication.run(McsrbApplication.class, args);
    }

}
