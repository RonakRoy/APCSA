package net.sduhsd.royr6099.unit15.games;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Canvas;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import net.sduhsd.royr6099.unit15.gameelements.Ball;
import net.sduhsd.royr6099.unit15.gameelements.Block;
import net.sduhsd.royr6099.unit15.gameelements.Paddle;
import net.sduhsd.royr6099.unit15.gameelements.Wall;

import java.awt.event.KeyEvent;
import static java.lang.Character.*;

public class BreakOut extends Canvas implements KeyListener, Runnable {
	private Ball ball;
	private Paddle paddle;
	private boolean[] keys; // keeps track of what keys are pressed
	
	private List<Block> breakoutBlocks;
	
	private Wall top, bottom, left, right;
	
	private final int boardWidth = 600;
	private final int boardHeight = 450;
	
	private List<Integer> toRemove;

	private int score;
	private final int numHoriz = 4;
	private final int numVert = 5;
	
	public BreakOut() {
		System.out.println("[BreakOut] Ronak Roy, P. 4, 04/04/18, CA-SU-F106-14");
		
		// set up all game variables
		toRemove = new ArrayList<Integer>();
		
		// instantiate a Ball
		ball = new Ball();

		// instantiate a Paddle
		paddle = new Paddle(boardWidth - 20, boardHeight / 2, 20, 70, Color.RED, 5);
		
		// BUILD A WALL AND MAKE JAVA PAY FOR IT
		top = new Wall(10, 0, boardWidth, true);
		bottom = new Wall(10, boardHeight + 10, boardWidth, true);
		
		left = new Wall(0, 10, boardHeight, false);
		right = new Wall(10 + boardWidth, 10, boardHeight, false);

		// Make the list of blocks
		breakoutBlocks = new ArrayList<Block>();
		
		keys = new boolean[2];
		
		// Setup the game for the first time in forever
		reset();
		
		// set up the Canvas
		setBackground(Color.WHITE);
		setVisible(true);

		this.addKeyListener(this);
		new Thread(this).start();
	}
	
	public void reset() {
		ball.setPos(boardWidth / 2, boardHeight - 80);
		
		ball.setXSpeed(3);
		ball.setYSpeed(-1);
		
		breakoutBlocks.clear();
		
		for (int i = 0; i < numHoriz; i++) {
			for (int j = 0; j < numVert; j++) {
				breakoutBlocks.add(new Block(14 + 30*i, 14 + j * boardHeight / numVert, 20, boardHeight / numVert - 10));
			}
		}
		
		score = 0;
	}

	public void update(Graphics window) {
		paint(window);
	}

	public void paint(Graphics window) {
		window.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
		
		for (Block b : breakoutBlocks) {
			b.draw(window);
		}
		ball.moveAndDraw(window);
		
		paddle.draw(window);
		
		top.draw(window);
		bottom.draw(window);
		
		left.draw(window);
		right.draw(window);
		
		toRemove.clear();
		
		window.setColor(Color.WHITE);
		window.drawBytes(("Score: " + score).getBytes(), 0, ("Score: " + score).length(), boardWidth / 2, boardHeight - 10);
				
		for (int i = 0; i < breakoutBlocks.size(); i++) {
			Block b = breakoutBlocks.get(i);
			boolean kill = false;
			
			if (ball.didCollideLeft(b) || ball.didCollideRight(b)) {
				ball.setXSpeed(-ball.getXSpeed());
				kill = true;
			}
			if (ball.didCollideBottom(b) || ball.didCollideTop(b)) {
				ball.setYSpeed(-ball.getYSpeed());
				kill = true;
			}
			
			if (kill) {
				toRemove.add(i);
				score++;
			}
		}
		
		for (int r : toRemove) {
			Block b = breakoutBlocks.get(r);
			
			b.delete(window);
			breakoutBlocks.remove(b);
		}

		if (ball.didCollideLeft(left)) {
			ball.setXSpeed(-ball.getXSpeed());
		}
		else if (ball.didCollideRight(right)) {
			ball.draw(window, Color.WHITE);
			reset();
		}
		else if (ball.didCollideLeft(paddle) || ball.didCollideRight(paddle)) {
			ball.setXSpeed(-ball.getXSpeed());
		}

		if (ball.didCollideBottom(top) || ball.didCollideTop(bottom)) {
			ball.setYSpeed(-ball.getYSpeed());
		}
		else if (ball.didCollideTop(paddle) || ball.didCollideBottom(paddle)) {
			ball.setYSpeed(-ball.getYSpeed());
		}

		if (keys[0] == true) {
			paddle.moveUpAndDraw(window);
		}
		if (keys[1] == true) {
			paddle.moveDownAndDraw(window);
		}
		
		window.setColor(Color.BLACK);
		window.drawBytes(("Score: " + score).getBytes(), 0, ("Score: " + score).length(), boardWidth / 2, boardHeight - 10);
	}

	public void keyPressed(KeyEvent e) {
		switch (toUpperCase(e.getKeyChar())) {
		case 'W':
			keys[0] = true;
			break;
		case 'S':
			keys[1] = true;
			break;
		}
	}

	public void keyReleased(KeyEvent e) {
		switch (toUpperCase(e.getKeyChar())) {
		case 'W':
			keys[0] = false;
			break;
		case 'S':
			keys[1] = false;
			break;
		}
	}

	public void keyTyped(KeyEvent e) {
		// no code needed here
	}

	public void run() {
		try {
			while (true) {
				Thread.currentThread().sleep(8);
				repaint();
			}
		} catch (Exception e) {
		}
	}
}