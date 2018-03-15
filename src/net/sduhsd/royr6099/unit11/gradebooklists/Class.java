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

public class Class
{
	private String name;
	private List<Student> studentList;
	
	public Class()
	{
		name="";
		studentList = new ArrayList<Student>();
	}
	
	public Class(String name, int stuCount)
	{
		this.name = name;
		studentList = new ArrayList<Student>();
	}
	
	public void addStudent(int stuNum, Student s)
	{
		while (stuNum >= studentList.size()) {
			studentList.add(null);
		}
		studentList.set(stuNum, s);
	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public void sort() {
		Collections.sort(studentList);
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;

		for (Student s : studentList) {
			classAverage += s.getAverage();
		}

		return classAverage / studentList.size();
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList.get(stuNum).getAverage();
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
		return studentList.get(stuNum).getName();
	}

	public String getStudentWithHighestAverage()
	{
		return Collections.max(studentList).getName();
	}

	public String getStudentWithLowestAverage()
	{
		return Collections.min(studentList).getName();
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
			output += s + "\t" + String.format("%.2f", s.getAverage()) + "\n";
		}

		return output;
	}  	
}