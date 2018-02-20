package net.sduhsd.royr6099.unit7;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		this.number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int min = Math.min(a, Math.min(b, c));
		int max_factor = 1;
		
		for (int i = 1; i <= min; i++) {
			if (a % i == 0 && b % i == 0 && c % i == 0) {
				max_factor = i;
			}
		}

		return max_factor;
	}

	public String toString()
	{
		String output = "";
		
		for (int a = 1; a <= number; a++) {
			for (int b = a + 1; b <= number; b++) {
				for (int c = b + 1; c <= number; c++) {
					if (a * a + b * b == c * c && greatestCommonFactor(a, b, c) == 1) {
						output += a + " " + b + " " + c + "\n";
					}
				}
			}
		}
		
		return output + "\n";
	}
}