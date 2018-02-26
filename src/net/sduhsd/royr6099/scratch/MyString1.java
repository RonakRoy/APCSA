package net.sduhsd.royr6099.scratch;

public class MyString1 {
	private char[] array;
	
	public MyString1() {
		array = new char[0];
	}
	
	public MyString1(char[] chars) {
		array = chars;
	}

	public char charAt(int index) {
		return array[index];
	}

	public int length() {
		return array.length;
	}

	public MyString1 substring(int begin, int end) {
		char[] result = new char[end - begin];
		
		for (int i = begin; i < end; i++) {
			result[i - begin] = array[i];
		}
		
		return new MyString1(result);
	}

	public MyString1 toLowerCase() {
		char[] result = new char[array.length];
		
		for (int i = 0; i < array.length; i++) {
			char c = array[i];
			if ((int) c >= 65 && (int) c < 91) {
				result[i] = (char) ((int) c + 32);
			}
			else {
				result[i] = c;
			}
		}
		
		return new MyString1(result);
	}

	public boolean equals(MyString1 s) {		
		if (this.length() != s.length()) return false;
		
		for (int i = 0; i < this.length(); i++) {
			if (this.charAt(i) != s.charAt(i)) return false;
		}
		
		return true;
	}

	public static MyString1 valueOf(int i) {
		int length = (int) Math.ceil(Math.log10(i));
		char[] result = new char[length];
		
		for (int j = length-1; j >= 0; j--) {
			result[j] = (char) (i%10 + 48);
			i /= 10;
		}
		
		return new MyString1(result);
	}
	
	public String toNormalString() {
		return String.valueOf(array);
	}

}
