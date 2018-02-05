package net.sduhsd.royr6099.unit1;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Shape
{
	public int xPos;
	public int yPos;
	public int width;
	public int height;
	public Color[] color;

   public Shape(int x, int y, int wid, int ht, Color[] col)
   {
		xPos = x;
		yPos = y;
		
		width = wid;
		height = ht;
		
		color = col;
   }


   public void draw(Graphics window)
   {
   }

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height;
   }
}