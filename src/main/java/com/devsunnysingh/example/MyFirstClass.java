package com.devsunnysingh.example;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//Component annotation is used to tell Spring that this class is a bean.
// We can create Bean using @Bean annotation.
// Here we are creating a bean of type MyFirstClass.

public class MyFirstClass {
    String myVar;

    public MyFirstClass(String myVar) {
        this.myVar = myVar;
    }

    public String sayHello(){
        return "Hello from the MyFirstClass====> myVar " + myVar;

    }

}
