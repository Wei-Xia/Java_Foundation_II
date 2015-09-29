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
}
