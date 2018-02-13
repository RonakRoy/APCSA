package net.sduhsd.royr6099.scratch;

import java.util.Scanner;

public class workystuff {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String ssn = "";
		
		while (true) {
			System.out.println("Enter a social security number (DDD-DD-DDDD): ");
			
			String userSSN = input.next();
			
			if (checkSSN(userSSN)) {
				ssn = userSSN;
				break;
			}
			System.out.println("\"" + userSSN + "\" is not a valid SSN.\n");
		}
		
		System.out.println("\"" + ssn + "\" is a valid SSN.\n");
	}
	
	public static boolean checkSSN(String input) {
		for (int i = 0; i < 11; i++) {
			if (i == 3 || i == 6) {
				if (!isDash(input.substring(i))) {
					return false;
				}
			}
			else {
				if (!isDigit(input.substring(i))) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	private static boolean isDigit(String buffer) {
		char c = buffer.charAt(0);
		if ((int) c >= 48 && ((int) c <= 57)) {
			return true;
		}
		
		return false;
	}
	
	private static boolean isDash(String buffer) {
		char c = buffer.charAt(0);
		if (c == '-') {
			return true;
		}
		
		return false;
	}

}
