package net.sduhsd.royr6099.unit11.gradebooklists;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Student implements Comparable<Student>
{
	private String myName;
	private Grades myGrades;
	private String gradeString;
	
	public Student()
	{
		setName("");
		setGrades("");
	}
	
	public Student(String name, String gradeList)
	{
		setName(name);
		setGrades(gradeList);
	}
	
	public void setName(String name)
	{
		myName = name;
	}	
	
	public void setGrades(String gradeList)
	{
		gradeString = gradeList;
		myGrades = new Grades(gradeList);
	}
	
	public String getGradeString() {
		return gradeString;
	}
	
	public void setGrade(int spot, double grade)
	{
		myGrades.setGrade(spot, grade);
	}

	public String getName()
	{
		return myName;
	}
	
	public int getNumGrades()
	{
		return myGrades.getNumGrades();
	}

	public double getSum()
	{
		return myGrades.getSum();
	}
	
	public double getAverage()
	{
		return myGrades.getSum() / myGrades.getNumGrades();
	}

	public double getAverageMinusLow()
	{
		return (myGrades.getSum() - myGrades.getLowGrade()) / (myGrades.getNumGrades() - 1);
	}
	
	public double getHighGrade()
	{
		return myGrades.getHighGrade();		
	}
	
	public double getLowGrade()
	{
		return myGrades.getLowGrade();	
	}
	
	public String toString()
	{
		return myName + " = " + myGrades;
	}

	@Override
	public int compareTo(Student other) {
		return (int) (1000 * (this.getAverage() - other.getAverage()));
	}
	
	public boolean equals(Student other) {
		return (other.getName().equals(this.getName()) &&
				other.getGradeString().equals(this.getGradeString()));
	}
}