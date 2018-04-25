package net.sduhsd.royr6099.unit17;

public class Aliens {
	private Alien[][] aliens;
	private boolean[][] movingRight;
	
	private final int num_rows = 4;
	private final int num_cols = 4;
	
	public Aliens() {
		aliens = new Alien[num_rows][num_cols];
		movingRight = new boolean[num_rows][num_cols];
		
		for (int row = 0; row < num_rows; row++) {
			int start = 0;
			
			if (row % 2 == 0) {
				start = 10;
			}
			else {
				start = 300;
			}
			
			for (int col = 0; col < num_cols; col++) {
				aliens[row][col] = new Alien(start + row * 80, 50 + col * 80, (int) (Math.random() * 2) + 2);
				movingRight[row][col] = true;
			}
		}
	}
	
	public void kill(int r, int c) {
		aliens[r][c] = null;
	}
	
	public Alien get(int r, int c) {
		return aliens[r][c];
	}
	
	public boolean getMovingRight(int r, int c) {
		return movingRight[r][c];
	}
	
	public void reverseMovingRight(int r, int c) {
		movingRight[r][c] = !movingRight[r][c];
	}
	
	public int getNumRows() {
		return num_rows;
	}
	
	public int getNumCols() {
		return num_cols;
	}
}
