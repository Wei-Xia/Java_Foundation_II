import java.util.*;

/**
This program demonstrates a case insentitive string comparsion.
*/

public class SecretWord
{
  public static void main(String[] args) {

    String input;     // To hold the user's input

    // Create a Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);

    // Prompt the user to enter the secret word
    System.out.print("Enter the secret word: ");
    input = keyboard.nextLine();

    // Determine whether the user entered the scret word
    if (input.equalsIgnoreCase("PROSPERO")) {
      System.out.println("Congratulations! You know the scret word!");
    }
    else {
      System.out.println("Sorry, that is NOT the scret word!");
    }
  }
}
