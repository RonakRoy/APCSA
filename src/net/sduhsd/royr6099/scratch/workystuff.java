package net.sduhsd.royr6099.scratch;

import java.util.Random;
import java.util.Scanner;

public class workystuff {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = scan.nextInt();
				
		String response = "not ";
		if (isPalindrome(number)) {
			response = "";
		}
		
		System.out.println(number + " is " + response + "a palindrome.");
	}
	
	public static int reverse(int number) {
		int result = 0;
		
		while (number >= 1) {
			result *= 10;
			result += number % 10;
			
			number /= 10;
		}
		
		return result;
	}
	
	public static boolean isPalindrome(int number) {
		return number == reverse(number);
	}
	
	public static String generatePlate() {
		String plate = "";
		
		Random rand = new Random();
		
		for (int i = 0; i < 3; i++) {
			char c = (char) (rand.nextInt(26) + 65);
			plate += c;
		}
		
		for (int i = 0; i < 4; i++) {
			char c = (char) (rand.nextInt(10) + 48);
			plate += c;
		}
		
		return plate;
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
	
	public static String decimalToBinary(int decimal) {
		String result = "";
		
		if (decimal > 255) {
			return "OVERFLOW";
		}
		else if (decimal < 0) {
			return "UNDERFLOW";
		}
		
		int powerOf2 = 128;
		
		for (int i = 0; i < 8; i++) {
			if (powerOf2 <= decimal) {
				result += "1";
				decimal -= powerOf2;
			}
			else {
				result += "0";
			}
			
			powerOf2 /= 2;
		}
		
		
		return result;
	}

}
