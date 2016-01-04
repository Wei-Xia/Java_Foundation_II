public class valueOf
{
  public static void main(String[] args)
  {
      boolean b = true;
      char[] letters = {'a', 'b', 'c', 'd', 'e'};
      double d = 2.584693;
      int i = 7;


      System.out.println(String.valueOf(b));
      System.out.println(String.valueOf(letters));
      System.out.println(String.valueOf(letters, 1, 3));
      System.out.println(String.valueOf(d));
      System.out.println(String.valueOf(i));
  }
}
