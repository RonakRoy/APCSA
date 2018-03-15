package net.sduhsd.royr6099.unit11.gradebooklists;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

import java.util.ArrayList;

public class Grades
{
	private List<Double> grades;
	
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
		
		grades = new ArrayList<Double>();
		
		gradeScan.next();
		
		for (int i = 0; i < size; i++) {
			grades.add(gradeScan.nextDouble());
		}
	}
	
	public void setGrade(int spot, double grade)
	{
		while (spot >= grades.size()) {
			grades.add(null);
		}
		grades.set(spot, grade);
	}
	
	public Double getNumericGrade(int spot) {
		return grades.get(spot);
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
		return Collections.min(grades);
	}
	
	public double getHighGrade()
	{
		return Collections.max(grades);
	}
	
	public int getNumGrades()
	{
		return grades.size();
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