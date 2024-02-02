package com.example.RegisterLogin.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig  implements WebMvcConfigurer {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {

            public void addCorsMappings(CorsRegistry corsRegistry) {
                System.out.println("INSIDE WEB MVC..,");
                corsRegistry.addMapping("/**").allowedHeaders("*").allowedOrigins("**")
                        .allowedMethods("*");

            }
        };
    }
}

