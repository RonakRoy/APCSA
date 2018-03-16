package net.sduhsd.royr6099.unit11.labassesment;

public class Mechanism implements Comparable<Mechanism> {
	private String name;
	private ComponentSet compSet;
	
	public Mechanism() {
		setName("");
		setCompSet("");
	}
	
	public Mechanism(String name, String csStr) {
		setName(name);
		setCompSet(csStr);
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setCompSet(String csStr) {
		compSet = new ComponentSet(csStr);
	}
	
	public String getName() {
		return name;
	}
	
	public double getCost() {
		return compSet.getTotalCost();
	}
	
	public double getWeight() {
		return compSet.getTotalWeight();
	}
	
	public Component getMostExpensiveComponent() {
		return compSet.getMostExpensive();
	}
	
	public Component getLeastExpensiveComponent() {
		return compSet.getLeastExpensive();
	}
	
	@Override
	public int compareTo(Mechanism o) {
		return (int) (1000 * (this.getCost() - o.getCost()));
	}
	
	public String toString() {
		 return name + ": \n" + compSet;
	}
}
