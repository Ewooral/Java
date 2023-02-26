package com.codersabode.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/* A record is a new functionality introduced in jdk 16.
   constructor and parameters are automatically created.
 */

record Person(String name, int age, Address address){};
record Address(String City){};
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
        return new Person("David", 30, new Address("Russia Dansoman"));
    }
    @Bean
    // using method calls
    public Person person2(){
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters( String name, int age, Address addressIII){// name, age, addressII
        return new Person(name, age, addressIII);
    }

    // a bean name can be configured/ customized for one's own needs
    @Bean(name = "addressII")
    public Address address(){
//        return new Address("Tema");
    }

    @Bean(name = "addressIII")
    public Address addressIII(){
        return new Address("Helsinki");
    }
}
