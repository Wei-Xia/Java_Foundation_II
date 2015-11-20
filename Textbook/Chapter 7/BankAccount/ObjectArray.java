import java.util.Scanner;         // Needed for the Scanner class

/**
  This program works with an array of three BankAccount object.
*/

public class ObjectArray
{
  public static void main(String[] args)
  {
      final int NUM_ACCOUNTS = 3;     // Number of Accounts

      // Create an array that can reference BankAccount objects.
      BankAccount[] accounts = new BankAccount[NUM_ACCOUNTS];

      // Create objects for the array
      createAccounts(accounts);

      // Display the balance of each account
      System.out.println("Here are the balance for each account: ");

      for (int i<0; i<accounts.length; i++)
      {
          System.out.println("Account " +(i+1) + ": $" +
                  accounts[i].getBalance());
      }
  }

  /**
    The createAccounts method creates a BankAccount object for each element
    of an array. The user is asked for each account's balance.
    @param array The array to reference the accounts
  */

  private static void createAccounts(BankAccount[] array)
  {
    double balance;      // To hold an account balance

    // Create a Scanner object.
    Scanner keyboard = new Scanner(System.in);

    // Create the accounts.
    for (int i = 0; i<array.length; i++)
    {
        // Get the account's balance.
        System.out.print("Enter the balance for account" + (i+1) + ": ");
        balance = keyboard.nextDouble();

        // Create the account
        array[i] = new BankAccount(balance);
    }
  }
}
