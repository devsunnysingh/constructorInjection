package com.devsunnysingh.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {



    private final MyFirstClass myFirstClass;
//    By using @Autowired annotation, we are telling Spring that this field is a dependency of this class.
//    Spring will inject the value of this field when it creates the bean of this class.
//    Using @Qualifier annotation, we are telling Spring which bean to use
    @Autowired
    public MyFirstService(@Qualifier("bean2") MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    public String tellAStory(){
//This method is sjsust making a call to the sayHello method of the MyFirstClass.
        return "The dependancy is saying : "+myFirstClass.sayHello();
    }

}
