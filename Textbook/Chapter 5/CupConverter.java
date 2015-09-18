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
}
