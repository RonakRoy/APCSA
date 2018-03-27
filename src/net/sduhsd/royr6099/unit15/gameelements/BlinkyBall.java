package net.sduhsd.royr6099.unit15.gameelements;

import java.awt.Color;
import java.awt.Graphics;

public class BlinkyBall extends Ball {

	// constructors
	public BlinkyBall() {
		super();
	}

	public BlinkyBall(int x, int y) {
		super(x, y);
	}

	public BlinkyBall(int x, int y, int wid, int ht) {
		super(x, y, wid, ht);
	}

	public BlinkyBall(int x, int y, int wid, int ht, int xSpd, int ySpd) {
		super(x, y, wid, ht, xSpd, ySpd);
	}

	public BlinkyBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd) {
		super(x, y, wid, ht, col, xSpd, ySpd);
	}

	public Color randomColor() {
		int r = (int) (256 * Math.random());
		int g = (int) (256 * Math.random());
		int b = (int) (256 * Math.random());
		return new Color(r, g, b);
	}

	public void moveAndDraw(Graphics window) {
		setColor(randomColor());
		super.moveAndDraw(window);
	}
}
