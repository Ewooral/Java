package com.codersabode.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/* A record is a new functionality introduced in jdk 16.
   constructor and parameters are automatically created.
   A record does not need a constructor, setter or getter unlike a
   class that needs all of that.
 */

record Person(String name, int age, Address address, PlaceOfWork work){};
record Address(String City){};
record PlaceOfWork(String name, int areaCode){};
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
        return new Person("David", 30, new Address("Russia Dansoman"), new PlaceOfWork("Meta", 88800));
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
        return new Address("Tema");
    }

    @Bean(name = "addressIII")
    public Address addressIII(){
        return new Address("Helsinki");
    }
    @Bean
    public int school_id(){
        return 20338501;
    }

    @Bean
    public PlaceOfWork placeOfWork(){
        return new PlaceOfWork("Google", 10980);
    }
     @Bean(name = "workPlace")
    public PlaceOfWork placeOfWork1(){
        return new PlaceOfWork("Bloomberg", 908882);
    }

}
