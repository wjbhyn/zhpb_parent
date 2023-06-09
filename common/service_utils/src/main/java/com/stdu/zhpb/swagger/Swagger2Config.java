package com.stdu.zhpb.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
/**
 * Swagger测试
 * http://localhost:8301/swagger-ui.html
 */
public class Swagger2Config {
    @Bean
    public Docket webApiConfig(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("zhpb")
                .apiInfo(webApiInfo())
                .select()
                //只显示api路径下的页面
                //.paths(Predicates.and(PathSelectors.regex("/api/.*")))
                .build();
    }

    private ApiInfo webApiInfo(){
        return new ApiInfoBuilder()
                .title("智慧排班-API文档")
                .description("本文档描述了智慧排班网站微服务接口定义")
                .version("1.0")
                .contact(new Contact("stdu", "http://coisini.wang", "w_jingbo@outlook.com"))
                .build();
    }
}
