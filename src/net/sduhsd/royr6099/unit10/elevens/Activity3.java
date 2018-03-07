package net.sduhsd.royr6099.unit10.elevens;

import java.util.Collections;
import java.util.List;
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
	
	public static boolean arePermutations(List<Integer> one, List<Integer> two) {
		Collections.sort(one);
		Collections.sort(two);
		
		for (int i = 0; i < one.size(); i++) {
			if (one.get(i) != two.get(i)) return false;
		}
		
		return true;
	}

}
