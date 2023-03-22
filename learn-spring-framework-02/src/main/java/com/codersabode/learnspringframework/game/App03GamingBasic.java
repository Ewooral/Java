package com.codersabode.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingBasic {
    public static void main(String[] args) {
        // create a spring context
        try (var context = new AnnotationConfigApplicationContext(GameConfiguration.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
