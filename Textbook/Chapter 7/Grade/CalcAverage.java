import java.util.Scanner;

/**
  This program gets a set of test scores and uses the Grader class to calculate
  the average with the lowest score dropped
*/

public class CalcAverage
{
  public static void main(String[] args)
  {
      int numScores;        // To hold the number of scores

      // Create a Scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);

      // Get the number of test scores
      System.out.print("How many test scores do you have? ");
      numScores = keyboard.nextInt();

      // Create an array to hold the test scores.
      double[] scores = new double[numScores];

      // Get the test scores and store them in the scores array.
      for (int i = 0; i<numScores.length; i++)
      {
          System.out.print("Enter score #" + (i+1) + ": ");
          scores[i] = keyboard.nextInt();
      }

      // Create a Grader object, passing the scores array as an argument to the constructor.
      Grader myGrader = new Grader(scores);

      // Display the adjusted average.
      System.out.println("Your adjusted average is " + myGrader.getAverage());

      // Display the lowest score.
      System.out.println("Your lowest score was " + myGrader.getLowest());
  }
}
