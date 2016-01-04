public class trimString
{
  public static void main(String[] args)
  {
      String greeting1 = "  Hello     ";
      String greeting2;

      greeting2 = greeting1.trim();

      System.out.println("*" + greeting1 + "*");
      System.out.println("*" + greeting2 + "*");
  }
}
