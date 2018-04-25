package net.sduhsd.royr6099.unit17;

import java.awt.Color;
import java.awt.Graphics;

public abstract class MovingThing implements Locatable {
	private int xPos;
	private int yPos;

	public MovingThing() {
		this(100, 0);
	}

	public MovingThing(int x, int y) {
		setPos(x, y);
	}

	public void setPos(int x, int y) {
		setX(x);
		setY(y);
	}

	public void setX(int x) {
		xPos = x;
	}

	public void setY(int y) {
		yPos = y;
	}

	public int getX() {
		return xPos;
	}

	public int getY() {
		return yPos;
	}

	public abstract void setSpeed(int s);
	public abstract int getSpeed();
	public abstract void draw(Graphics window);

	public void move(String direction) {
		if (direction.equals("LEFT"))
			setX(getX() - getSpeed());
		else if (direction.equals("RIGHT"))
			setX(getX() + getSpeed());
		else if (direction.equals("UP"))
			setY(getY() - getSpeed());
		else if (direction.equals("DOWN"))
			setY(getY() + getSpeed());
	}

	public String toString() {
		return xPos + " " + yPos;
	}
}