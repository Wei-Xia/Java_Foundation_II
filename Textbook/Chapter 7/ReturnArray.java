/**
  This program demonstrates how a reference to an array can be returned from a method
*/

public class ReturnArray
{
  public static void main(String[] args)
  {
      double [] values;

      values = getArray();

      for (double num : values) {
        System.out.println(num + " ");
      }
  }

  /**
    getArray method
    @return A reference to an array of doubles.
  */

  public static double[] getArray()
  {
    double[] array = {1.2, 3.4, 4.5, 6.5, 53.34};

    return array;
  }
}
