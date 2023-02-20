package com.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calculator.service.CalculatorService;

@RestController
@CrossOrigin
public class CalculatorController {

@Autowired
CalculatorService sc;
	
@GetMapping(path="/add/{value}")
double addition(@PathVariable("value") int value) {
	
	return sc.addition(value);
	
}
@GetMapping(path="/sub/{value}")
double Substraction(@PathVariable("value") int value) {
	
	return sc.substraction(value);
	
}
@GetMapping(path="/mul/{value}")
double multiplication(@PathVariable("value") int value) {
	
	return sc.multiplication(value);
	
}
@GetMapping(path="/div/{value}")
double division(@PathVariable("value") int value) {
	
	return sc.division(value);
	
}
@GetMapping(path="/sqr/{value}")
double Squre(@PathVariable("value") int value) {
	
	double re=sc.squre(value);

	return re;
	
}
@GetMapping(path="/sqrroot/{value}")
double Squreroot(@PathVariable("value") int value) {

	return sc.squreroot(value);
	
}
@GetMapping(path="/reset")
double Reset() {
	
	return sc.reset();
	
}
}
