package net.sduhsd.royr6099.unit6;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab09f
{
	public static void main( String args[] )
	{
		String[] strings = {
				"I am Sam I am",
				"ssssssssxssssesssssesss", 
				"qwertyqwertyqwerty", 
				"abababababa", 
				"abaababababa" 
		};
		
		char[] letters = {
				'a', 's', 'a', 'b', 'x'
		};
		
		LetterRemover lr = new LetterRemover();
		
		for (int i = 0; i < strings.length; i++) {
			lr.setRemover(strings[i], letters[i]);
			System.out.println(lr);
		}
	}
}