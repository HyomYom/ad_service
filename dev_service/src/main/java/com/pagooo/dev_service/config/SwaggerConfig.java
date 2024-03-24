package com.pagooo.dev_service.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//@EnableSwagger2 3.0에서는 따로 선언 x
@Configuration
public class SwaggerConfig {
    private String version = "V1.0";

    @Bean
    public OpenAPI openAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("D-Escape 커머스 프로젝트")
                        .description("살기위한 발버둥")
                        .version(version)
                );

    }
    // 기본 Spring에서는 Handler를 따로 등록해줘야한다.
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
//        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
//        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
//    }
}
