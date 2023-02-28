package com.codersabode.learnspringframework;

public class SpringBeanVsJavaBean {
    public static void main(String[] args) {
        Pojo pojo = new Pojo();
        System.out.println(pojo);
    }
}

class Pojo{ // Pojo means plain old java object
private String text;
private int number;

public String toString(){
    return text + ":" + number;
}

}