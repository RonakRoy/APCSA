package net.sduhsd.royr6099.scratch;

import java.util.Random;
import java.util.Scanner;

public class workystuff {
	public static void main(String[] args) {
		char[] arr1 = {'A', 'B', '1', 'D', 'E', 'F', 'G'};
		MyString1 string1 = new MyString1(arr1);
		
		char[] arr2 = {'A', 'B', '1', 'D', 'E', 'F', 'G'};
		MyString1 string2 = new MyString1(arr2);
		
		System.out.println(MyString1.valueOf(14872).toNormalString());
	}

	public static void printResults(int[] counts, int min, int max) {		
		for (int i = min; i <= max; i++) {
			System.out.println(i + " was generated " + counts[i - min] + " times.");
		}
	}

	public static int[] generateRandom(int number, int min, int max) {
		int[] counts = new int[max - min + 1];
		
		Random r = new Random();
		
		for (int i = 0; i < number; i++) {
			int n = r.nextInt(max + 1) + min;
			
			counts[n - min]++;
		}
		
		return counts;
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
