package net.sduhsd.royr6099.unit10.elevens;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 4;


	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		List<Integer> values1 = new ArrayList<Integer>();
		values1.add(0);
		values1.add(1);
		values1.add(2);
		values1.add(3);

		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.size(); k++) {
				System.out.print(" " + values1.get(k));
			}
			System.out.println();
		}
		
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		
		List<Integer> values2 = new ArrayList<Integer>();
		values2.add(0);
		values2.add(1);
		values2.add(2);
		values2.add(3);
		
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.size(); k++) {
				System.out.print(" " + values2.get(k));
			}
			System.out.println();
		}
		System.out.println();
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(List<Integer> values) {
		List<Integer> shuffled = new ArrayList<Integer>();
		for (int i = 0; i < values.size(); i++) {
			shuffled.add(0);
		}
		
		int a;
		
		if (values.size() % 2 == 0) {
			a = values.size() / 2;
		}
		else {
			a = (values.size() + 1) / 2;
		}
		
		int k = 0;
		for (int j = 0; j < a; j++) {
			shuffled.set(k, values.get(j));
			k += 2;
		}
		
		k = 1;
		for (int j = a; j < values.size(); j++) {
			shuffled.set(k, values.get(j));
			k += 2;
		}
		
		for (int i = 0; i < values.size(); i++) {
			values.set(i, shuffled.get(i));
		}
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(List<Integer> values) {
		int size = values.size();
		Random rand = new Random();
		
		for (int k = size - 1; k > 0; k--) {
			int r = rand.nextInt(k + 1);
			int buffer = values.get(k);
			values.set(k, values.get(r));
			values.set(r, buffer);
		}
	}
}
