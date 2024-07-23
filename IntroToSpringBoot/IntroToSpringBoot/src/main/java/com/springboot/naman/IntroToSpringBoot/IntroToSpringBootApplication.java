package com.springboot.naman.IntroToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroToSpringBootApplication implements CommandLineRunner {
	@Autowired
	Apple obj;

	public static void main(String[] args) {
		SpringApplication.run(IntroToSpringBootApplication.class, args);

		//Apple obj = new Apple();
		//obj.eatApple();
		//THIS  IS THE TRADITION WAY OF INTRODUCING AN OBJ,
		//BUT IN SPRING BOOT WE CAN USE ANNOTATION TO DIRECTLY INITIALISE THE OBJECT

		//obj.eatApple();
		//NOW WE ARE GETTING ERROR BECAUSE THIS  MAINN METHOD IS STATIC

		//NOW AGAIN THIS  WON'T BE RUNNING BECAUSE OF NULL POINTER EXCEPTION
		//SO WE NEED TO MAKE APPLE A BEAN.
		//WE CAN DO SO BY ADDING A @COMPONENT ANNOTATION TO THE APPLE CLASS.
		//NOW RUN ......

		//BUT BUT BUT ///....
		//WE ARE GETTING THE NULL POINTER EXCEPTION AGIAN ... WHY???
		//BECAUSE WE HAVE NOT DECLEARED THAT MAIN SHOULD BE CALLING THE ANNOTATIONS AND BEAN THAT WE HAVE IN APPLE CLASS.

		//NOW USE AUTOWIRE IN MAIN CLASS TO WIRE APPLE CLASS IN MAIN.

		//STILL FACING THE ISSUE SO IMPLEMENT THE COMMAND LINE RUNNER ON MAIN CLASS
	}

	@Override
	public void run(String... args) throws Exception {
		//CALL OBJECT HERE

		//  REMOVE STATIC FROM APPLE
		obj.eatApple();
	}
}
