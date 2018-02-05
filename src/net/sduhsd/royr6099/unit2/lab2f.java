package net.sduhsd.royr6099.unit2;

public class lab2f {
	public static void main(String[] args) {
		Line l1 = new Line(1,9,14,2);
		Line l2 = new Line(1,7,18,3);
		Line l3 = new Line(6,4,2,2);
		Line l4 = new Line(4,4,5,3);
		Line l5 = new Line(1,1,2,9);
		
		l1.calculateSlope();
		l2.calculateSlope();
		l3.calculateSlope();
		l4.calculateSlope();
		l5.calculateSlope();
		
		l1.print();
		l2.print();
		l3.print();
		l4.print();
		l5.print();
	}
}
