package com.onetomany.spring;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

public class SwaggerClass {


    @EnableSwagger2
    public class SwaggerConfig {

        @Bean
        public Docket createRestApi() {
            return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("com.onetomany.spring.Controller")) // Пакет сканирования Swagger
                    .paths(PathSelectors.any())
                    .build();

        }
        private ApiInfo apiInfo() {
            return new ApiInfoBuilder()
                    .title ("Руководство по API проекта на основе Swagger")
                    .description ("API компонента информационной службы")
                    .version("1.0")
                    .build();
        }

    }

}
