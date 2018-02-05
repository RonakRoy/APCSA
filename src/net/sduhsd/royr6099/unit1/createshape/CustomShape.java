package net.sduhsd.royr6099.unit1.createshape;

import java.awt.Color;
import java.awt.Graphics;

import net.sduhsd.royr6099.unit1.Shape;

public class CustomShape extends Shape {

	public CustomShape(int x, int y, int wid, int ht, Color[] col) {
		super(x, y, wid, ht, col);
	}

	@Override
	public void draw(Graphics window) {
		super.draw(window);
				
		int[] x = new int[6];
		x[0] = xPos;
		x[1] = xPos + width / 2;
		x[2] = xPos + width / 2;
		x[3] = xPos;
		x[4] = xPos - width / 2;
		x[5] = xPos - width / 2;
		
		int[] y = new int[6];
		y[0] = yPos;
		y[1] = yPos + height / 3;
		y[2] = yPos + 2 * height / 3;
		y[3] = yPos + height;
		y[4] = yPos + 2 * height / 3;
		y[5] = yPos + height / 3;
		
		
		window.setColor(color[0]);
		window.fillPolygon(x, y, 6);
		
		window.setColor(color[1]);
		window.fillOval(xPos - width / 2 + width / 6, yPos + height / 6, 2 * width / 3, 2 * height / 3);
	
		window.setColor(color[2]);
		window.drawRoundRect(xPos - width / 2, yPos, width, height, 80, 80);
	}
}
