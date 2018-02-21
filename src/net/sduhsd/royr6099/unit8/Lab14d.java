package net.sduhsd.royr6099.unit8;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab14d
{
	public static void main( String args[] )
	{
		double[][] gradeArrays = {
				{100, 90, 85, 72.5, 95.6},
				{50.0, 100.0, 80.0},
				{93.4, -90.0, 90.0},
				{1, 2, 3, 4, 5, 6, 7, 8, 9}
		};
		Grades d = new Grades();
		
		for (double[] array: gradeArrays) {
			d.set(array);
			
			System.out.println(d);
		}
	}
}