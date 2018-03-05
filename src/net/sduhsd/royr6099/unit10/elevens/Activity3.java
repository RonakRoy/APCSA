package net.sduhsd.royr6099.unit10.elevens;

import java.util.Arrays;
import java.util.Random;

public class Activity3 {
	public static String flip() {
		Random rand = new Random();
		
		int flip = rand.nextInt(3);
		
		if (flip == 0) {
			return "heads";
		}
		else {
			return "tails";
		}
	}
	
	public static boolean arePermutations(int[] one, int[] two) {
		Arrays.sort(one);
		Arrays.sort(two);
		
		for (int i = 0; i < one.length; i++) {
			if (one[i] != two[i]) return false;
		}
		
		return true;
	}

}
