package net.sduhsd.royr6099.unit1.lab1d;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RobotRunner extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public RobotRunner()
	{
		super("Robot");

		setSize(WIDTH,HEIGHT);

		getContentPane().add(new RobotPanel());

		setVisible(true);
	}

	public static void main( String args[] )
	{
		RobotRunner run = new RobotRunner();
	}
}