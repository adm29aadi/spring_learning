package com.example.demo.game;

public class GameRunner {
    MarioGame mariogame;
	public GameRunner(MarioGame mariogame) {
		this.mariogame=mariogame;
		System.out.println("GameRunner instance created");
	}
	public void run() {
		mariogame.up();
		mariogame.down();
		mariogame.left();
		mariogame.right();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
