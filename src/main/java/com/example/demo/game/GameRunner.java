package com.example.demo.game;

public class GameRunner {
    private GamingConsole game;
	public GameRunner(GamingConsole game) {
		this.game=game;
		System.out.println("GameRunner instance created");
	}
	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
