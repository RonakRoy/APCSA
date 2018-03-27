package net.sduhsd.royr6099.unit15;

import javax.swing.JFrame;

import net.sduhsd.royr6099.unit15.gameelements.InvisibleBall;
import net.sduhsd.royr6099.unit15.games.InvisiblePong;
import net.sduhsd.royr6099.unit15.games.SpeedUpPong;

import java.awt.Component;

public class Tester extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public Tester()
	{
		super("PONG TESTER");
		setSize(WIDTH,HEIGHT);
		
		//getContentPane().add(new BlockTestTwo());
		
		//getContentPane().add(new BallTestTwo());		
		
//		Pong padTest = new Pong();
//		((Component)padTest).setFocusable(true);			
//		getContentPane().add(padTest);

//		BlinkyPong blink = new BlinkyPong();
//		((Component)blink).setFocusable(true);			
//		getContentPane().add(blink);
		
//		SpeedUpPong speed = new SpeedUpPong();
//		((Component)speed).setFocusable(true);			
//		getContentPane().add(speed);
		
		InvisiblePong invisible = new InvisiblePong();
		((Component)invisible).setFocusable(true);			
		getContentPane().add(invisible);
		
//		BreakOut breakOutTest = new BreakOut();
//		((Component)breakOutTest).setFocusable(true);			
//		getContentPane().add(breakOutTest);
		
//		AirHockey hockey = new AirHockey();
//		((Component)hockey).setFocusable(true);			
//		getContentPane().add(hockey);
				
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		Tester run = new Tester();
	}
}