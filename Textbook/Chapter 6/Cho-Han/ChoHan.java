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

      // Create the two players
      Player player1 = new Player(player1Name);
      Player player2 = new Player(player2Name);

      // Play the rounds.
      for (int round = 0; round < MAX_ROUNDS; round++)
      {
          System.out.println("-----------------------------");
          System.out.printf("Now playing round %d.\n", round+1);

          // Roll the dice
          dealer.rollDice();

          // The players make their guesses
          player1.makeGuess();
          player2.makeGuess();

          // Determine the winner of this round
          roundResults(dealer, player1, player2);
      }

      // Display the grand winner
      displayGrandWinner(player1, player2);

      /**
       The roundResults method determine the results of the current round.
       @param dealer The Dealer object
       @param player1 Player #1 object
       @param player2 Player #2 object
      */

      public static void roundResults(Dealer dealer, Player player1, Player player2)
      {
        // Show the dice value
        System.out.printf("The dealer rolled %d and %d.\n",
                            dealer.getDie1Value(), dealer.getDie2Value());

        // Check each player's guess and award points
        checkGuess(player1, dealer);
        checkGuess(player2, dealer);
      }

      /**
        The checkGuess method checks a player's guess against the dealer's result.
        @param player The Player object to check.
        @param dealer The Dealer object.
      */

      public static void checkGuess(Player player, Dealer dealer)
      {
        final int POINTS_TO_ADD = 1;                  // Points to award winner
        String guess = player.getGuess();             // Player's guess
        String choHanResult = dealer.getChoOrHan();   // Cho or Han
      }







  }
}
