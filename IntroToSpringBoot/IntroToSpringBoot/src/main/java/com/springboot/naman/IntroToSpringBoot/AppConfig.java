package com.springboot.naman.IntroToSpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AppConfig {

    // WHEN WE NEED TO DEFINE MANY MINI BEANS


    @Bean
    Apple getApple(){
        return new Apple();
    }
    Apple buy(){
        return  new Apple();
    }


}
