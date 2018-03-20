package net.sduhsd.royr6099.unit14;

public class Lab21g {

	public static void main(String[] args) {
		AtCounter ac = new AtCounter();
		
		int[][] inputs = {{0,0}, {2,5}, {5,0}, {9,9}, {3,9}};
		
		for (int i = 0; i < inputs.length; i++) {
			int r = inputs[i][0];
			int c = inputs[i][1];
			System.out.println(r + " " + c + " has " + ac.countAts(r, c));
		}
	}

}
