package net.sduhsd.royr6099.unit3;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
		a = b = c = 0;
	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
 	}

	public void calcRoots()
	{
		double discriminant = 1.0 * b * b - 4.0 * a * c;
		
		double sqrt = Math.sqrt(discriminant);
		
		rootOne = (-1.0 * b + sqrt) / (2.0 * a);
		rootTwo = (-1.0 * b - sqrt) / (2.0 * a);
	}

	public void print()
	{
		String one = String.format("%.2f", rootOne);
		String two = String.format("%.2f", rootTwo);
		
		System.out.println("The roots are " + one + " and " + two);
	}
}