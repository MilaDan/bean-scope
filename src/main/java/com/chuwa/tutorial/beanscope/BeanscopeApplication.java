package com.chuwa.tutorial.beanscope;

import ch.qos.logback.core.status.StatusUtil;
import com.chuwa.tutorial.beanscope.beans.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class BeanscopeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanscopeApplication.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		// 1. singleton
//		SingletonDemo bean1 = context.getBean("singletonDemo", SingletonDemo.class);
//		SingletonDemo bean2 = context.getBean("singletonDemo", SingletonDemo.class);
//
//		System.out.println(bean1);
//		System.out.println(bean2);
//		if (bean1 == bean2) {
//			System.out.println("Singleton Scope: same object returned ...");
//		}

		// 2. prototype
//		PrototypeDemo obj1 = context.getBean("prototypeDemo", PrototypeDemo.class);
//		PrototypeDemo obj2 = context.getBean("prototypeDemo", PrototypeDemo.class);
//		System.out.println(obj1);
//		System.out.println(obj2);
//		if (obj1 == obj2) {
//			System.out.println("PrototypeDemo: obj1 and obj2 are same");
//		} else {
//			System.out.println("PrototypeDemo: obj1 and obj2 are not same");
//		}

		/**
		 * Student singleton vs. Student Prototype
		 */
//		Student student1 = context.getBean("student", Student.class);
//		student1.setName("chuwa");
//		System.out.println("student1: " + student1.getName());
//
//		Student student2 = context.getBean("student", Student.class);
//		System.out.println("student2: " + student2.getName());
//
//
//		StudentPrototype student3 = context.getBean("studentPrototype", StudentPrototype.class);
//		student3.setName("chuwa");
//		System.out.println("student3: " + student3.getName());
//
//		StudentPrototype student4 = context.getBean("studentPrototype", StudentPrototype.class);
//		System.out.println("student4: " + student4.getName());


		/**
		 * initialze
		 */
		// case1: prototype is not working
		School school = context.getBean("school", School.class);
		StudentPrototype stu1 = school.getStudentPrototype();
		StudentPrototype stu2 = school.getStudentPrototype();

//		System.out.println(school.getStudentPrototype());
//		System.out.println(school.getStudentPrototype());

		// case2: prototype work


	}

}
