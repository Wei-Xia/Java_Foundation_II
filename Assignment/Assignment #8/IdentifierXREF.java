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

    Scanner inputFile = new Scanner(new File(args[0] + ".java"));    // input file

    Bufferedwriter outputFile = new Bufferedwriter(new FileWriter(args[args.length -1] + ".xref"));    // output file
    Bufferedwriter outputFile = new Bufferedwriter(new FileWriter(args.length == 1 ? args[0] : args[1] + ".xref"));    // output file

    for (int lineNumber = 1; inputFile.hasNextLine(); lineNumber++ /*each line of input*/)
    {
      /*
        Get next line;
        Output it with line blank pre-appended;
        Simplify line;
      */

      String line = inputFile.nextLine();

      outputFile.write(lineNumber + "   " + line);      // way one
      outputFile.newLine();         // way two: turn the line

      StringTokenizer words = new StringTokenizer(simplifyLine(line));

      while (words.hasMoreTokens())
      {
        Xref.add(words.nextToken(), lineNumber);
      }

      for (/*each word in line*/)  //each word in line
      {
          /* add/update word to XREF*/
            Xref.add(word, lineNumber);
      }
    }

    // Alphabetize XREF;
    Xref.alphabetize();

    // Output XREF;
    Xref.output();

  }     // End of main

  Static String simplifyLine(String line)
  {
    /* replace commnets, literal strings, characterr constant, numeric constants,
       operator, punctuation, etc.
       those characters are not part of identifer in line replacing by blanks*/
    line = deleteComments(line);
    line = deleteLiteralString(line);
    line = deleteCharacterConstant(line);
    line = deleteNumericConstant(line);
    line = deleteOperatorPunctuation(line);

    return line;
  }

  Static String deleteComments(String line)
  {
    /* replace /* style comments by a single blank, and remove // style comments */
    while ((int i = line.indexOf("\*"))>-1)  //line contatins '/*'
    {
        // Find position of first /*
        // Find position of second */
        // Replace substring from /* to */ by a blank
        line = line.substring(0,1) + " " + line.substring(line.indexOf("\*")+2);

        return line;
    }

    /*eliminate // comments if it appears in line*/
    if ((int i = line.indexOf("//"))>-1)
      line = line.substring(0,i);

    return  line;
  }

  Static String deleteLiteralString(String line)
  {
    while ((int i = line.indexOf("\"")) > -1)
    {
      // Everything in line up to first "
      String start = line.substring(0,1);

      // Everything in line after first "
      String end = line.substring(i+1);

      line = start + " " + end.substring(end.indexOf("\"")+1);
    }

    return line;
  }

  Static String deleteCharacterConstant(String line)
  {
    while ((int i = indexOf("'")) > -1)
    {
      String start = line.substring(0,i);
      String end = line.substring(i+3);

      line = start + " " + end;
    }

    return line;
  }

  Static String deleteNumericConstant(String line)
  {
    // Replace each numeric constant by a single blank
    final int NOTIDENTIFIER = 0;
    final int IDENTIFIER = NOTIDENTIFIER + 1;

    // Empty String, build output character by character 1 at a line
    String output = "";

    int state = NOTIDENTIFIER;
    for (int i = 0; i<line.length(); i++)
    {
      char C = line.charAt(i);    // current input character;

      switch(state)
      {
        case NOTIDENTIFIER:
          output += character.isDigit(c) ? " " : character.toString(c);
          if (character.isLetter(c) || c == '_' || c == '$')
            state = IDENTIFIER;
          break;

        case IDENTIFIER:
          output += character.toString(c);
          if (c == '')
            state = NOTIDENTIFIER;
          break;
      }
    }

    return output;
  }

}       //End of class
