package net.sduhsd.royr6099.unit7;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Lab11c
{
   public static void main( String args[] )
   {
	   int[] sizes = {3, 7, 1, 5, 4};
	   String[] letters = {"A", "X", "R", "T", "W"};
	   
	   TriangleThree t = new TriangleThree();
	   
	   for (int i = 0; i < sizes.length; i++) {
		   t.setTriangle(letters[i], sizes[i]);
		   
		   System.out.println(t);
	   }
   }
}