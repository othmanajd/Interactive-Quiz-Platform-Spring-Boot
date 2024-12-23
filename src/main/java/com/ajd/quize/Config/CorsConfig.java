package com.ajd.quize.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Arejdal
 **/


@Configuration
public class CorsConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**") // Permettre les requêtes sur les endpoints de l'API
                        .allowedOrigins("http://localhost:3000", "http://localhost:5173","https://aesthetic-youtiao-61952a.netlify") // Ajout de l'origine correcte
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Méthodes HTTP autorisées
                        .allowedHeaders("*") // Autoriser tous les en-têtes
                        .allowCredentials(true); // Autoriser les cookies (si nécessaire)
            }
        };
    }
}


