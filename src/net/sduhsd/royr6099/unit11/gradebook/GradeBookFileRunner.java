package net.sduhsd.royr6099.unit11.gradebook;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner file = new Scanner(new File("gradebook.dat"));

		String className = file.nextLine();
		
		int numStudents = file.nextInt();
		
		Class c = new Class(className, numStudents);

		file.nextLine();
		for (int i = 1; i <= numStudents; i++) {
			
			String stuName = file.nextLine();
			
			String gradeList = file.nextLine();
			
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