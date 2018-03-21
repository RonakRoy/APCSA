package net.sduhsd.royr6099.unit14;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Maze
{
   private int[][] maze, original;

	public Maze()
	{
		maze = new int[0][0];
	}

	public Maze(int size, String line)
	{
		maze = new int[size][size];
		original = new int[size][size];
		
		Scanner input = new Scanner(line);
		
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				int digit = input.nextInt();
				
				maze[row][col] = digit;
				original[row][col] = digit;
			}
		}
		
		input.close();
	}

	public boolean hasExitPath(int r, int c)
	{
		//System.out.println(r + " " + c);
		if (inBounds(r, c)) {			
			if (maze[r][c] == 1) {
				maze[r][c] = 2;
				
				//System.out.println("\t" + r + " " + c);
				
				if (c == maze.length - 1) return true;
				
				if (hasExitPath(r-1, c)) return true;
				if (hasExitPath(r + 1, c)) return true;
					
				if (hasExitPath(r, c - 1)) return true;
				if (hasExitPath(r, c + 1)) return true;
			}
		}
		
		return false;
	}

	public String toString()
	{
		String output="";
		
		for (int row = 0; row < original.length; row++) {
			for (int col = 0; col < original.length; col++) {
				output += original[row][col] + " ";
			}
			output += "\n";
		}

		String foundString = "";
		
		boolean found = hasExitPath(0, 0);
		
		if (found) {
			foundString = "exit found";
		}
		else {
			foundString = "exit not found";
		}
		
		output += foundString + "\n";
		
		

		return output;
	}
	
	private boolean inBounds(int r, int c) {
		if (r < 0) return false;
		if (r >= maze.length) return false;
		
		if (c < 0) return false;
		if (c >= maze.length) return false;
		
		return true;
	}
}