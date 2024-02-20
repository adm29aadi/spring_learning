package com.example.demo.game;

public class MarioGame implements GamingConsole {
  
	public MarioGame() {
		System.out.println("MarioGame created");
	}
	public void up()
	{
		System.out.println("MarioGame jump up");
	}
	public void down()
	{
		System.out.println("MarioGame jump down");
	}
	public void left()
	{
		System.out.println("MarioGame get back");
	}
	public void right()
	{
		System.out.println("MarioGame go ahead");
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
