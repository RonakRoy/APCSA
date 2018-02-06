package net.sduhsd.royr6099.unit3;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	public static void main( String[] args )
	{
Scanner in = new Scanner(System.in);
		
		System.out.println("Enter x1:");
		int x1 = in.nextInt();
		
		System.out.println("Enter y1:");
		int y1 = in.nextInt();
		
		System.out.println("Enter x2:");
		int x2 = in.nextInt();
		
		System.out.println("Enter y2:");
		int y2 = in.nextInt();
		
		Distance d = new Distance(x1, y1, x2, y2);
		d.calcDistance();
		
		d.print();
	}
}