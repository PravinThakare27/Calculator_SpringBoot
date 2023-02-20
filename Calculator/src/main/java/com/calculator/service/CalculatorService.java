package com.calculator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calculator.RequirementClass.Requirement;
import com.calculator.controller.CalculatorController;
import com.calculator.model.Calculator;

@Service
public class CalculatorService implements Requirement{
	

@Autowired
Calculator c1;
	@Override
	public double addition(int num) {
		// TODO Auto-generated method stub
		c1.setResult(c1.getResult()+num);
		return c1.getResult();
	}

	@Override
	public double substraction(int num) {
		// TODO Auto-generated method stub
		c1.setResult(c1.getResult()-num);
		return c1.getResult();
		
	}
	@Override
	public double multiplication(int num) {
		// TODO Auto-generated method stub
		if(c1.getResult()==0) {
			c1.setResult(num);
		}
		else
		{
		c1.setResult(c1.getResult()*num);
		}
		return c1.getResult();
	}

	@Override
	public double division(int num) {
		// TODO Auto-generated method stub
		if(c1.getResult()==0) {
			c1.setResult(num);
		}
		else
		{
		c1.setResult(c1.getResult()/num);
		}
		return c1.getResult();
		
	}

	@Override
	public double squre(int value) {
		// TODO Auto-generated method stub
	
		c1.setResult(Math.pow(value, 2));
		
		return c1.getResult();
	}

	@Override
	public double squreroot(int value) {
		// TODO Auto-generated method stub
		
		
		c1.setResult(Math.sqrt(value));
		
		return c1.getResult();
	}

	public double reset() {
		// TODO Auto-generated method stub
	
		c1.setResult(0);
		
		return c1.getResult(); 
	}
	

}
