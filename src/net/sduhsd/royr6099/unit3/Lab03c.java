package net.sduhsd.royr6099.unit3;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a:");
		int a = in.nextInt();
		
		System.out.println("Enter b:");
		int b = in.nextInt();
		
		System.out.println("Enter c:");
		int c = in.nextInt();
		
		Quadratic q = new Quadratic(a,b,c);
		q.calcRoots();
		
		q.print();
	}
}