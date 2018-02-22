package net.sduhsd.royr6099.unit8;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class Grades {
	// instance variables
	double[] grades;

	// constructor
	public Grades() {
		set(new double[0]);
	}

	public Grades(double[] grades) {
		set(grades);
	}

	// set method
	public void set(double[] grades) {
		this.grades = grades;
	}

	private double getSum() {
		double sum = 0.0;

		for (double grade : grades) {
			sum += grade;
		}

		return sum;
	}

	public double getAverage() {
		double average = getSum() / grades.length;

		return average;
	}

	public String toString() {
		String output = "";

		for (int i = 0; i < grades.length; i++) {
			output += "grade " + i + ":";
			output += String.format("%7.2f", grades[i]);
			output += "\n";
		}

		output += "\naverage = " + String.format("%.2f", getAverage()) + "\n\n";

		return output;
	}

}