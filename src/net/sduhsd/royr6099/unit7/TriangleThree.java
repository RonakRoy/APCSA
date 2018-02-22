package net.sduhsd.royr6099.unit7;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree {
	private int size;
	private String letter;

	public TriangleThree() {
		setTriangle("#", 3);
	}

	public TriangleThree(int count, String let) {
		setTriangle(let, count);
	}

	public void setTriangle(String let, int sz) {
		letter = let;
		size = sz;
	}

	public String getLetter() {
		return "#";
	}

	public String toString() {
		String output = "";

		for (int i = 1; i <= size; i++) {
			for (int j = size - 1; j >= i; j--) {
				output += " ";
			}

			for (int j = i - 1; j >= 0; j--) {
				output += letter;
			}

			output += "\n";
		}

		return output + "\n";
	}
}