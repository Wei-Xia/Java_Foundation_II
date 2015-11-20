/**
  This class keeps the sales figures for a number of days in an array
  and provides methods for getting the total and average sales, and
  the highest and lowest amounts of sales.
*/

public class SalesData
{
  private double [] sales;    // The sales data

  /**
    The constructor copies the elements in an array to the sales array.
    @param s The array to copy.
  */

  public SalesData(double [] s)
  {
    // Create an array as large as s.
    sales = new double[s.length];

    // Copy the elements from s to sales.
    for (int i = 0; i<s.length; i++)
      sales[i] = s[i];
  }

  /**
    getTotal method
    @return The total of the elements in the sales array.
  */

  public double getTotal()
  {
    double total = 0.0;     // Accumulator

    // Accumulate the sum of the elements in the sales array
    for (int i = 0; i<sales.length; i++ )
      total += sales[i];

    // Return the total
    return total;
  }

  /**
    getAverage method
    @return the average of the elements in the array
  */

  public double getAverage()
  {
    return getTotal()/sales.length;
  }

  /**
    getHighest method
    @return The highest value stored in the sales array.
  */

  public double getHighest()
  {
    double highest = sales[0];

    for (int i = 1; i<sales.length; i++)
    {
        if (sales[i] > highest)
          highest = sales[i];
    }

    return highest;
  }

  /**
    getLowest method
    @return The lowest value stored in the sales array.
  */

  public double getLowest()
  {
    double lowest = sales[0];

    for (int i = 1; i<sales.length; i++)
    {
        if (sales[i] < lowest)
          lowest = sales[i];
    }

    return lowest;
  }
}
