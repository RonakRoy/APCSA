package net.sduhsd.royr6099.unit15.gameelements;

import java.awt.Color;

public class InvisibleBall extends Ball {
	Thread inivisbleThread;
	public InvisibleBall() {
		super();
		invisibleness();
	}

	public InvisibleBall(int x, int y) {
		super(x, y);
		invisibleness();
	}

	public InvisibleBall(int x, int y, int xSpd, int ySpd) {
		super(x, y, xSpd, ySpd);
		invisibleness();
	}

	public InvisibleBall(int x, int y, int wid, int ht, int xSpd, int ySpd) {
		super(x, y, wid, ht, xSpd, ySpd);
		invisibleness();
	}

	public InvisibleBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd) {
		super(x, y, wid, ht, col, xSpd, ySpd);
		invisibleness();
	}

	private void invisibleness() {
		inivisbleThread = new Thread(() -> {
			boolean invisible = true;
			Color oldColor = this.getColor();

			while (true) {
				invisible = !invisible;

				if (invisible)
					this.setColor(Color.WHITE);
				else
					this.setColor(oldColor);

				long sleepTime = 1000 + (long) (4000 * Math.random());

				try {
					Thread.sleep(sleepTime);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		inivisbleThread.start();
	}

}
