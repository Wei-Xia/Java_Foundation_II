/**
  The Grader class calculates the average of an array of test scores,
  with the lowest score dropped.
*/

public class Grader
{
  // The testScores field is a variable that will reference an array of test scores.
  private double [] testScores;

  /**
    Constructor
    @param scoreArray An array of test scores.
  */

  public Grader(double [] scoreArray)
  {
    //Assign the array argument to the testScores field.
    testScores = scoreArray;
  }

  /**
   getLowestScore method
   @return The lowest test score.
  */

  public class getLowestScore()
  {
    double lowest;      // To hold the lowest score

    // Get the first test score in the array
    lowest = testScores[0];

    // Step through the rest of the array. When a value less than lowest is found,
    // assign it to lowest.
    for (int i=1; i<testScores.length; i++)
    {
        if (testScores[i] < lowest)
          lowest = testScores[i];
    }

    // Return the lowest test score.
    return lowest;
  }

  /**
    getAverage method
    @return The average of the test scores with the lowest score dropped.
  */

  public double getAverage()
  {
    double total = 0;       // To hold the score total
    double lowest;          // To hold the lowest score
    double average;         // To hold the average

    // If the array contains less than two test scores, display an error
    // message and set average to 0.
    if (testScores.length<2)
    {
        System.out.println("ERROR: You must have at least two test scores!");
        average = 0;
    }
    else
    {
      // First, calculate the total of the scores.
      for (double score : testScores)
        total += score;

      // Next, get the lowest score.
      lowest = getLowest();

      // Subtract the lowest score from the total.
      total -= lowest;

      // Get the adjusted average
      average = total / (testScores.length-1);
    }

    // Return the adjusted average
    return average;
  }

}
