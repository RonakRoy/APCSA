package net.sduhsd.royr6099.unit13;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class Lab15d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("lab15d.dat"));
		
		int num = file.nextInt();
		file.nextLine();
		
		for (int i = 0; i < num; i++) {
			System.out.println(new FancyWords(file.nextLine()));
		}
	}
}