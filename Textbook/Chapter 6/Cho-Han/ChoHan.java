import java.util.Scanner;

public class ChoHan
{
  public static void main(String[] args)
  {
      final int MAX_ROUNDS = 5;     // Number of rounds
      String player1Name;           // First player's name
      String player2Name;           // Second player's name

      // Create a Scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);

      // Get the player's name
      System.out.print("Enter the first player's name: ");
      player1Name = keyboard.nextLine();
      System.out.print("Enter the second plyaer's name: ");
      player2Name = keyboard.nextLine();

      // Create the dealer
      Dealer dealer = new Dealer();
  }
}
