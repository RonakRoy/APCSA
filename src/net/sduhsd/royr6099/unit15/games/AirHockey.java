package net.sduhsd.royr6099.unit15.games;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Canvas;
import java.awt.event.KeyListener;

import net.sduhsd.royr6099.unit15.gameelements.Ball;
import net.sduhsd.royr6099.unit15.gameelements.Paddle;
import net.sduhsd.royr6099.unit15.gameelements.Wall;

import java.awt.event.KeyEvent;
import static java.lang.Character.*;


public class AirHockey extends Canvas implements KeyListener, Runnable {
	private Ball ball;
	private Paddle leftPaddle, rightPaddle;
	private boolean[] keys; // keeps track of what keys are pressed
	
	private Wall top, bottom, left, right;
	
	private final int boardWidth = 600;
	private final int boardHeight = 450;

	public AirHockey() {
		// set up all game variables

		// instantiate a Ball
		ball = new Ball();

		// instantiate a left Paddle
		leftPaddle = new Paddle(20, 150, 70, 70, Color.RED, 5);

		// instantiate a right Paddle
		rightPaddle = new Paddle(530, 150, 70, 70, Color.GREEN, 5);
		
		top = new Wall(10, 0, boardWidth, true);
		bottom = new Wall(10, boardHeight + 10, boardWidth, true);
		
		left = new Wall(0, 10, boardHeight, false);
		right = new Wall(10 + boardWidth, 10, boardHeight, false);

		keys = new boolean[8];

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
		ball.moveAndDraw(window);
		
		leftPaddle.draw(window);
		rightPaddle.draw(window);
		
		top.draw(window);
		bottom.draw(window);
		
		left.draw(window);
		right.draw(window);

		if (ball.didCollideLeft(left) || ball.didCollideRight(right)) {
			ball.setXSpeed(-ball.getXSpeed());
		}
		else if (ball.didCollideLeft(leftPaddle) || ball.didCollideRight(leftPaddle)
				|| ball.didCollideLeft(rightPaddle) || ball.didCollideRight(rightPaddle)) {
			ball.setXSpeed(-ball.getXSpeed());
		}

		if (ball.didCollideBottom(top) || ball.didCollideTop(bottom)) {
			ball.setYSpeed(-ball.getYSpeed());
		}
		else if (ball.didCollideTop(leftPaddle) || ball.didCollideBottom(leftPaddle)
				|| ball.didCollideTop(rightPaddle) || ball.didCollideBottom(rightPaddle)) {
			ball.setYSpeed(-ball.getYSpeed());
		}

		if (keys[0]) {
			leftPaddle.moveUpAndDraw(window);
		}
		else if (keys[1]) {
			leftPaddle.moveLeftAndDraw(window);
		}
		else if (keys[2]) {
			leftPaddle.moveDownAndDraw(window);
		}
		else if (keys[3]) {
			leftPaddle.moveRightAndDraw(window);
		}
		
		if (keys[4]) {
			rightPaddle.moveUpAndDraw(window);
		}
		else if (keys[5]) {
			rightPaddle.moveLeftAndDraw(window);
		}
		else if (keys[6]) {
			rightPaddle.moveDownAndDraw(window);
		}
		else if (keys[7]) {
			rightPaddle.moveRightAndDraw(window);
		}
	}

	public void keyPressed(KeyEvent e) {
		switch (toUpperCase(e.getKeyChar())) {
		case 'W':
			keys[0] = true;
			break;
		case 'A':
			keys[1] = true;
			break;
		case 'S':
			keys[2] = true;
			break;
		case 'D':
			keys[3] = true;
			break;
			
		case 'I':
			keys[4] = true;
			break;
		case 'J':
			keys[5] = true;
			break;
		case 'K':
			keys[6] = true;
			break;
		case 'L':
			keys[7] = true;
			break;
		}
	}

	public void keyReleased(KeyEvent e) {
		switch (toUpperCase(e.getKeyChar())) {
		case 'W':
			keys[0] = false;
			break;
		case 'A':
			keys[1] = false;
			break;
		case 'S':
			keys[2] = false;
			break;
		case 'D':
			keys[3] = false;
			break;
			
		case 'I':
			keys[4] = false;
			break;
		case 'J':
			keys[5] = false;
			break;
		case 'K':
			keys[6] = false;
			break;
		case 'L':
			keys[7] = false;
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