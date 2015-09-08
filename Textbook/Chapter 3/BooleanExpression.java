import java.util.*;

public class BooleanExpression
{
  public static void main(String[] args) {

    int score;

    System.out.println("Enter your score:");

    Scanner keyboard = new Scanner(System.in);
    score = keyboard.nextInt();

    System.out.println("Your grade is: " + (score < 60 ? "Fail." : "Pass."));

    // Converted to an if-else statement

  }
}
