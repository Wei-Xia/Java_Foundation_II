/**
  Dealer class for the game of Cho-Han
*/

public class Dealer
{
  private int die1Value;  // The value of die #1
  private int die2Value;  // The value of die #2

  /**
    Constructor
  */

  public Dealer()
  {
    die1Value = 0;
    die2Value = 0;
  }

  /**
    The rollDice method rolls the dice and saves their values
  */

  public void rollDice()
  {
    final int SIDES = 6;   // Number of sides for the dice

    // Create the two dices (This also rolls them)
    Die die1 = new Die(SIDES);
    Die die2 = new Die(SIDES);

    // Record their values
    die1Value = die1.getValue();
    die2Value = die2.getValue();
  }
}
