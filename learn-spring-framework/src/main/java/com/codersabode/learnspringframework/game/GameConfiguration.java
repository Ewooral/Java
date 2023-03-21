package com.codersabode.learnspringframework.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GameConfiguration {
    @Bean
    @Primary
    public GamingConsole game() {
        return new PackManGame();
    }

    @Bean
    public GamingConsole newGame() {
        return new MarioGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        // object creation + wiring of dependencies
        return new GameRunner(game);
    }

    @Bean
    @Primary
    public GameRunner gameRunner1(GamingConsole newGame) {
        // object creation + wiring of dependencies
        return new GameRunner(newGame);
    }

}
