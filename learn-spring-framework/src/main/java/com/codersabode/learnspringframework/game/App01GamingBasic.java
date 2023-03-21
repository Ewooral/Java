package com.codersabode.learnspringframework.game;

public class App01GamingBasic {
    public static void main(String[] args){
//        var game = new SuperContraGame();
//         var game = new MarioGame();
//         var game = new PackManGame();
        PackManGame game = new PackManGame();

        // object creation + wiring of dependencies
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
