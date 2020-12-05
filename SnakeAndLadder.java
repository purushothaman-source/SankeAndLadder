package com.program.snakeandladder;

import java.util.Random;
class SnakeAndLadderGame{
	public static void random() {
		Random random =new Random();
		int rollDie=random.nextInt(6)+1;
	}
}
//MainClass
public class SnakeAndLadder {
 //mainMethod
	public static void main(String[] args) {
		
		//initializing variable playerAPosition and rollDie
		int playerAPosition=0;
		int player=1;
		SnakeAndLadderGame.random();
		
				
	}	
}
	
