package net.sduhsd.royr6099.unit17;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	
	private ArrayList<Ammo> shots;
	
	private Aliens aliens;

	private boolean[] keys;
	private BufferedImage back;
	
	final int leftLimit = 10;
	final int rightLimit = 680;
	
	private boolean space_down = false;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		ship = new Ship(350, 450, 4);
		
		shots = new ArrayList<Ammo>();
		
		aliens = new Aliens();

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);

		if(keys[0] == true)
		{
			ship.move("LEFT");
		}
		else if(keys[1] == true)
		{
			ship.move("RIGHT");
		}
		else if(keys[2] == true)
		{
			ship.move("UP");
		}
		else if(keys[3] == true)
		{
			ship.move("DOWN");
		}
		
		if (keys[4] == true)
		{
			if (!space_down) {
				shots.add(new Ammo(ship.getX() + 20, ship.getY(), 5));
				space_down = true;
			}
		}
		else {
			space_down = false;
		}
		
		for (int row = 0; row < aliens.getNumRows(); row++) {
			for (int col = 0; col < aliens.getNumCols(); col++) {
				Alien a = aliens.get(row, col);
				boolean mR = aliens.getMovingRight(row, col);
				
				if (a != null) {
					if (mR) {
						a.move("RIGHT");
					}
					else {
						a.move("LEFT");
					}
					
					if (a.getX() > rightLimit || a.getX() < leftLimit) {
						aliens.reverseMovingRight(row, col);
					}
					
					a.draw(graphToBack);
				}
			}
		}

		ship.draw(graphToBack);
		
		for (Ammo s : shots) {
			s.begone(graphToBack);
			s.move("UP");
			s.draw(graphToBack);
			
			for (int row = 0; row < aliens.getNumRows(); row++) {
				for (int col = 0; col < aliens.getNumCols(); col++) {
					Alien a = aliens.get(row, col);
					
					if (a != null) {
						if (s.getX() > a.getX() && s.getX() + 10 < a.getX() + 80
								&& s.getY() > a.getY() && s.getY() + 10 < a.getY() + 80) {
							s.begone(graphToBack);
							shots.remove(s);
							
							aliens.kill(row, col);
						}
					}
				}
			}
		}

		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{

	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

