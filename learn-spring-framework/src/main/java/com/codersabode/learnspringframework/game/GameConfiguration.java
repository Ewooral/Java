package com.codersabode.learnspringframework.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfiguration {
    //        var game = new SuperContraGame();
    //         var game = new MarioGame();
    //         var game = new PackManGame();

    @Bean
    public GamingConsole game() {
        return new PackManGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        // object creation + wiring of dependencies
        return new GameRunner(game);
    }

}
