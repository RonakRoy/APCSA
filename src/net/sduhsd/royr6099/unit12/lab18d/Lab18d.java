package net.sduhsd.royr6099.unit12.lab18d;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.System.*;

public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("lab18d.dat"));

		int size = file.nextInt();
		file.nextLine();
		
		List<Word> words = new ArrayList<Word>();
		
		for (int i = 0; i <size; i++) {
			words.add(new Word(file.nextLine()));
		}
		
		Collections.sort(words);
		
		for (Word w : words) {
			System.out.println(w);
		}
		
	}
}