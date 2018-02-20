package net.sduhsd.royr6099.unit7;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		GuessingGame game;
		
		while (true) {
			System.out.print("Guessing Game - How many numbers? ");
			
			game = new GuessingGame(keyboard.nextInt());
			
			game.playGame();
			
			System.out.print("Would you like to play again? (y/n) ");
			if (keyboard.next().charAt(0) == 'n') {
				break;
			}
			keyboard.nextLine();
		}
	}
}