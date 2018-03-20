package net.sduhsd.royr6099.unit14;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("Lab24d.dat"));
		
		int num_games = file.nextInt();
		file.nextLine();
		
		String games = "";
		while (file.hasNextLine()) {
			games += file.nextLine();
		}
		
		for (int i = 0; i < num_games; i++) {
			String game = games.substring(9 * i, 9 * (i+1));
			TicTacToe t3 = new TicTacToe(game);
			System.out.println(t3);
		}
	}
}