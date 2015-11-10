import java.util.*;

class WordCount
  {
    /* Prompt user for string and display word count, until user enters sentinel */
    public static void main(String[] args)
      {
        final String SENTINEL = "";         // sentinel string that terminates program
        Scanner keyboard = new Scanner(System.in);      // Scanner object wrapped around the keyboard, for user input

        // Prompt user and get first input string
        System.out.print("\nEnter a string of character("+ (SENTINEL.isEmpty() ? "enter" : ("\'" + SENTINEL + "\'")) + "to quit):");

        String input = keyboard.nextLine();

        // If input is not SENTINEL, display word count, and then prompt and input again and display again, repeatly
        while (!input.equals(SENTINEL))
          {
            StringTokenizer word = new StringTokenizer(input);
            String[] wordCollection = new String[word.countTokens()];

            int numberOfWords = 0;
            int[] wordCount = new int [words.countTokens()];
            int i;

            while (words.hasMoreTokends())
              {
                String word = words.nextToken();
                wordCollection[numberOfWords] = words;
                for (i = 0; !wordCollection[i].equals(word); i++);
                if (i == numberOfWords) numberOfWords++;
                else wordCount[i]++;
              }

            for (i = 0; i<numberOfWords; i++)
              System.out.print(wordCollection[i] + " " + (wordCount[i]+1) + (i<numberOfWords-1 ? "":"\n"));

            // prompt user and get next input string
            System.out.print("\nEnter a string of character("+ (SENTINEL.isEmpty() ? "enter" : ("\'" + SENTINEL + "\'")) + "to quit):");
            input = keyboardLine();
          }
      }
  }
