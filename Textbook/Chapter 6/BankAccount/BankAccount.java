/**
  The BankAccount class simulates a bank account.
*/

public class BankAccount
{
  private double balance;     // Account balance

  /**
    This constructor sets the starting balance at 0.0;
  */

  public BankAccount()
  {
    balance = 0.0;
  }

  /**
    This constructor sets the starting balance to the value passed as an argument.
    @param startBalance The starting balance.
  */

  public BankAccount(double startBalance)
  {
      balance = startBalance;
  }

  /**
    This constructor sets the starting balance to the value in the String argument.
    @param str The starting balance, as a String.
  */

  public BankAccount(String str)
  {
    balance = Double.parseDouble(str);
  }
}
