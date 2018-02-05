package net.sduhsd.royr6099.unit1.lab1d;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RobotPanel extends JPanel
{
	public RobotPanel()
	{
		setBackground(Color.WHITE);
		setVisible(true);
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	/*
	 *All of your test code should be placed in paint.
	 */
	public void paint(Graphics window)
	{
		window.setColor(Color.WHITE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.BLUE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("Robot",40,40);


		Color[] colors = {Color.CYAN, Color.RED, Color.GREEN, Color.MAGENTA};
		RobotShape robot = new RobotShape(200, 200, 100, 300, colors);
		robot.draw(window);
		
		Random rand = new Random();
		System.out.println("You rolled a " + (rand.nextInt(6) + 1));
	}
}