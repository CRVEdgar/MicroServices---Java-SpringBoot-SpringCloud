package com.example.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    @Bean
    public RestTemplate restTemplate(){
        //metodo responsavel por deixar a disposição um Objeto RestTemplate pra injetar em outros serviços
        return new RestTemplate();
    }
}
