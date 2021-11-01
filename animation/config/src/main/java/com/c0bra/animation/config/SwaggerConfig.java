package com.c0bra.animation.config;

import com.c0bra.animation.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.c0bra.animation.controller")
                .title("animation后台系统")
                .description("animation后台相关接口文档")
                .contactName("c0bra")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
