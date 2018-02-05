package net.sduhsd.royr6099.unit1.lab1d;

import java.awt.Color;
import java.awt.Graphics;

import net.sduhsd.royr6099.unit1.Shape;

public class RobotShape extends Shape {

	public RobotShape(int x, int y, int wid, int ht, Color[] col) {
		super(x, y, wid, ht, col);
	}

	@Override
	public void draw(Graphics window) {
		super.draw(window);
				
		window.setColor(color[0]);
		window.fillRoundRect(xPos - width / 2, yPos, width, height, 30, 30);
		
		window.setColor(color[1]);
		window.drawLine(xPos + width / 2, yPos, xPos + width, yPos + height / 2);
		window.drawLine(xPos - width / 2, yPos, xPos - width, yPos + height / 2);
		
		window.drawLine(xPos + width / 2, yPos + height, xPos + width, yPos + 3 * height / 2);
		window.drawLine(xPos - width / 2, yPos + height, xPos - width, yPos + 3 * height / 2);
	
		window.setColor(color[2]);
		window.fillRoundRect(xPos - width / 3, yPos + 50, 2 * width / 3, 50, 20, 20);
		
		window.setColor(color[3]);
		window.fillOval(xPos - width / 2, yPos + 10, 20, 20);
		window.fillOval(xPos + width / 3, yPos + 10, 20, 20);
		
		window.setColor(Color.BLACK);
		window.drawChars("Beep Boop".toCharArray(), 0, 9, xPos, yPos);
		
		
	}
}
