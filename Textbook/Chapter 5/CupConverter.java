import javax.swing.*;

/**
This program converts cups to fluid ounces.
*/

public class CupConverter
{
  public static void main(String[] args) {

    double cups;
    double ounces;

    // Get the number of cups
    cups = getCups();

    // Convert the cups to fluid ounces
    ounces = cupsToOunces(cups);

    // Display the result;
    displayResults(cups, ounces);
    System.exit(0);
  }

/**
    The getCups method prompts the user to enter a number of cups.
    @return The number of cups entered by the user.
*/

    public static double getCups()
    {
      String input;
      double numCups;

      // Get the number of cups from the user
      input = JOptionPane.showInputDialog("This program converts measurements \n in cups to fluid ounces. For your\n reference the formula is:\n"+
                                            "   1 cup = 8 fluid ounces\n\n" + "Enter the number of cups.")

      // Convert the input to double
      numCups = Double.parseDouble(input);

      // Return the number of cups
      return numCups;
    }

}
