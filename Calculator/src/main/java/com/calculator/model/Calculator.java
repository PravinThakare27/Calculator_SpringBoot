package com.calculator.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;

@Component
public class Calculator {
int value;
String operation;
double result;

public Calculator() {
	super();
	// TODO Auto-generated constructor stub
}
public Calculator(int value, String operation, int result) {
	super();
	this.value = value;
	this.operation = operation;
	this.result = result;
}
public int getValue() {
	return value;
}
public void setValue(int value) {
	this.value = value;
}
public String getOperation() {
	return operation;
}
public void setOperation(String operation) {
	this.operation = operation;
}
public double getResult() {
	return result;
}
public void setResult(double d) {
	this.result = d;
}
@Override
public String toString() {
	return "Calculator [value=" + value + ", operation=" + operation + ", result=" + result + "]";
}

}
