package net.sduhsd.royr6099.unit13;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSort
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;

		int copy = number;
		while (copy > 0) {
			copy /= 10;
			count += 1;
		}
		return count;
	}
	
	public static int[] getSortedDigitArray(int number)
	{
		int numDigits = getNumDigits(number);
		int[] sorted = new int[numDigits];

		int copy = number;
		
		for (int i = numDigits - 1; i >= 0; i--) {
			sorted[i] = copy % 10;
			copy /= 10;
		}
		
		Arrays.sort(sorted);

		return sorted;
	}
}