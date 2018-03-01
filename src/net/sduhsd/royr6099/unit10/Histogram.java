package net.sduhsd.royr6099.unit10;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{
		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();
	}

	public Histogram(char[] values, String fName)
	{
		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();
		
		fileName = fName;

		for (char searchLetter : values) {
			letters.add(searchLetter);
			count.add(0);
		}
		
		out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		Scanner file = new Scanner(new File(fileName));
		
		while (file.hasNextLine()) {
			String line = file.nextLine();
			
			for (char c : line.toCharArray()) {
				for (int i = 0; i < letters.size(); i++) {
					if (c == letters.get(i)) {
						count.set(i, count.get(i) + 1);
					}
				}
			}
		}
	}

	public char mostFrequent()
	{
		int max_i = -1;
		int max = 0;
		
		for (int i = 0; i < letters.size(); i++) {
			if (count.get(i) > max) {
				max = count.get(i);
				max_i = i;
			}
		}
		
		return letters.get(max_i);
	}

	public char leastFrequent()
	{
		int min_i = -1;
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < letters.size(); i++) {
			if (count.get(i) < min) {
				min = count.get(i);
				min_i = i;
			}
		}
		
		return letters.get(min_i);
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}