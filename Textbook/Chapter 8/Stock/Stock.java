/**
  The Stock class holds data about a stock
*/

public class Stock
{
  private String symbol;      // Trading symbol of stock
  private double sharePrice;  // Current price per sharePrice

  /**
    Constructor
    @param sym The stock's trading symbol.
    @param price The stock's share price.
  */

  public Stock(String sym, double price)
  {
    symbol = sym;
    sharePrice = price;
  }

  /**
    getSymbol method
    @return The stock's trading symbol
  */

  public String getSymbol()
  {
    return symbol;
  }

  /**
    getSharePrice method
    @return The stock's share price
  */

  public double getSharePrice()
  {
    return sharePrice;
  }

  /**
    toString method
    @return A string indicating the object's trading symbol and share price.
  */

  public String toString()
  {
    // Create a string describing the stock
    String str = "Trading symbol: " + symbol +
                 "\nShare price: " + sharePrice;

    // Return the string.
    return str;
  }

  public boolean equals(Stock object2)
  {
      boolean status;

      // Determine whether this object's symbol and
      // sharePrice fields are equal to object2's symbol and sharePrice fields.

      if (symbol.equals(object2.symbol) && sharePrice == object2.sharePrice)
        status = true; // Yes, the objects are equal.
      else
        status = false; // No, the objects are not equal.

      // Return the value in status.
      return status;
   }


   public Stock copy()
   {
      // Create a new Stock object and initialize it
      // with the same data held by the calling object.
      Stock copyObject = new Stock(symbol, sharePrice);
      
      // Return a reference to the new object.
      return copyObject;
   }

}
