package com.example.demo.game;

public class PocmanGame implements GamingConsole{
	public PocmanGame() {
		System.out.println("PocmanGame created");
	}
	public void up()
	{
		System.out.println("PocmanGame jump up");
	}
	public void down()
	{
		System.out.println("PocmanGame jump down");
	}
	public void left()
	{
		System.out.println("PocmanGame get back");
	}
	public void right()
	{
		System.out.println("PocmanGame go ahead");
	}
}
