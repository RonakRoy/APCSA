package net.sduhsd.royr6099.unit4;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Name
{
	private String name;

	public Name()
	{
		name = "";
	}

	public Name(String s)
	{
		name = s;
	}

   public void setName(String s)
   {
	   name = s;
   }

	public String getFirst()
	{
		int space_index = name.indexOf(' ');
		
		return name.substring(0, space_index);
	}

	public String getLast()
	{
		int space_index = name.indexOf(' ');
		
		return name.substring(space_index + 1, name.length());
	}

 	public String toString()
 	{
 		return name + "\n\n";
	}
}