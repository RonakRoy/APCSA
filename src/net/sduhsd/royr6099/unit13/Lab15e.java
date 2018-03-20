package net.sduhsd.royr6099.unit13;

import java.util.Arrays;
import static java.lang.System.*;

public class Lab15e
{
	public static void main(String args[])
	{
		//test case 1
		int[] one = NumberSort.getSortedDigitArray(567891);
		for(int item : one)
		{
			System.out.print(item + " ");
		}
		System.out.println();
		
		//test case 2	
		int[] two = NumberSort.getSortedDigitArray(901912468);
		for(int item : two)
		{
			System.out.print(item + " ");
		}
		System.out.println();

		//test case 3
		int[] three = NumberSort.getSortedDigitArray(864213507);
		for(int item : three)
		{
			System.out.print(item + " ");
		}
		System.out.println();

	}
}