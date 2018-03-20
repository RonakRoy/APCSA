package net.sduhsd.royr6099.unit13;

import java.util.Collections;
import java.util.ArrayList;
import static java.lang.System.*;

public class Lab22c
{
	public static void main(String args[])
	{
		InsertionSort test = new InsertionSort();
		out.println("adding alice");
		test.add("alice");
		out.println("adding tommy");
		test.add("tommy");
		out.println("adding bobby");
		test.add("bobby");
		out.println("printing the list ::  "+test+"\n\n");
		out.println("removing bobby");
		test.remove("bobby");
		out.println("printing the list ::  "+test+"\n\n");
		out.println("removing alice");
		test.remove("alice");
		out.println("printing the list ::  "+test+"\n\n");
		out.println("adding fred");
		test.add("fred");
		out.println("adding xylophone");
		test.add("xylophone");
		out.println("printing the list ::  "+test+"\n\n");
		out.println("removing bobby");
		test.remove("tommy");
		test.remove("tommy");  //should do nothing		
		out.println("printing the list ::  "+test+"\n\n");		
		out.println("removing fred");
		test.remove("fred");  		
		out.println("printing the list ::  "+test+"\n\n");				
	}
}