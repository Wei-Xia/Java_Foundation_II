public class lastIndexOf
{
  public static void main(String[] args)
  {
      String str = "and a one and a two and a three";
      int position1;

      System.out.println("The word and appears at the following locations.");

      position1 = str.lastIndexOf("and");

      while (position1 != -1)
      {
        System.out.println(position1);
        position1 = str.lastIndexOf("and", position1 - 1);
      }
  }
}
