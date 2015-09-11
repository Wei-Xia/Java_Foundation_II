import java.util.*;
import java.io.*;

/**
This version of the program confirms that the
Numbers.doc file exists before opening it.
*/

public class FileSum2
{
  public static void main(String[] args) throws IOException{

    double sum = 0.0; // Accumulator, initialized to 0

    // Make sure the file exists
    File file = new File("Numbers.doc");
    if (!file.exists()) {
      System.out.println("The file Numbers.doc is not found.");
      System.exit(0);
    }

    // Open the file for reading
    Scanner inputFile = new Scanner(file);

    // Read all of the values from the file and calculate their total
    while(inputFile.hasNext()){

      // Read a value from the file
      double number = inputFile.nextDouble();

      // Add the number to sum
      sum = sum + number;
    }

    // Close the file
    inputFile.close();

    // Display the sum of the numbers.
    System.out.printf("The sum of the numbers in Numbers.doc is %.2f.\n", sum);
  }
}
