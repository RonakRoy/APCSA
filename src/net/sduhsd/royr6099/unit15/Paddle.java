package net.sduhsd.royr6099.unit15;

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block {
	// instance variables
	private int speed;

	public Paddle() {
		this(10, 10);
	}
	
	public Paddle(int x, int y) {
		this(x, y, 5);
	}
	
	public Paddle(int x, int y, int speed) {
		this(x, y, 10, 10, speed);
	}
	
	public Paddle(int x, int y, int w, int h, int speed) {
		this(x, y, w, h, Color.BLACK, speed);
	}

	public Paddle(int x, int y, int w, int h, Color c, int speed) {
		super(x, y, w, h, c);
		setSpeed(speed);
	}

	public void setSpeed(int s) {
		speed = s;
	}
	
	public void moveUpAndDraw(Graphics window) {
		draw(window, Color.WHITE);
		
		setY(getY() + speed);
		
		draw(window);
	}

	public void moveDownAndDraw(Graphics window) {
		draw(window, Color.WHITE);
		
		setY(getY() - speed);
		
		draw(window);
	}

	// add get methods
	public int getSpeed() {
		return speed;
	}

	// add a toString() method
	public String toString() {
		return super.toString() + " " + getSpeed();
	}
	
	public boolean equals(Object obj) {
		Paddle other = (Paddle) obj;
		
		if (other != null) {
			if (super.equals(obj)) {
				return other.getSpeed() == this.getSpeed();
			}
		}
		
		return false;
	}
}