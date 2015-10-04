import javax.swing.*;       // For the JOptionPane class

/**
  This program demonstrates the BankAccount class.
*/

public class AccountTest
{
  public static void main(String[] args)
  {
      String input;     // To hold user input

      // Get the starting object
      input = JOptionPane.showInputDialog("What is your account's starting balance?");

      // Create a BankAccount object
      BankAccount account = new BankAccount(input);

      // Get the amount of pay.
      input = JOptionPane.showInputDialog("How much were you paid this month?");

      // Deposit the user's pay into the account
      account.deposit(input);
  }
}
