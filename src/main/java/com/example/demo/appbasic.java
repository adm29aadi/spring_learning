package com.example.demo;

import com.example.demo.game.GameRunner;
import com.example.demo.game.MarioGame;

public class appbasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    var mariogame= new MarioGame();
    var gamerunner= new GameRunner(mariogame);
    gamerunner.run();
	}
}
