package com.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.component.WashingMachine;

public class WashingMachineTester {

	public static void main(String[] args) {
		ApplicationContext spring= new ClassPathXmlApplicationContext("washingmachine.xml");
        WashingMachine wash= spring.getBean(WashingMachine.class);
        
	}

	}


