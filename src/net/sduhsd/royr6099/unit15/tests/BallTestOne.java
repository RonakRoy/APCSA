package net.sduhsd.royr6099.unit15.tests;

import static java.lang.System.*;
import java.awt.Color;

import net.sduhsd.royr6099.unit15.gameelements.Ball;

class BallTestOne
{
	public static void main( String args[] )
	{
		Ball one = new Ball();
		out.println(one);
		
		Ball two = new Ball(100,90);
		out.println(two);
		
		Ball three = new Ball(100,100,30,50);
		out.println(three);
		
		Ball four = new Ball(100,100,30,50,Color.BLUE);
		out.println(four);
		
		Ball five = new Ball(100,100,30,50,Color.BLUE,5,6);
		out.println(five);
		
		Ball six = new Ball(100,100,30,50,Color.BLUE,5,6);
		out.println(six);		
		
		out.println(five.equals(four));		
		
		out.println(five.equals(five));										
	}
}