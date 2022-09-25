package com.peter.LearnSpringBoot;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@OpenAPIDefinition
public class LearnSpringBootApplication {

	public static void main(String[] args) {
		test();
		SpringApplication.run(LearnSpringBootApplication.class, args);
	}

	public static void test(){
		String fruitsStr = "Apple,Mango,Orange,Banana";
		List<String> fruitArr = Arrays.asList(fruitsStr.split(",")) ;
	}
}
