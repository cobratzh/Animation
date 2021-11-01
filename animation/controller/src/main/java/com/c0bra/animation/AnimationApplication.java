package com.c0bra.animation;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan({"com.c0bra.animation.mapper", "com.c0bra.animation.dao"})
@EnableSwagger2
public class AnimationApplication {
    public static void main(String[] args){
        SpringApplication.run(AnimationApplication.class, args);

    }
}
