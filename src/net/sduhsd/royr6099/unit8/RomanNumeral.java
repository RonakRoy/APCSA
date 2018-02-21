package net.sduhsd.royr6099.unit8;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS = {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		setRoman(str);
	}

	public RomanNumeral(Integer orig)
	{
		setNumber(orig);
	}

	public void setNumber(Integer num)
	{
		number = num;
		roman = "";
		
		while (num > 0) {
			for (int i = 0; i < NUMBERS.length; i++) {
				if (NUMBERS[i] <= num) {
					num -= NUMBERS[i];
					roman += LETTERS[i];
					
					break;
				}
			}
		}
	}

	public void setRoman(String rom)
	{
		roman = rom;
		number = 0;
		
		while (rom.length() > 0) {
			boolean moveOn = true;
			if (rom.length() > 1) {
				String firstTwo = rom.substring(0, 2);
				for (int i = 0; i < LETTERS.length; i++) {
					if (LETTERS[i].equals(firstTwo)) {
						number += NUMBERS[i];
						rom = rom.substring(2);
						
						moveOn = false;
						
						break;
					}
				}
			}
			
			if (moveOn) {
				String firstOne = rom.substring(0, 1);
				for (int i = 0; i < LETTERS.length; i++) {
					if (LETTERS[i].equals(firstOne)) {
						number += NUMBERS[i];
						rom = rom.substring(1);
						
						break;
					}
				}
			}
		}
	}

	public Integer getNumber()
	{
		return number;
	}

	public String toString()
	{
		return roman + "\n";
	}
}