package com.example.RegisterLogin.Config;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // Configure the endpoint(s) you want to allow CORS for
                .allowedOrigins("http://localhost:4200") // Allow requests from this origin
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Allow these HTTP methods
                .allowCredentials(true); // Allow sending credentials (e.g., cookies)
    }
}

