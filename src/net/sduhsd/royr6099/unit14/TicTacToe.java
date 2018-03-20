package net.sduhsd.royr6099.unit14;

import java.util.Scanner;

public class TicTacToe
{
	private char[][] charMat;

	public TicTacToe()
	{
		charMat = new char[3][3];
	}

	public TicTacToe(String game)
	{
		this();
		
		int loc = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {				
				charMat[i][j] = game.charAt(loc++);
			}
		}
	}

	public String getWinner()
	{
		// Scan Rows
		for (int r = 0; r < 3; r++) {
			String row = "";
			for (int c = 0; c < 3; c++) {
				row += charMat[r][c];
			}
			
			if (row.equals("XXX")) return "X wins horizontally!";
			if (row.equals("OOO")) return "O wins horizontally!";
		}
		
		// Scan Columns
		for (int c = 0; c < 3; c++) {
			String column = "";
			for (int r = 0; r < 3; r++) {
				column += charMat[r][c];
			}
			
			if (column.equals("XXX")) return "X wins vertically!";
			if (column.equals("OOO")) return "O wins vertically!";
		}
		
		// Scan Diagonals
		String diagonal1 = "";
		String diagonal2 = "";
		for (int i = 0; i < 3; i++) {
			diagonal1 += charMat[i][i];
			diagonal2 += charMat[2-i][i];

			
			if (diagonal1.equals("XXX")) return "X wins diagonally!";
			if (diagonal1.equals("OOO")) return "O wins diagonally!";
			
			if (diagonal2.equals("XXX")) return "X wins diagonally!";
			if (diagonal2.equals("OOO")) return "O wins diagonally!";
		}
		
		return "It's a tie.";
	}

	public String toString()
	{
		String output="";

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				output += charMat[i][j] + " ";
			}
			output += "\n";
		}
		
		output += getWinner();
		
		return output+"\n\n";
	}
}