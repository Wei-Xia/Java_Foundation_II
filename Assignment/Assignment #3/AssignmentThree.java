import java.util.*;

public class AssignmentThree{
	public static void main (String [] args)
	{
		Scanner englishtomorse = new Scanner(System.in);
		System.out.println ("Please enter an original sentence in English.");
		english = englishtomorse.nextLine();
		String str = englishtoMorse(english);
		System.out.println(str);
		englishtomorse.close();
	}

	public static String englishtoMorse(String english)
	{
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String code[] =  {"._", "_...", "_._.", "_..",".",".._.","__.", "....",
			"..", ".___", "_._", "._..", "__","_ .", "___", ".__.", "__._", "._.",
			"...", "_", ".._", "..._", ".__", "_.._", "_.__", "__.."};
		english = english.toUpperCase();
		for(int xyz = 0; xyz < english.length(); xyz++)
		{
			char letter = english.charAt(xyz);
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
   		return " ";
	}
}
