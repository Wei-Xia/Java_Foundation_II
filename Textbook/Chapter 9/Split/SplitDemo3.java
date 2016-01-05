public class SplitDemo3
{
  public static void main(String[] args)
  {
      // Create a string with leading and trailing whitespaces.
      String str = " one;two;three   ";

      // Trim leading and trailing whitespaces
      str = str.trim();

      // Tokenize the string using the semicolon as a delimiter
      String[] tokens = str.split(";");

      // Display the tokens
      for (String s : tokens)
        System.out.println("*" + s + "*");
  }
}
