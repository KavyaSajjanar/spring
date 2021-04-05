package com.xworkz.spring.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IntegrateTester {
public static void main(String[] args) {
	String xmlFileName1="camera.xml";
	String xmlFileName2="insurence.xml";
	

	ApplicationContext container=new ClassPathXmlApplicationContext(xmlFileName1,xmlFileName2);
System.out.println(container.getBeanDefinitionCount());


}
}
