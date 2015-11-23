import java.util.ArrayList;     // Needed for ArrayList class

/**
  This program demonstrates inserting an item.
*/

public class ArrayListDemo4
{
  public static void main(String[] args)
  {
      // Create an ArrayList to hold some names.
      ArrayList<String> nameList = new ArrayList<String>();

      // Add some names to the ArrayList
      nameList.add("James");
      nameList.add("John");
      nameList.add("Jessic");

      // Display the items in nameList and their indices.
      for (int index = 0; index < nameList.size(); index++)
      {
          System.out.println("Index: " + index + " Name: " +
                                  nameList.get(index));
      }

      // Now insert an item at index 1.
      nameList.add(1, "Jimmy");

      System.out.println("\nMary was added at index 1.\n Here are the items now.");

      // Display the items in nameList and their indices.
      for (int index = 0; index < nameList.size(); index++)
      {
          System.out.println("Index: " + index + " Name: " +
                                  nameList.get(index));
      }
  }
}
