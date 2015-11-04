/**
  This program uses the length fields of a 2D array to display the number of rows,
  and the number of columns in each row.
*/

public class Lengths
{
  public static void main(String[] args)
  {
      // Declare a 2D array with 3 rows  and 4 columns
      int [][] numbers = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};

      // Display the number of rows
      System.out.println("The number of rows is " + numbers.length);

      // Display the number of columns in each row
      for (int i=0; i<numbers.length; i++)
      {
          System.out.println("The number of " + "columns in row " +
                        i + " is " + numbers[i].length);    
      }
  }
}
