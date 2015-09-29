import java.util.*;

/**
  Player calss for the game of Cho-Han
*/

public class Player
{
  private String name;      // The player's name
  private String guess;     // The player's guess
  private int points;       // The player's points

  /**
    Constructor
    @param playerName The player's name
  */

  public Player(String playerName)
  {
    name = playerName;
    guess = "";
    points = 0;
  }

  /**
    The makeGuess method causes the player to guess either "Cho (even)" or "Han (odd)".
  */

  public void makeGuess()
  {
    // Create a Random object
    Random rand = new Random();

    // Get a random number, either 0 or 1
    int guessNumber = rand.nextInt(2);

    // Conver the random number to a guess of either "Cho (even)" or "Han (odd)".
    if (guessNumber = 0)
      guess = "Cho (even)";
    else
      guess = "Han (odd)";
  }

  /**
    The addPoints method adds a specified number of points to the player's current balance
    @newPoints The points to add
  */

  public void addPoints(int newPoints)
  {
    points = points + newPoints
  }








}
