import java.util.*;

class WordCount
  {
    /* Prompt user for string and display word count, until user enters sentinel */
    public static void main(String[] args)
      {
        final String SENTINEL = "";
        Scanner keyboard = new Scanner(System.in);

        // Prompt user and get first input string
        System.out.print("\nEnter a string of character("+ (SENTINEL.isEmpty() ? "enter" : ("\'" + SENTINEL + "\'")) + "to quit):");

        String input = keyboard.nextLine();

        // If input is not SENTINEL, display word count, and then prompt and input again and display again, repeatly
        while (!input.equals(SENTINEL))
          {
            StringTokenizer word = new StringTokenizer(input);
            String[] wordCollection = new String[word.countTokens()];

            int numberOfWords = 0;
            int[] WordCount = new int [words.countTokens()];
          }
      }
  }
