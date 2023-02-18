package com.codersabode.learnspringframework;

public class AppGamingBasic {
    public static void main(String[] args){
//        var game = new SuperContraGame();
//         var game = new MarioGame();
//         var game = new PackManGame();
        PackManGame game = new PackManGame();
         var gameRunner = new GameRunner(game);


         gameRunner.run();
    }
}
