package com.mamaGeter.springboot.swaggerexample.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

@Bean
    public Docket productApi(){
    return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.mamaGeter.springboot.swaggerexample"))
            .paths(regex("/rest.*"))
            .build()
            .apiInfo(metaInfo());
}

    private ApiInfo metaInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "Spring Boot Swagger Example API",
                "Spring Boot Swagger Example API for mamaGetter",
                "1.0",
                "23.11.17",
                new Contact("Yurii.Kozlov","https://gitlab.com/oskopokus1977","oskopokus1977@gmail.com"),
                "Apache License Version 2.0",
                "https://www.apache.org/license.html",new ArrayList<>());
        return apiInfo;}


}
