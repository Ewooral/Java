package com.codersabode.learnspringframework;

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
class JavaBean {

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
}