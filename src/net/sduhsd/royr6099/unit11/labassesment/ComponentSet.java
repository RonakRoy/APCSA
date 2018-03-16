package net.sduhsd.royr6099.unit11.labassesment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ComponentSet {
	private List<Component> components;
	
	private void init() {
		components = new ArrayList<Component>();
	}
	
	public ComponentSet() {
		init();
	}
	
	public ComponentSet(List<Component> csList) {
		components = csList;
	}
	
	public ComponentSet(Component[] csArray) {
		components = Arrays.asList(csArray);
	}
	
	public ComponentSet(String csString) {		
		setComponents(csString);
	}
	
	/**
	 * Fills the internal {@link}ArrayList of {@link}Component objects from a {@link} String
	 * @param csString - In the format "name weight cost\nname weight cost\n ..."
	 */
	public void setComponents(String csString) {
		init();
		
		Scanner csScan = new Scanner(csString);
		
		while (csScan.hasNextLine()) {
			String name = csScan.next();
			double weight = csScan.nextDouble();
			double cost = csScan.nextDouble();
			
			components.add(new Component(name, weight, cost));
			csScan.nextLine();
		}
		
		csScan.close();
	}
	
	public void setComponent(int index, String comp) {
		Scanner cScan = new Scanner(comp);
		
		String name = cScan.next();
		double weight = cScan.nextDouble();
		double cost = cScan.nextDouble();
		
		setComponent(index, new Component(name, weight, cost));
		
		cScan.close();
	}
	
	public void setComponent(int index, Component comp) {
		while (index >= components.size()) {
			components.add(null);
		}
		
		components.set(index, comp);
	}
	
	public void removeComponent(int index) {
		components.remove(index);
	}
	
	public Component getComponent(int index) {
		return components.get(index);
	}
	
	public Component getMostExpensive() {
		return Collections.max(components);
	}
	
	public Component getLeastExpensive() {
		return Collections.min(components);
	}
	
	public double getTotalCost() {
		double total = 0;
		
		for (Component c : components) {
			total += c.getCost();
		}
		
		return total;
	}
	
	public double getTotalWeight() {
		double total = 0;
		
		for (Component c : components) {
			total += c.getWeight();
		}
		
		return total;
	}
	
	public void sort() {
		Collections.sort(components);
	}
	
	public String toString() {
		String ret = "";
		for (Component c : components) {
			ret += c + "\n";
		}
		
		return ret;
	}
}
