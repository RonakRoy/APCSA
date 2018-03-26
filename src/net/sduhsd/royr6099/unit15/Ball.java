package net.sduhsd.royr6099.unit15;

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable {
	private int xSpeed;
	private int ySpeed;

	public Ball() {
		this(200, 200);
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
	
	private boolean isInXRange(Block other) {
		return getX() >= other.getX() && getX() + this.getWidth() <= other.getX() + other.getWidth();
	}
	
	private boolean isInYRange(Block other) {
		return getY() >= other.getY() && getY() + this.getHeight() <= other.getY() + other.getHeight();
	}

	@Override
	public boolean didCollideLeft(Object obj) {
		Block other = (Block) obj;
		if (other == null) return false;
				
		return isInYRange(other)
				&& getX() + getWidth() > other.getX()
				&& getX() <= other.getX() + other.getWidth();
	}

	@Override
	public boolean didCollideRight(Object obj) {
		Block other = (Block) obj;
		if (other == null) return false;
		
		return isInYRange(other)
				&& getX() < other.getX() + other.getWidth()
				&& getX() + getWidth() >= other.getX();
	}

	@Override
	public boolean didCollideTop(Object obj) {
		Block other = (Block) obj;
		if (other == null) return false;
		
		return isInXRange(other) 
				&& other.getY() > getY() + getHeight()
				&& other.getY() + other.getHeight() <= getY();
	}

	@Override
	public boolean didCollideBottom(Object obj) {
		Block other = (Block) obj;
		if (other == null) return false;
		
		return isInXRange(other) 
				&& other.getY() >= getY() + getHeight()
				&& other.getY() + other.getHeight() < getY();
	}
}