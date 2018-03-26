package net.sduhsd.royr6099.scratch;

public class Dog extends Animal {
	private double furLength;
	public Dog(String name, double height, double weight, double furLength) {
		super(name, height, weight);
		
		this.furLength = furLength;
	}
	
	public void growFur() {
		furLength += 1;
	}
	
	public void shave(double amt) {
		furLength = Math.max(furLength - amt, 0);
	}

	public double getFurLength() {
		return furLength;
	}
}
