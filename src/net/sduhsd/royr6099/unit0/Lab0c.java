package net.sduhsd.royr6099.unit0;

import java.util.Scanner;

public class Lab0c {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    
	    int int1, int2;
	    double double1, double2;
	    float float1, float2;
	    short short1, short2;
	    	    
	    System.out.println("Enter the first integer: ");
	    int1 = in.nextInt();
	    
	    System.out.println("Enter the second integer: ");
	    int2 = in.nextInt();
	    
	    System.out.println("Enter the first double: ");
	    double1 = in.nextDouble();
	    
	    System.out.println("Enter the second double: ");
	    double2 = in.nextDouble();
	    
	    System.out.println("Enter the first float: ");
	    float1 = in.nextFloat();
	    
	    System.out.println("Enter the second float: ");
	    float2 = in.nextFloat();
	    
	    System.out.println("Enter the first short: ");
	    short1 = in.nextShort();
	    
	    System.out.println("Enter the second short: ");
	    short2 = in.nextShort();
	    
	    System.out.println("integer one = " + int1);
	    System.out.println("integer two = " + int2);
	    System.out.println("int1 + int2 = " + (int1 + int2));
	    
	    System.out.println("double one = " + double1);
	    System.out.println("double two = " + double2);
	    System.out.println("double1 + double2 = " + (double1 + double2));
	    
	    System.out.println("float one = " + float1);
	    System.out.println("float two = " + float2);
	    System.out.println("float1 + float2 = " + (float1 + float2));
	    
	    System.out.println("short one = " + short1);
	    System.out.println("short two = " + short2);
	    System.out.println("short1 + short2 = " + (short1 + short2));
	}
}
