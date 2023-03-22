package com.codersabode.learnspringframework;

import java.io.Serializable;

public class SpringBeanVsJavaBean {
    public static void main(String[] args) {
        Pojo pojo = new Pojo();
        System.out.println(pojo);
    }
}

// Pojo means plain old java object
class Pojo{
private String text;
private int number;

public String toString(){
    return text + ":" + number;
}

}

// EJB enterprise java beans
class JavaBean implements Serializable {

    // EJB has no argument constructor
    public JavaBean(){

    }
    private String text;
    private int number;

    // have getters and setters
    public void setText(String Text){
        this.text = Text;
    }

    public String getText(){
        return this.text;
    }

    public void setNumber(int num){
        this.number = num;
    }

    public int getNumber(){
        return this.number;
    }

    /* implement a serializable
    Note that if you have a class that has all the above properties
    then an instance of the class becomes a java bean
    */
}