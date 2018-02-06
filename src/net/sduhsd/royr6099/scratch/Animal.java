package net.sduhsd.royr6099.scratch;

public class Animal {
	double height, weight;
	String name;
	
	public Animal(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void eat(double food) {
		weight += food;
	}
	
	public double getBMI() {
		return 703.0 * weight / height / height;
	}
	
	public String getName() {
		name.length();
		return name;
	}
}
