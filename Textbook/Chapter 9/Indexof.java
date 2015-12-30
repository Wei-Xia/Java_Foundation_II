public class Indexof
{
  public static void main(String[] args)
  {
      String str = "Four score and seven years ago";
      int first, last;

      first = str.indexOf('r');
      last = str.lastIndexOf('r');

      System.out.println("The letter r first appears at position " + first);
      System.out.println("The letter r last appears at position " + last);

      int position1;

      System.out.println("\nThe letter r appears at the following locations: ");
      position1 = str.indexOf('r');

      while(position1 != -1)
      {
        System.out.println(position1);
        position1 = str.indexOf('r', position1 + 1);
      }

      int position2;

      System.out.println("\nThe letter r appears at the following locations: ");
      position2 = str.lastIndexOf('r');

      while(position2 != -1)
      {
        System.out.println(position2);
        position2 = str.lastIndexOf('r', position2 - 1);
      }
      
  }
}
