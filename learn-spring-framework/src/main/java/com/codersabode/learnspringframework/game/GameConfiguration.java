package com.codersabode.learnspringframework.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GameConfiguration {
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
