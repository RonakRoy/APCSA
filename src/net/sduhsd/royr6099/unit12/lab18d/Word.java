package net.sduhsd.royr6099.unit12.lab18d;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

// LENGTH SORT

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}

	public int compareTo( Word rhs )
	{
		if (this.word.length() == rhs.word.length()) {
			return this.word.compareTo(rhs.word);
		}
		
		return this.word.length() - rhs.word.length();
	}

	public String toString()
	{
		return word;
	}
}