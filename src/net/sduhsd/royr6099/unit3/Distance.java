package net.sduhsd.royr6099.unit3;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int x1,y1,x2,y2;
	private double distance;

	public Distance()
	{
		x1 = x2 = y1 = y2 = 0;
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x1, y1, x2, y2);
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public void calcDistance()
	{
		double dx = x2 - x1;
		double dy = y2 - y1;
		
		distance = Math.sqrt(Math.pow(dx, 2.0) + Math.pow(dy, 2.0));
	}

	public void print( )
	{
		System.out.println("The distance between (" + x1 + ", " + y1 + ") and " + x2 + ", " + y2 + ") is " + String.format("%.3f", distance));
	}
}