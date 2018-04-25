package net.sduhsd.royr6099.unit17;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;

	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		this(x, y, 0);
	}

	public Ammo(int x, int y, int s)
	{
		super(x, y);
		setSpeed(s);
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw(Graphics window)
	{
		window.setColor(Color.YELLOW);
		window.fillRect(getX(), getY(), 10, 10);
	}
	
	public void begone(Graphics window)
	{
		window.setColor(Color.BLACK);
		window.fillRect(getX(), getY(), 10, 10);
	}

	public String toString()
	{
		return "";
	}
}
