package net.sduhsd.royr6099.unit5;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
		setChar('A');
	}

	public CharacterAnalyzer(char c)
	{
		setChar(c);
	}

	public void setChar(char c)
	{
		theChar = c;
	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper()
	{
		if (getASCII() >= 65 && getASCII() <= 90) {
			return true;
		}

		return false;
	}

	public boolean isLower()
	{
		if (getASCII() >= 97 && getASCII() <= 122) {
			return true;
		}

		return false;
	}
	
	public boolean isNumber()
	{
		if (getASCII() >= 48 && getASCII() <= 57) {
			return true;
		}

		return false;
	}	

	public int getASCII()
	{
		return (int)theChar;
	}

	public String toString()
	{
		String type;
		if (isNumber()) {
			type = "a number";
		}
		else if (isLower()) {
			type = "a lowercase character";
		}
		else if (isUpper()) {
			type = "an uppercase character";
		}
		else {
			type = "some other type of symbol";
		}


		return "\'" + getChar() + "\' is a " + type + ". ASCII == " + getASCII() + "\n";	  
	}
}