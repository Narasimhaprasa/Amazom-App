package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.WishMessageGenerator;

public class ContructorInjectionTest {

	public static void main(String[] args) {
	 // to hold spring bean configuration file name and location
		//FileSystemResource res = new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		//FileSystemResource res = new FileSystemResource("E:\\Workspace1\\workspace\\spring\\IOCProject03-ConstructorInjection\\src\\main\\java\\com\\nt\\cfgs\\applicationContext.xml");
  
		//ClassPathResource res = new ClassPathResource("com/nt/cfgs/applicationContext.xml");
		ClassPathResource res = new ClassPathResource("applicationContext.xml");
		
		
		// create IOC contianer(BeanFactory Container)
		XmlBeanFactory factor = new XmlBeanFactory(res);
		 
		//get target spring bean class object
		//Object obj = factor.getBean("wmg");
		WishMessageGenerator generator=factor.getBean("wmg",WishMessageGenerator.class);
		// type casting
	 //WishMessageGenerator genertor = (WishMessageGenerator)obj;
	 //invoke bussiness method
	 String result = generator.generateMessage("Prasad");
	 System.out.println("Wish Message is ::"+result);
	}//main

}//class
