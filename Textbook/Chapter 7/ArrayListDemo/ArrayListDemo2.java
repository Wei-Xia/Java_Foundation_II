import java.util.ArrayList;     // Needed for ArrayList class

/**
  This program demonstrates how the enhaced for loop can be used
  with an ArrayList
*/

public class ArrayListDemo2
{
  public static void main(String[] args)
  {
      // Create an ArrayList to hold some names.
      ArrayList<String> nameList = new ArrayList<String>();

      // Add some names to the ArrayList
      nameList.add("James");
      nameList.add("John");
      nameList.add("Jessic");

      // Display the size of the ArrayList
      System.out.println("The ArrayList has " + nameList.size() +
                            " objects stored in it.");

      // Now display the items in nameList
      for (String name : nameList)
        System.out.println(name);
  }
}
