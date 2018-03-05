package net.sduhsd.royr6099.scratch;

public class MyInteger {
	private int value;
	
	public MyInteger() {
		this(0);
	}
	
	public MyInteger(int value) {
		this.value = value;
	}
	
	
	
	public int getValue() {
		return value;
	}
	
	
	
	public boolean isEven() {
		return isEven(value);
	}
	
	public boolean isOdd() {
		return isOdd(value);
	}
	
	public boolean isPrime() {
		return isPrime(value);
	}
	
	
	public static boolean isEven(int value) {
		return value % 2 == 0;
	}
	
	public static boolean isOdd(int value) {
		return value % 2 == 1;
	}
	
	public static boolean isPrime(int value) {
		for (int i = 2; i < (int) Math.sqrt(value) + 1; i++) {
			if (value % i == 0) return false;
		}
		return true;
	}
	
	
	public static boolean isEven(MyInteger value) {
		return value.isEven();
	}
	
	public static boolean isOdd(MyInteger value) {
		return value.isOdd();
	}
	
	public static boolean isPrime(MyInteger value) {
		return value.isPrime();
	}
	
	
	
	public boolean equals(int value) {
		return this.value == value;
	}
	
	public boolean equals(MyInteger value) {
		return this.equals(value.getValue());
	}
	
	
	public static int parseInt(char[] digits) {
		int val = 0;
		
		for (int i = 0; i < digits.length; i++) {
			val += (int)digits[i] - 48;
			val *= 10;
		}
		
		return val / 10;
	}
	
	public static int parseInt(String str) {
		return parseInt(str.toCharArray());
	}
	
	public String toString() {
		return "" + value;
	}
}
