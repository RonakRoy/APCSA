package net.sduhsd.royr6099.unit12;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myHeight;
	private int myWeight;
	private int myAge;

	//write a default Constructor

	public Monster() {
		this(0,0,0);
	}

	//write an initialization constructor with an int parameter ht
	
	public Monster(int h) {
		this(h, 0, 0);
	}

	//write an initialization constructor with int parameters ht and wt
	
	public Monster(int h, int w) {
		this(h, w, 0);
	}

	//write an initialization constructor with int parameters ht, wt, and age

	public Monster(int h, int w, int a) {
		myHeight = h;
		myWeight = w;
		myAge = a;
	}
	
	
	//modifiers - write set methods for height, weight, and age

	public void setHeight(int h) {
		myHeight = h;
	}
	
	public void setWeight(int w) {
		myWeight = w;
	}
	
	public void setAge(int a) {
		myAge = a;
	}
	
	
	//accessors - write get methods for height, weight, and age
	
	public int getHeight() {
		return myHeight;
	}
	
	public int getWeight() {
		return myWeight;
	}
	
	public int getAge() {
		return myAge;
	}
	
	
	//creates a new copy of this Object
	public Object clone()
	{
	   return new Monster(myHeight, myWeight, myAge);
	}

	public boolean equals( Object obj )
	{
		Monster other = (Monster)obj;
		return other.getHeight() == this.getHeight() &&
				other.getWeight() == this.getWeight() &&
				other.getAge() == this.getAge();
	}

	public int compareTo( Object obj )
	{
		Monster rhs = (Monster)obj;
		
		if (this.getHeight() > rhs.getHeight()) {
			return 1;
		}
		else if (this.getWeight() > rhs.getWeight()) {
			return 1;
		}
		else if (this.getAge() > rhs.getAge()) {
			return 1;
		}
		
		if (this.equals(obj)) return 0;
		
		return -1;
	}

	//write a toString() method
	public String toString() {
		return getHeight() + " " + getWeight() + " " + getAge();
	}
	
}