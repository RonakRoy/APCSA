package net.sduhsd.royr6099.unit2;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Circle
{
	private double radius;
	private double area;
	
	public Circle(double radius) {
		setRadius(radius);
	}

	public void setRadius(double rad)
	{
		radius = rad;
	}

	public void calculateArea()
	{
		area = Math.PI * radius * radius;
	}

	public void print()
	{
		System.out.print("The area of the circle with radius " + radius + " is equal to ");
		System.out.printf("%.4f", area);
		
		System.out.println("");
	}
}