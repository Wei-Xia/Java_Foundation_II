import java.util.*;

/**
  This program allows you to purchase shars of XYZ company's stock
*/

public class StockTrader
{
  public static void main(String[] args)
  {
      int sharesToBuy;      // Number of shares to buy.

      // Create a Stock object for the company stock.
      // The trading symbol is XYZ and stock is currently $9.62 per share
      Stock xyzCompany = new Stock("XYZ", 9.62);

      // Create Scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);

      // Display the current share price.
      System.out.printf("XYZ stock is currently $%,.2f.\n", xyzCompany.getSharePrice());

      // Get the number of shares to purchase
      System.out.print("How many shares do you want to buy?");
      sharesToBuy = keyboard.nextInt();

      // Create a StockPurchase object for the transaction.
      StockPurchase buy = new StockPurchase(xyzCompany, sharesToBuy);

      // Display the cost of the transaction
      System.out.printf("Cost of the stock: $%,.2f\n", buy.getCost());

  }
}
