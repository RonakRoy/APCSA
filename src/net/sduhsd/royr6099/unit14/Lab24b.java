package net.sduhsd.royr6099.unit14;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab24b
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File ("lab24b.dat"));
		int size = file.nextInt();
		file.nextLine();
		for(int i = 0; i<size; i++)
		{
			String word = file.next();
			System.out.println(new FancyWord(word));
	   }
	}
}