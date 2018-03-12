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

public class StudentTester
{
   public static void main( String args[] )
   {
		Student stu = new Student("Billy Bob","5 - 90 85 95.5 77.5 88");
		out.println(stu);
		out.println("sum = " + stu.getSum());		
		out.println("average = " + stu.getAverage());	
		out.println("average after dropping low grade = " + stu.getAverageMinusLow());				
		out.println("low grade = " + stu.getLowGrade());		
		out.println("high grade = " + stu.getHighGrade());									
	}		
}