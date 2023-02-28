package com.codersabode.learnspringframework;

public class SpringBeanVsJavaBean {
    public static void main(String[] args) {
        Pojo pojo = new Pojo();
    }
}

class Pojo{
private String text;
private int number;

public String toString(){
    return text + ":" + number;
}

}