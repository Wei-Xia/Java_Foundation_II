import java.util.*;

class MorseCode_Prof
  {
    /* Prompt user for strings and display morse code equivalent until user enters sentinel */
    public static void main(String[] args)
      {
        final String SENTINEL = "$";        // sentinel string that terminates program
        Scanner keyboard = new Scanner(System.in);      // Scanner object wrapped around the keyboard, for user input
        String [] morseCode = {"._", "_...", "_._.", "_..",".",".._.","__.", "....",
    			"..", ".___", "_._", "._..", "__","_ .", "___", ".__.", "__._", "._.",
    			"...", "_", ".._", "..._", ".__", "_.._", "_.__", "__.."};     // Morse Code equivalent of A-Z

        // prompt user and get first input string
        System.out.print("\nEnter a string of alphabetic characters("+ "\'" + SENTINEL + "\'" + "to quit):");
        String input = keyboard.nextLine().trim().toUpperCase();          // strip leading and trailing whitespaces and force to upper-case

        // If input is not SENTINEL, translate to Morse Code, and then prompt and input again and translate again, repeatly
        while (!input.equals(SENTINEL))           // sentinel string terminates loop, which processes each input string in turn
          {
            for (int i = 0; i<input.length(); i++)        // walk through input character by character and translate each one
              if (input.charAt(i) == " ")
                System.out.print(" ");
              else
                System.out.print(morseCode[input.charAt(i)] - "A" + (i<input.length()-1 ? "" : "\n"));  //append "" if not at end of input

            // prompt user and get next input string
            System.out.print("\nEnter a string of alphabetic characters("+ "\'" + SENTINEL + "\'" + "to quit):");
            input = keyboard.nextLine().trim().toUpperCase();         // strip leading and trailing whitespaces and force to upper-case
          }       // end while
      }           // end main
  }               // end class
