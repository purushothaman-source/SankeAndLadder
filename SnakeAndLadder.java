package com.program.snakeandladder;

import java.util.Random;
class SnakeAndLadderGame{
	
	public static void rollDies(int playerAPosition) {
		Random random =new Random();
		int rollDie=random.nextInt(6)+1;
		snakeLadder(playerAPosition,rollDie));
	}
	public static int snakeLadder(int playerAPosition,int rollDie ) {
		Random random =new Random();
		int choice=random.nextInt(3);
		final int noPlay=0;
		final int ladder=1;
		final int snake=2;
		
		switch(choice) {
		case noPlay:playerAPosition=playerAPosition+0;
			   break;
		case ladder:playerAPosition=playerAPosition+rollDie;
			 break;
		case snake:if ((playerAPosition-rollDie)<=0) {
			  playerAPosition=0;
		       }
		       else {
			    playerAPosition=playerAPosition-rollDie;
		       }
			   break;
		}
	return playerAPosition;	
	}
}
//MainClass
public class SnakeAndLadder {
 //mainMethod
	public static void main(String[] args) {
		
		//initializing variable playerAPosition and rollDie
		int playerAPosition=0;
		int player=1;
		SnakeAndLadderGame.rollDies(playerAPosition);		
	}	
}

