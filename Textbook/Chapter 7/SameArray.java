/**
  This program demonstrates that two variables can reference the same array.
*/

public class SameArray
{
  public static void main(String[] args)
  {
      int [] array1 = {2,4,6,8,10};       // Array 1
      int [] array2 = array1;             // Array 2

      int [] array3 = new int[5];         //Array 3

      // copy each elements in array1 to array3
      for (int i = 0; i<array1.length; i++)
      {
          array3[i] = array1[i];
      }

      // Change one of the elements using array1
      array1[0] = 200;

      // Change one of the elements using array2
      array2[4] = 100;

      // Change one of the elements using array3
      array3[3] = 99999;

      // Display all the elements using array1
      System.out.println("The contents of array1: ");
      for (int value : array1)
        System.out.print(value + " ");
      System.out.println();

      // Display all the elements using array2
      System.out.println("The contents of array2: ");
      for (int value : array2)
        System.out.print(value + " ");
      System.out.println();

      // Display all the elements using array3
      System.out.println("The contents of array3: ");
      for (int value : array3)
        System.out.print(value + " ");
      System.out.println();
  }
}
