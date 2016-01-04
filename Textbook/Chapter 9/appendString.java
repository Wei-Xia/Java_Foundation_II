public class appendString
{
  public static void main(String[] args)
  {
      StringBuilder str = new StringBuilder();

      // Append values to the object
      str.append("We sold ");       // Append a String object
      str.append(12);               // Append an int
      str.append(" doughnuts for $");     // Append another String
      str.append(173.2);            // Append a double

      // Display the object's contents
      System.out.println(str);
  }
}
