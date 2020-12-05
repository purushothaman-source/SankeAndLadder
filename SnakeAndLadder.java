package com.program.snakeandladder;

import java.util.Random;
class SnakeAndLadderGame{
	

	
	public static void random(int playerAPosition) {
		Random random =new Random();
		int rollDie=random.nextInt(6)+1;
		System.out.println(logic(playerAPosition));
	}
	public static int logic(int playerAPosition) {
		Random random =new Random();
		int choice=random.nextInt(3);
		switch(choice) {
		case 1:playerAPosition=playerAPosition;
			   break;
		case 2:playerAPosition=playerAPosition+7;
			 break;
		case 3:if ((playerAPosition-7)>=0)
			playerAPosition=playerAPosition-7;
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
		SnakeAndLadderGame.random(playerAPosition);
		
				
	}	
}

