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

public class Grades
{
	private double[] grades;
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);		
	}
	
	public void setGrades(String gradeList)
	{
		Scanner gradeScan = new Scanner(gradeList);
		int size = gradeScan.nextInt();
		
		grades = new double[size];
		
		gradeScan.next();
		
		for (int i = 0; i < size; i++) {
			grades[i] = gradeScan.nextDouble();
		}
	}
	
	public void setGrade(int spot, double grade)
	{
		grades[spot] = grade;
	}
	
	public Double getNumericGrade(int spot) {
		return grades[spot];
	}
	
	public char getLetterGrade(int spot) {
		double g = getNumericGrade(spot);
		
		if (g >= 90) {
			return 'A';
		}
		else if (g >= 80) {
			return 'B';
		}
		else if (g >= 70){
			return 'C';
		}
		else if (g >= 60) {
			return 'D';
		}
		
		return 'F';
	}
	
	public double getSum()
	{
		double sum=0.0;

		for (double g : grades){
			sum += g;
		}

		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;

		for (double g : grades) {
			low = Math.min(low, g);
		}

		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;

		for (double g : grades) {
			high = Math.max(high, g);
		}

		return high;
	}
	
	public int getNumGrades()
	{
		return grades.length;
	}
	
	public String toString()
	{
		String output="";
		
		for (double g: grades) {
			output += g + " ";
		}

		return output;
	}	
}