package net.sduhsd.royr6099.unit15;

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block {
	private int xSpeed;
	private int ySpeed;

	public Ball() {
		super(200, 200);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y) {
		this(x, y, 10, 10);
	}
	
	public Ball(int x, int y, int w, int h) {
		this(x, y, w, h, Color.BLACK);
	}

	public Ball(int x, int y, int w, int h, Color c) {
		this(x, y, w, h, c, 3, 1);
	}
	
	public Ball(int x, int y, int w, int h, Color c, int xSpd, int ySpd) {
		super(x, y, w, h, c);
		
		setXSpeed(xSpd);
		setYSpeed(ySpd);
	}
	
	public void setXSpeed(int xSpd) {
		xSpeed = xSpd;
	}
	
	public void setYSpeed(int ySpd) {
		ySpeed = ySpd;
	}
	
	public int getXSpeed() {
		return xSpeed;
	}
	
	public int getYSpeed() {
		return ySpeed;
	}

	public void moveAndDraw(Graphics window) {
		// draw a white ball at old ball location
		draw(window, Color.WHITE);

		setX(getX() + xSpeed);
		setY(getY() + ySpeed);

		// draw the ball at its new location
		draw(window);
	}

	public boolean equals(Object obj) {
		Ball other = (Ball) obj;
		
		if (other != null) {
			if (super.equals(obj)) {
				return other.getXSpeed() == this.getXSpeed() &&
						other.getYSpeed() == this.getYSpeed();
			}
		}
		
		return false;
	}

	public String toString() {
		return super.toString() + "  " + xSpeed + " " + ySpeed;
	}
}