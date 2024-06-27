package com.devsunnysingh.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		var ctx=SpringApplication.run(ExampleApplication.class, args);
//This tells to look for a bean by the name myFirstClass and of type MyFirstClass.
// 	If we give the wrong name or type of the bean, it will throw an exception.
//	It will also work if we give the name to a bean as myBean using @Bean(name_of_bean) annotation.
//	Example: MyFirstClass myFirstClass2 = ctx.getBean("myBean",MyFirstClass.class);

		MyFirstService myFirstService=ctx.getBean(MyFirstService.class);
		System.out.println(myFirstService.tellAStory());

	}


}
