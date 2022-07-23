package com.manus.bean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.manus.bean")
@Configuration // Any can other class can be config as well
public class Client {
	public static void main(String[] args) {

//		ApplicationContext is eager initalizer
		
		ApplicationContext factory=
				new AnnotationConfigApplicationContext(Client.class); //Config class as param
		
		Employee emp = factory.getBean("emp", Employee.class);
		
		System.out.println(emp.hashCode());
		System.out.println(emp);
//		System.out.println(emp1.hashCode());
		
		

		
	}
}
