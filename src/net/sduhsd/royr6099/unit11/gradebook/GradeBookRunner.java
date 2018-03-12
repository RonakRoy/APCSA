package net.sduhsd.royr6099.unit11.gradebook;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class GradeBookRunner
{
   public static void main( String args[] )
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner keyboard = new Scanner(System.in);

		System.out.print("What is the name of this class? ");
		String className = keyboard.nextLine();
		
		System.out.print("How many students are in this class? ");
		int numStudents = keyboard.nextInt();
		
		Class c = new Class(className, numStudents);

		for (int i = 1; i <= numStudents; i++) {
			System.out.print("Enter the name for student " + i + ": ");
			String stuName = keyboard.nextLine();
			
			System.out.println("Enter the grades for " + stuName + ", using the format (x - grade grade ...)");
			String gradeList = keyboard.nextLine();
			
			Student s = new Student(stuName, gradeList);
			
			c.addStudent(i - 1, s);
		}
		
		out.println(c);

		out.println("Failure List = " + c.getFailureList(70));	
		out.println("Highest Average = " + c.getStudentWithHighestAverage());
		out.println("Lowest Average = " + c.getStudentWithLowestAverage());
								
		out.println(String.format("Class Average = %.2f",c.getClassAverage()));

	}		
}