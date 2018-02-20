package net.sduhsd.royr6099.unit7;

import java.util.Random;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;
	private int numGuesses;
	private int number;

	public GuessingGame(int stop)
	{
		upperBound = stop;
	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		
		number = 1 + rand.nextInt(upperBound);
		
		while (true) {
			System.out.print("Enter a guess from between 1 and " + upperBound + ": ");
			
			if (!keyboard.hasNextInt()) {
				System.out.println("That's not a number!");
				keyboard.nextLine();
			}
			else {
				int guess = keyboard.nextInt();
				
				if (guess > 0 && guess <= upperBound) {
					if (guess == number) {
						System.out.println("");
						
						System.out.println("It took " + numGuesses + " guesses for you to guess " + number + ".");
						System.out.println("You guessed wrong " + (int) (100 * (1 - 1.0 / numGuesses)) + "% of the time.");
						System.out.println("\n");
						break;
					}
					else {
						System.out.println("Nope.");
						numGuesses += 1;
					}
				}
				else {
					System.out.println(guess + " is out of range!");
				}
			}
		}
	}

	public String toString()
	{
		String output = "The current random number is " + number + "; The current number of guesses is " + numGuesses + ".";
		return output;
	}
}