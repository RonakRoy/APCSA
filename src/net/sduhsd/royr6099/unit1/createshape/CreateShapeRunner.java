package net.sduhsd.royr6099.unit1.createshape;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateShapeRunner extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public CreateShapeRunner()
	{
		super("Create Your Own Shape!");

		setSize(WIDTH,HEIGHT);

		getContentPane().add(new CreateShapePanel());

		setVisible(true);
	}

	public static void main( String args[] )
	{
		CreateShapeRunner run = new CreateShapeRunner();
	}
}