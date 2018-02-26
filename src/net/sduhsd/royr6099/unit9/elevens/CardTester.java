package net.sduhsd.royr6099.unit9.elevens;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card c1 = new Card("3", "hearts", 14);
		Card c2 = new Card("K", "diamonds", 2);
		Card c3 = new Card("3", "hearts", 14);
		
		System.out.println("C1:");
		System.out.println(c1.rank());
		System.out.println(c1.suit());
		System.out.println(c1.pointValue());
		
		System.out.println("");
		
		System.out.println("C2:");
		System.out.println(c2.rank());
		System.out.println(c2.suit());
		System.out.println(c2.pointValue());
		
		System.out.println("");
		
		System.out.println("C3:");
		System.out.println(c3.rank());
		System.out.println(c3.suit());
		System.out.println(c3.pointValue());
		
		System.out.println("");
		
		System.out.println("C1: " + c1);
		System.out.println("C2: " + c2);
		System.out.println("C3: " + c3);
		
		System.out.println("");
		
		System.out.println("C1 equals C2: " + c1.matches(c2));
		System.out.println("C2 equals C3: " + c2.matches(c3));
		System.out.println("C1 equals C3: " + c1.matches(c3));
	}
}
