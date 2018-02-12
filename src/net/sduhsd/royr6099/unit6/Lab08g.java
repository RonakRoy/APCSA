package net.sduhsd.royr6099.unit6;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab08g
{
	public static void main ( String[] args )
	{
		LoopStats[] loopStats = {
				new LoopStats(1, 5),
				new LoopStats(2, 8),
				new LoopStats(5, 15)
			};
		
		for (LoopStats ls : loopStats) {
			System.out.println(ls);
			System.out.println("total =\t\t" + ls.getTotal());
			System.out.println("even count =\t" + ls.getEvenCount());
			System.out.println("odd count =\t" + ls.getOddCount());
			System.out.println("");
		}
	}
}