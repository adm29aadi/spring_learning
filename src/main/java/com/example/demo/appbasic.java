package com.example.demo;

import com.example.demo.game.GameRunner;
import com.example.demo.game.MarioGame;
import com.example.demo.game.PocmanGame;

public class appbasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MarioGame game1= new MarioGame();
    PocmanGame game2=new PocmanGame();
    var gamerunner= new GameRunner(game1);
    var gamerunner2=new GameRunner(game2);
    gamerunner.run();
    gamerunner2.run();
    System.out.println("the Shot of an Emperor #kingkohali");
	}
}
