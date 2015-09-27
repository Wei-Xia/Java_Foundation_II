import java.util.*;

/**
  The Die class simulates a six-sided die.
*/

public class Die
{
  private int sides;    // Number of sides
  private int value;    // The die's value

  /**
    The constructor performs an initial roll of the die.
    @param numSides The number of sides for this die.
  */

  public Die(int numSides)
  {
    sides = numSides;
    roll();
  }
}
