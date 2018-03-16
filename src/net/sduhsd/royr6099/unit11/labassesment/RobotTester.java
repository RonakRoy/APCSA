package net.sduhsd.royr6099.unit11.labassesment;

public class RobotTester {
	public static void main(String[] args) {
		Mechanism e = new Mechanism("electronics", "roboRIO 0.10 200\nPDB 0.70 150\nTalonSRX 0.3 79\n");
		Mechanism d = new Mechanism("drivetrain", "driveplates 15 50\nCIMs 40 200\nshifting_pistons 2.5 20\n");
		
		Robot r = new Robot("Guido");
		r.addMechanism(e);
		r.addMechanism(d);
		
		System.out.println(r);
		
		
	}
}
