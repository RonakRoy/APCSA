package net.sduhsd.royr6099.unit14;

public class FancyWord
{
	private char[][] charMat;
	private int length;

	public FancyWord()
	{
		charMat = new char[0][0];
	}

   public FancyWord(String s)
	{
	   length = s.length();
	   
	   charMat = new char[length][length];
	   
	   for (int i = 0; i < length; i++) {
		   char c = s.charAt(i);
		   
		   charMat[0][i] = c;
		   charMat[length - 1][i] = c;
		   
		   charMat[i][i] = c;
		   charMat[length - i - 1][i] = c;
	   }
	}

	public String toString()
	{
		String output="";
		
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				output += charMat[i][j];
			}
			output += "\n";
		}

		return output+"\n\n";
	}
}