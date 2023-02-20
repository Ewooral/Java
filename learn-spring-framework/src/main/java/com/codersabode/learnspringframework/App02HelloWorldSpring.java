package com.codersabode.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args){
        // Launch a Spring Context
       var context =  new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);


        // Configure the things that we want Spring to manage -
        // HelloWorldConfiguration - @Configuration class
        // name - @Bean

        // Retrieving Beans managed by Spring
        System.out.println(context.getBean("greet"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address"));

    }
}
