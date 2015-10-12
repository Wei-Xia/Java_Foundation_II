// Assignment #3
// CS 504
// Wei

import java.util.*;

public class AssignmentThree
{
	public static void main (String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter an original sentence in English.");
		String sentence = keyboard.nextLine();
		System.out.println(convertToMorse(sentence));
	}

	public static String convertToMorse(String sentence)
	{
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String code[] =  {"._", "_...", "_._.", "_..",".",".._.","__.", "....",
			"..", ".___", "_._", "._..", "__","_ .", "___", ".__.", "__._", "._.",
			"...", "_", ".._", "..._", ".__", "_.._", "_.__", "__.."};
		sentence = sentence.toUpperCase();

		while(!sentence.contains("$"))
		{
			for(int a = 0; a < sentence.length(); a++)
				{
					char letter = sentence.charAt(a);
					if (letter == ' ')
						{
							System.out.print ("ø");
							continue;
						}
   					for(int variable = 0; variable < alphabet.length(); variable++)
   						{
       						if(alphabet.charAt(variable) == letter)
       							{
       								System.out.print(code[variable] + "ø");
       								break;
       							}
   						}
				}
		
		System.out.println("\nPlease enter a sentence in English, or enter $ to quit");
		
		Scanner keyboard = new Scanner(System.in);
		sentence = keyboard.nextLine();
		sentence = sentence.toUpperCase();
		}
		
   		return " ";
	}
}
