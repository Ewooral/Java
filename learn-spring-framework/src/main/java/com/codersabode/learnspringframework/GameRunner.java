package com.codersabode.learnspringframework;

public class GameRunner {
    private final GamingConsole game;
    MarioGame marioGame = new MarioGame();
    PackManGame packManGame = new PackManGame();


    public GameRunner(GamingConsole game){
        this.game = game;
    }
    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
        System.out.println(".......");
        marioGame.up();

        System.out.println(".......");
        packManGame.down();

    }
}
