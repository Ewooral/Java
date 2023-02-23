package com.codersabode.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/* A record is a new functionality introduced in jdk 16.
   constructor and parameters are automatically created.
 */

record Person(String name, int age){};
record Address(String City, int zipcode){};
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
      return "Elijah";
    }

    @Bean
    public String greet(){
        return "Hello, " +  name() + "!";
    }

    @Bean
    public int age(){
        return 15;
    }

    @Bean
    public Person person(){
        return new Person("Elijah", 30);
    }
    @Bean
    // using method calls
    public Person person2(){
        return new Person(name(), age());
    }

    // a bean name can be configured/ customized for one's own needs
    @Bean(name = "addressII")
    public Address address(){
        return new Address("Tema", 20338501-9);
    }
}
