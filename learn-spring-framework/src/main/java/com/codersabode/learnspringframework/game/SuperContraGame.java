package com.codersabode.learnspringframework.game;

import com.codersabode.learnspringframework.game.GamingConsole;

public class SuperContraGame implements GamingConsole {

    public void up(){
        System.out.println("up");
    }

    public void down(){
        System.out.println("sit down");
    }

    public void left(){
        System.out.println("Go back");
    }

    public void right(){
        System.out.println("shoot a bullet!");
    }
}
