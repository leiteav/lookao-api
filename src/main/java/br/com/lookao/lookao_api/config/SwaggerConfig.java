package br.com.lookao.lookao_api.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Value("${info.app.version}")
    String version;

    final static String APP_TITLE = "LOOKAO - Find your pet (API)";
    final static String APP_DESCRIPTION = "Lookão é uma “pataforma” onde temos o objetivo de intermediar a localização de animais perdidos da Baixada Santista, fazendo com que seus donos recuperem seus pets.";

    final static String CONTACT_NAME = "Ariane Leite";
    final static String CONTACT_URL = "https://github.com/leiteav/lookao-api";
    final static String CONTACT_EMAIL  = "arileitte@gmail.com";

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(APP_TITLE)
                .description(APP_DESCRIPTION)
                .version(version)
                .contact(new Contact(CONTACT_NAME, CONTACT_URL, CONTACT_EMAIL))
                .build();
    }
}
