/**
  This program simulates the rolling of dice
*/

public class DiceDemo
{
  public static void main(String[] args)
  {
      final int DIE1_SIDES = 6;   // Number of sides for die #1
      final int DIE2_SIDES = 12;  // Number of sides for die #2
      final int MAX_ROLLS = 5;    // Number of times to roll

      // Create two instances of the Die class.
      Die die1 = new Die(DIE1_SIDES);
      Die die2 = new Die(DIE2_SIDES);

      // Display the initial state of the dice
      System.out.println("This simulates the rolling of a " + DIE1_SIDES + " sided die and a "
                          + DIE2_SIDES + " sided die.");
  }
}
