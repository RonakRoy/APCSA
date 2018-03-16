package net.sduhsd.royr6099.unit11.labassesment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Robot {
	private String name;
	private List<Mechanism> mechanisms;
	
	public Robot() {
		this("");
	}
	
	public Robot(String name) {
		setName(name);
		mechanisms = new ArrayList<Mechanism>();
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void addMechanism(Mechanism m) {
		mechanisms.add(m);
	}
	
	public Mechanism getMechanism(int index) {
		return mechanisms.get(index);
	}
	
	public Mechanism getLeastExpensiveMechanism() {
		return Collections.min(mechanisms);
	}
	
	public Mechanism getMostExpensiveMechanism() {
		return Collections.max(mechanisms);
	}
	
	public void sort() {
		Collections.sort(mechanisms);
	}
	
	public double getAverageMechanismCost() {
		return getTotalCost() / getNumberOfMechanisms();
	}
	
	public double getTotalCost() {
		double cost = 0;
		
		for (Mechanism m : mechanisms) {
			cost += m.getCost();
		}
		
		return cost;
	}
	
	public int getNumberOfMechanisms() {
		return mechanisms.size();
	}
	
	public double getTotalWeight() {
		double weight = 0;
		
		for (Mechanism m : mechanisms) {
			weight += m.getWeight();
		}
		
		return weight;
	}
	
	public String toString() {
		String r = "Robot \'" + name + "\':\n\n" +
				getNumberOfMechanisms() + " mechansims\n" +
				"Cost: $" + getTotalCost() + "\n" +
				"Weight: " + getTotalWeight() + " lbs\n\n";
		
		for (Mechanism m : mechanisms) {
			r += m + "\n";
		}
		
		return r;
		
	}
}
