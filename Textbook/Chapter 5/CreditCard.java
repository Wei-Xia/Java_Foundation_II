import javax.swing.*;

/**
This program uses two void methods
*/

public class CreditCard
{
  public static void main(String[] args) {

    double salary;      // Annual salary
    int creditRating;   // Credit rating
    String input;       // To hold the user's input

    // Get the user's annual salary
    input = JOptionPane.showInputDialog("What is your annual salary?");
    salary = Double.parseDouble(input);

    // Get the user's credit rating (1 through 10)
    input = JOptionPane.showInputDialog("On a scale of 1 through 10, what is your credit rating?\n"
              + "(10 = excellent, 1 = very bad)";
    creditRating = Integer.parseInt(input);
  }
}
