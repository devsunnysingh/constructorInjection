package com.devsunnysingh.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//We are using @Configuration annotation to tell Spring that this class is a configuration class.
//Henece, Spring will use this class to configure the application.
// And, it will create all the bean defined here the time of application startup as this is @Configuration annotation.
@Configuration
public class ApplicationConfig {
    //	Using @Bean annotation to create a bean.
    //    We use @Bean annotation to create a bean and we have named it myBean.

    @Qualifier("bean1")
    @Bean("myBean")
    public MyFirstClass myFirstBean(){
        return new MyFirstClass("This is the value of myVar");

    }
//    This is how we can create multiple beans.
    @Qualifier("bean2")
    @Bean("secondBean")
    public MyFirstClass mmySecondBean() {
        return new MyFirstClass("This is coming from the 2nd BEAN This is the value of myVar");

    }
}
