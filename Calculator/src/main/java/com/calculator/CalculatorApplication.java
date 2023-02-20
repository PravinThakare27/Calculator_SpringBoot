package com.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.calculator.model.Calculator;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
		Calculator c=new Calculator();
		System.out.println(c.getResult());
	}

}
