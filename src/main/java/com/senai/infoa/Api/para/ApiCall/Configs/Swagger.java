package com.senai.infoa.Api.para.ApiCall.Configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Trabalho Individual",
        version = "1.0",
        description = "Caio Borsato Alonso"
    )
)
public class Swagger {

}