package net.sduhsd.royr6099.unit14;

import java.util.Arrays;

public class AtCounter {
	private char[][] mat;
	private int r, c, count;

	private void init() {
		count = 0;
		mat = new char[][] {
			{ '@', '-', '@', '-', '-', '@', '-', '@', '@', '@' },
			{ '@', '@', '@', '-', '@', '@', '-', '@', '-', '@' },
			{ '-', '-', '-', '-', '-', '-', '-', '@', '@', '@' },
			{ '-', '@', '@', '@', '@', '@', '-', '@', '-', '@' },
			{ '-', '@', '-', '@', '-', '@', '-', '@', '-', '@' },
			{ '@', '@', '@', '@', '@', '@', '-', '@', '@', '@' },
			{ '-', '@', '-', '@', '-', '@', '-', '-', '-', '@' },
			{ '-', '@', '@', '@', '-', '@', '-', '-', '-', '-' },
			{ '-', '@', '-', '@', '-', '@', '-', '@', '@', '@' },
			{ '-', '@', '@', '@', '@', '@', '-', '@', '@', '@' }
		};
	}
	
	public AtCounter() {
		init();
	}

	public int countAts(int r, int c) {
		init();
		
		this.r = r;
		this.c = c;
		
		countAts(r, c, 0);
		return count;
	}
	
	private void countAts(int r, int c, int stackPoint) {
		//System.out.println("[" + (stackPoint) + "] " + r + " " + c);
		if (inBounds(r, c)) {
			//System.out.println(r + " " + c + ": " + mat[r][c]);
			
			if (mat[r][c] == '@') {
				mat[r][c] = '+';
				//System.out.println("\t" + r + " " + c + ": " + mat[r][c]);
				
				count++;
				
				countAts(r - 1, c, stackPoint + 1);
				countAts(r + 1, c, stackPoint + 1);
					
				countAts(r, c - 1, stackPoint + 1);
				countAts(r, c + 1, stackPoint + 1);
			}
		}
		
	}

	public int getAtCount() {
		return count;
	}

	public String toString() {
		return r + " " + c + " has " + getAtCount() + " @s connected.";
	}
	
	private boolean inBounds(int r, int c) {
		if (r < 0) return false;
		if (r >= mat.length) return false;
		
		if (c < 0) return false;
		if (c >= mat[0].length) return false;
		
		return true;
	}
}