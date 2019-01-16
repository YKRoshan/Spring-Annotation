package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.stackroute")
public class AppConfig {
    @Bean(name = "movie1")
    public Movie getMovie(){
        return new Movie(getActor());
    }

    @Bean(name = "actor1")
    public Actor getActor(){
        return new Actor();
    }




}
