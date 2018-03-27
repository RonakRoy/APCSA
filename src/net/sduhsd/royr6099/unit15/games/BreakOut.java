package net.sduhsd.royr6099.unit15.games;

import java.awt.Color;
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

	public BreakOut() {
		// set up all game variables

		// instantiate a Ball
		ball = new Ball(boardWidth / 2, 400);
		ball.setXSpeed(1);
		ball.setYSpeed(2);

		// instantiate a Paddle
		paddle = new Paddle(boardWidth / 2, boardHeight - 20, 70, 20, Color.RED, 5);
		
		top = new Wall(10, 0, boardWidth, true);
		bottom = new Wall(10, boardHeight + 10, boardWidth, true);
		
		left = new Wall(0, 10, boardHeight, false);
		right = new Wall(10 + boardWidth, 10, boardHeight, false);

		keys = new boolean[2];
		
		breakoutBlocks = new ArrayList<Block>();
		
		int numHoriz = 9;
		int numVert = 6;
		
		for (int i = 0; i < numHoriz; i++) {
			for (int j = 0; j < numVert; j++) {
				breakoutBlocks.add(new Block((i + 1) * 56, (j + 1) * 48, 40, boardHeight / 2 / numVert));
			}
		}

		// set up the Canvas
		setBackground(Color.WHITE);
		setVisible(true);

		this.addKeyListener(this);
		new Thread(this).start();
	}

	public void update(Graphics window) {
		paint(window);
	}

	public void paint(Graphics window) {
		for (Block b : breakoutBlocks) {
			b.draw(window);
		}
		ball.moveAndDraw(window);
		
		paddle.draw(window);
		
		top.draw(window);
		bottom.draw(window);
		
		left.draw(window);
		right.draw(window);
		
		for (Block b : breakoutBlocks) {
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
				b.delete(window);
				breakoutBlocks.remove(b);
			}
		}

		if (ball.didCollideLeft(left) || ball.didCollideRight(right)) {
			ball.setXSpeed(-ball.getXSpeed());
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
			paddle.moveRightAndDraw(window);
		}
		if (keys[1] == true) {
			paddle.moveLeftAndDraw(window);
		}
	}

	public void keyPressed(KeyEvent e) {
		switch (toUpperCase(e.getKeyChar())) {
		case 'D':
			keys[0] = true;
			break;
		case 'A':
			keys[1] = true;
			break;
		}
	}

	public void keyReleased(KeyEvent e) {
		switch (toUpperCase(e.getKeyChar())) {
		case 'D':
			keys[0] = false;
			break;
		case 'A':
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