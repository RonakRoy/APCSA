package net.sduhsd.royr6099.unit2;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Line
{
	private int xOne, yOne, xTwo, yTwo;
	private double slope;

	public Line() {
		setCoordinates(0, 0, 0, 0);
	}
	
	public Line(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x1, y1, x2, y2);
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;

		xTwo = x2;
		yTwo = y2;
	}

	public void calculateSlope()
	{
		slope = 1.0 * (yTwo - yOne) / (xTwo - xOne);
	}

	public void print()
	{
		System.out.println("the slope is " + String.format("%.2f", slope));
	}
}