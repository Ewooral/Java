package com.codersabode.learnspringframework.game;

public class PackManGame implements GamingConsole {
    public void up(){
        System.out.println("move to the top");
    }

    public void down(){
        System.out.println("move to the bottom");
    }

    public void left(){
        System.out.println("retreat");
    }

    public void right(){
        System.out.println("Attack!");
    }
}
