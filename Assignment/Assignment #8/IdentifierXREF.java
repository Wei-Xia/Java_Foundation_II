import java.util.*;         // for input & tokenizer
import java.io.*;           // for output

/**
How it works?
1. Procceed line by line
2. Output line with blank space pre-appended
3. Simplify each line to a string of words separeated by blanks
4. For each word extracted, add/update word to grow XREF
5. When all lines have been Procceed, then alphabetize XREF output to a file
*/

class IdentifierXREF
{
  public static void main(String[] args) throws IOException
  {
    // Produce cross-reference to Java program
    for (/*each line of input*/)
    {
      /*
        Get next line;
        Output it with line blank pre-appended;
        Simplify line;
      */
      Scanner inputFile = new Scanner(new File(args[0] + ".java"));    // input file

      Bufferedwriter outputFile = new Bufferedwriter(new FileWriter(args[0] + ".xref"));    // output file

      for (int lineNumber = 1; inputFile.hasNextLine(); lineNumber++)  //each word in line
      {
          /* add/update word to XREF*/
          String line = inputFile.nextLine();

          outputFile.write(lineNumber + "   " + line);      // way one
          outputFile.newLine();         // way two turn the line

          StringTokenizer words = new StringTokenizer(simplifyLine(line));
      }
    }

    // Alphabetize XREF;
    // Output XREF;
  }     // End of main
}       //End of class
