/**
  This program rolls a 6-sided die and a 20-sided die.
*/

public class DieArgument
{
  public static void main(String[] args)
  {
      final int SIX_SIDES = 6;
      final int TWENTY_SIDES = 20;

      // Create a 6-sided and 20-sided die
      Die sixDie = new Die(SIX_SIDES);
      Die twentyDie = new Die(TWENTY_SIDES);

      // Roll the dice.
      rollDie(sixDie);
      rollDie(twentyDie);


  }
}
