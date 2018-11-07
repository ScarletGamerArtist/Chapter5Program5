package AlannaBotscharowChpter5Pr5;
import java.util.Scanner; 
/*
 * Alanna Botscharow
 * 11/18
 * Vowels or consonants.
 */
public class Chapter5Program5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		//Prompt user for input. 
		
		System.out.println("Please enter a character: ");
		
		//Get user input and variables. 
		char ch = input.next().charAt(0);
		
		
		
		//check whether or not the letter is a vowel or consonant. 
			//if statements. 
				if (ch == 'a' ||
						ch == 'A'||
						ch == 'e' ||
						ch == 'E' ||
						ch == 'i' ||
						ch == 'I' ||
						ch == 'o' ||
						ch == 'O' ||
						ch == 'u' || 
						ch == 'U' 
						) {
					System.out.println(ch+" is a vowel.");
				}
				else if (ch == 'b' ||
						ch == 'B' ||
						ch == 'c' ||
						ch == 'C' ||
						ch == 'd' ||
						ch == 'D' ||
						ch == 'f' ||
						ch == 'F' ||
						ch == 'g' || 
						ch == 'G' ||
						ch == 'h' ||
						ch == 'H' ||
						ch == 'j' ||
						ch == 'J' ||
						ch == 'k' ||
						ch == 'K' ||
						ch == 'l' ||
						ch == 'L' || 
						ch == 'm' ||
						ch == 'M' ||
						ch == 'n' ||
						ch == 'N' ||
						ch == 'o' ||
						ch == 'O' ||
						ch == 'p' ||
						ch == 'P' ||
						ch == 'q' || 
						ch == 'Q' ||
						ch == 'r' ||
						ch == 'R' ||
						ch == 's' ||
						ch == 'S' ||
						ch == 't' ||
						ch == 'T' ||
						ch == 'v' ||
						ch == 'V' || 
						ch == 'w' ||
						ch == 'W' ||
						ch == 'x' ||
						ch == 'X' ||
						ch == 'z' ||
						ch == 'Z' 
						 ) {
					System.out.println(ch+" is a consonant.");
				}
				else if (ch == 'y' ||
						ch == 'Y') {
					System.out.println("Sometimes " + ch + " is a vowel.");
				}
				else {
					System.out.println(ch + " is an invalid input.");
				}

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
