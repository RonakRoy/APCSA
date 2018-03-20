package net.sduhsd.royr6099.unit14;

import java.util.Arrays;

public class AtCounter {
	private char[][] mat;
	private int count;

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
		
		countAtsSub(r, c);
		return count;
	}
	
	private void countAtsSub(int r, int c) {
		System.out.println(count);
		if (inBounds(r, c) && mat[r][c] == '@') {
			mat[r][c] = '+';
			
			count++;
				
			countAts(r = 1, c - 1);
			countAts(r - 1, c + 1);
				
			countAts(r + 1, c - 1);
			countAts(r + 1, c + 1);

		}
	}

	public int getAtCount() {
		return count;
	}

	public String toString() {
		return getAtCount() + " @s connected.";
	}
	
	private boolean inBounds(int r, int c) {
		if (r < 0) return false;
		if (r >= mat.length) return false;
		
		if (c < 0) return false;
		if (c >= mat[0].length) return false;
		
		return true;
	}
}