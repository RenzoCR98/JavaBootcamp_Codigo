package com.codigo.mscuevaroldan.application.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI configOpenApi(){
        return new OpenAPI()
                .info(new Info().title("Apis del ms-cuevarenzo").version("1.0"));
    }
}
