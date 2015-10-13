import java.util.StringTokenizer;
import java.util.Scanner;

class AssignmentFour
{
  public static void main(String[] args)
  {
    System.out.println("Enter a sentence:");
    Scanner keyboard = new Scanner(System.in);


    StringTokenizer st = new StringTokenizer("this is a test");
    while (st.hasMoreTokens())
    {
    System.out.println(st.nextToken());
    }
  }
}
