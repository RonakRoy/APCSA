package net.sduhsd.royr6099.unit11.labassesment;

public class Component implements Comparable<Component> {
	private String name;
	private double weight;
	private double cost;
	
	public Component() {
		this("", 0, 0);
	}
	
	public Component(String n, double w, double c) {
		set(n, w, c);
	}
	
	public void set(String n, double w, double c) {
		name = n;
		weight = w;
		cost = c;
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public double getCost() {
		return cost;
	}
	
	public String toString() {
		return "\"" + name + "\" - " + String.format("%.4f", weight) +  " lbs; $" + String.format("%.2f", cost);
	}

	@Override
	public int compareTo(Component o) {
		return (int)(1000 * (this.getCost() - o.getCost()));
	}
}
