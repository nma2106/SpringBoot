package com.springboot.naman.IntroToSpringBoot;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

//@Component
public class Apple {

    void eatApple(){
        System.out.println("I am eating the apple");
    }

    void buy(){
        System.out.println("buying apple");
    }

    @PostConstruct
    void beforeCreation(){
        System.out.println("printing before applle is being used");
    }
}
