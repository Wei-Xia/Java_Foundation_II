import javax.swing.JOptionPane;

/**
  This program displays the number of letters, digits, and whitespace
  characters in a string.
*/

public class StringAnalyzer
{
  public static void main(String[] args)
  {
      String input;       // To hold input
      char[] array;       // Array for input

      int letters = 0;      // Number of letters
      int digits = 0;       // Number of digits
      int whitespace = 0;   // Number of whitespace

      // Get a string from the user.
      input = JOptionPane.showInputDialog("Enter a string: " );

      // Convert the string to a char array.
      array = input.toCharArray();

      // Analyze the characters
      for (int i = 0; i < array.length; i++)
      {
          if (Character.isLetter(array[i]))
            letter++;
          else if (Character.isDigit(array[i]))
            digits++;
          else if (Character.isWhitespace(array[i]))
            whitespace++;
      }

      // Display the results
      JOptionPane.showMessageDialog(null, "That string contains " + letters
              + " letters, " + digits + " digits, and " + whitespace + " whitespace characters.");

      System.exit(0);
  }
}
