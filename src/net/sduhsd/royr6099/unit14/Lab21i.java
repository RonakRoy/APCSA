package net.sduhsd.royr6099.unit14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab21i {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner file = new Scanner(new File("lab21i.dat"));
		
		List<String> inputStrings = new ArrayList<String>();
		List<Integer> inputSizes = new ArrayList<Integer>();
		
		while (file.hasNextLine()) {
			int size = file.nextInt();
			file.nextLine();
			String string = file.nextLine();
			
			inputSizes.add(size);
			inputStrings.add(string);
		}
		
		for (int i = 0; i < inputSizes.size(); i++) {
			System.out.println(new Maze(inputSizes.get(i), inputStrings.get(i)));
		}
		
		file.close();
	}
}
