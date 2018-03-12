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

public class Class
{
	private String name;
	private Student[] studentList;
	
	public Class()
	{
		name="";
		studentList=new Student[0];
	}
	
	public Class(String name, int stuCount)
	{
		this.name = name;
		studentList = new Student[stuCount];
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList[stuNum] = s;
	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;

		for (Student s : studentList) {
			classAverage += s.getAverage();
		}

		return classAverage / studentList.length;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList[stuNum].getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		for (Student s : studentList) {
			if (s.getName().equals(stuName)) {
				return s.getAverage();
			}
		}

		return 0.0;
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList[stuNum].getName();
	}

	public String getStudentWithHighestAverage()
	{
		double high = Double.MIN_VALUE;
		String hName ="";

		for (Student s : studentList) {
			if (s.getAverage() > high) {
				hName = s.getName();
				high = s.getAverage();
			}
		}
		
		return hName;
	}

	public String getStudentWithLowestAverage()
	{
		double low = Double.MAX_VALUE;
		String lName ="";		

		for (Student s : studentList) {
			if (s.getAverage() < low) {
				lName = s.getName();
				low = s.getAverage();
			}
		}

		return lName;
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";

		for (Student s : studentList) {
			if (s.getAverage() <= failingGrade) {
				output += s.getName() + " ";
			}
		}
		
		return output;
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";

		for (Student s : studentList) {
			output += s + "\t" + s.getAverage() + "\n";
		}

		return output;
	}  	
}