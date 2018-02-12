package net.sduhsd.royr6099.unit5;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Lab05d
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		char[] test_chars = {'A', '1', 'a', '7', 'D', '2', 'X', 'Z', '9'};
		
		
		out.print("Enter a character :: ");
		char letter = keyboard.next().charAt(0);
		CharacterAnalyzer test = new CharacterAnalyzer(letter);
		out.println(test);   //A
		
		for (char c:test_chars) {
			out.println("Enter a character :: " + c);
			CharacterAnalyzer tester = new CharacterAnalyzer(c);
			out.println(tester);
		}
	}
}