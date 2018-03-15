package net.sduhsd.royr6099.unit12.lab18e;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.System.*;


public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("lab18e.dat"));

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