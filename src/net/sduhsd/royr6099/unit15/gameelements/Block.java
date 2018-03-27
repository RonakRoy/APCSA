package net.sduhsd.royr6099.unit15.gameelements;

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable {
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block() {
		this(100,150);
	}

	public Block(int x, int y) {
		this(x, y, 10, 10);
	}
	
	public Block(int x, int y, int w, int h) {
		this(x, y, w, h, Color.BLACK);
	}
	
	public Block(int x, int y, int w, int h, Color c) {
		setX(x);
		setY(y);
		setWidth(w);
		setHeight(h);
		
		setColor(c);
	}
	
	public void setX(int x) {
		this.xPos = x;
	}
	
	public void setY(int y) {
		this.yPos = y;
	}
	
	public void setPos(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public void setWidth(int w) {
		this.width = w;
	}
	
	public void setHeight(int h) {
		this.height = h;
	}

	public void setColor(Color col) {
		this.color = col;
	}
	
	
	public int getX() {
		return xPos;
	}
	
	public int getY() {
		return yPos;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}

	public Color getColor() {
		return color;
	}
	

	public void draw(Graphics window) {
		window.setColor(color);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void delete(Graphics window) {
		draw(window, Color.WHITE);
	}
	
	public void draw(Graphics window, Color col) {
		window.setColor(col);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public boolean equals(Object obj) {
		Block other = (Block) obj;
		
		if (other != null) {
			return other.getX() == this.getX() &&
					other.getY() == this.getY() &&
					other.getWidth() == this.getWidth() &&
					other.getHeight() == this.getHeight() &&
					other.getColor().equals(getColor());
		}
		
		return false;
	}

	public String toString() {
		return xPos + " " + yPos + " " + width + " " + height + " " + color;
	}
}