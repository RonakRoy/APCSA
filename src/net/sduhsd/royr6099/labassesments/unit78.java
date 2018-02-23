package net.sduhsd.royr6099.labassesments;

import java.util.Random;
import java.util.Scanner;

public class unit78 {
	public static void main(String[] args) {
		Hangman h = new Hangman();
		Scanner input = new Scanner(System.in);
		
		while (true) {
			h.playGame();
			
			System.out.println("\nWould you like to play again? (y/n)");
			
			char resp = input.next().charAt(0);
			input.nextLine();
			
			if (resp != 'y'&& resp != 'Y') {
				break;
			}
		}
		
		System.out.println("\nThanks for playing!");
	}
	
	public static class Hangman {
		private final String[] WORDS = {
				"decorative",
				"concentration",
				"community",
				"resignation",
				"engagement",
				"satisfaction",
				"orientation",
				"introduction",
				"exhibition",
				"experiment",
				"acquisition",
				"circulation",
				"articulate",
				"economics",
				"disagreement",
				"deteriorate",
				"resolution",
				"vegetation",
				"photography",
				"cooperation",
				"original",
				"inhabitant",
				"embarrassment",
				"empirical",
				"disposition",
				"academy",
				"fashionable",
				"legislature",
				"compensation",
				"infrastructure"
		};
		
		private boolean[] guessed, present;
		private String word, prompt;
		
		private Random r;
		private Scanner input;
		
		private int numIncorrect;
		private boolean wordComplete;
		
		public Hangman() {
			r = new Random();
			input = new Scanner(System.in);
		}
		
		public void playGame() {
			System.out.println("|=====================================|");
			System.out.println("|=============  Hangman  =============|");
			System.out.println("|=====================================|");
			System.out.println("");
			chooseWord();
			
			while (!wordComplete) {
				char guess = getLetter("Guess a letter in the following word: " + prompt + " > ");
				
				if (guessed[getIndex(guess)] && present[getIndex(guess)]) {
					System.out.println("\t" + guess + " is already in the word.");
				}
				else if (guessed[getIndex(guess)] && !present[getIndex(guess)]) {
					System.out.println("\t" + guess + " has already been incorrectly guessed.");
				}
				else {
					guessed[getIndex(guess)] = true;
					
					if (present[getIndex(guess)]) {
						rebuildPrompt();
					}
					else {
						System.out.println("\t" + guess + " is not in the word.");
						numIncorrect++;
					}
				}
			}
			
			String s = (numIncorrect == 1) ? "" : "s";
			System.out.println("Congratulations! The word was \"" + word + "\". You missed " + numIncorrect + " time" + s + ".");
		}
		
		private void rebuildPrompt() {
			prompt = "";
			wordComplete = true;
			
			for (char c : word.toCharArray()) {
				if (guessed[getIndex(c)]) {
					prompt += c;
				}
				else {
					prompt += "-";
					wordComplete = false;
				}
			}
		}
		
		private void chooseWord() {
			word = WORDS[r.nextInt(WORDS.length)];
			
			guessed = new boolean[26];
			present = new boolean[26];
			
			rebuildPrompt();
			
			for (char c : word.toCharArray()) {
				present[getIndex(c)] = true;
			}
		}
		
		private int getIndex(char c) {
			c = Character.toLowerCase(c);
			
			return (int)c - 97;
		}
		
		private char getLetter(String msg) {
			char c;
			while (true) {
				System.out.print(msg);
				
				c = input.next().charAt(0);
				input.nextLine();
				
				if ((int)c >= 65 && (int)c < 91 || (int)c >= 97 && (int)c < 123) {
					break;
				}
				else {
					System.out.println("\t" + c + " is not a letter!");
				}
			}
			return c;
		}
	}
}

