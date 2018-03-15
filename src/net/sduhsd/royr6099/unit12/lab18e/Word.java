package net.sduhsd.royr6099.unit12.lab18e;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

// VOWEL SORT

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word(String s)
	{
		word = s;
	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		
		int vowelCount = 0;

		for(char c : word.toCharArray()) {
			if (vowels.indexOf(c) != -1) vowelCount++;
		}
		
		return vowelCount;
	}

	@Override
	public int compareTo(Word rhs)
	{
		if ( this.numVowels() == rhs.numVowels()) {
			return this.word.compareTo(rhs.word);
		}
		return this.numVowels() - rhs.numVowels();
	}

	public String toString()
	{
		return word;
	}
}