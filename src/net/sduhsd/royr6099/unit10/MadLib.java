package net.sduhsd.royr6099.unit10;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	private String madlib;
	private Random rand;
	
	private void load() {
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
		
		loadNouns();
		loadVerbs();
		loadAdjectives();
		
		rand = new Random();
	}
	
	public MadLib()
	{
		load();
	}

	public MadLib(String fileName)
	{
		load();
		
		try{
			Scanner file = new Scanner(new File(fileName));
			madlib = "";
						
			while (file.hasNext()) {
				String seg = file.next();
								
				if (seg.equals("#")) {
					madlib += getRandomNoun();
				}
				else if (seg.equals("@")) {
					madlib += getRandomVerb();
				}
				else if (seg.equals("&")) {
					madlib += getRandomAdjective();
				}
				else {
					madlib += seg;
				}
				
				madlib += " ";
			}
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
			Scanner nounsFile = new Scanner(new File("nouns.dat"));
			
			while (nounsFile.hasNext()) {
				nouns.add(nounsFile.next());
			}
		}
		catch(Exception e) {}
	}
	
	public void loadVerbs()
	{
		try{
			Scanner verbsFile = new Scanner(new File("verbs.dat"));
			
			while (verbsFile.hasNext()) {
				verbs.add(verbsFile.next());
			}
		}
		catch(Exception e) {}
	}

	public void loadAdjectives()
	{
		try{
			Scanner adjectivesFile = new Scanner(new File("adjectives.dat"));
			
			while (adjectivesFile.hasNext()) {
				adjectives.add(adjectivesFile.next());
			}
		}
		catch(Exception e) {}
	}

	public String getRandomVerb()
	{
		return verbs.get(rand.nextInt(verbs.size()));
	}
	
	public String getRandomNoun()
	{
		return nouns.get(rand.nextInt(nouns.size()));
	}
	
	public String getRandomAdjective()
	{
		
		return adjectives.get(rand.nextInt(adjectives.size()));
	}		

	public String toString()
	{
	   return madlib;
	}
}