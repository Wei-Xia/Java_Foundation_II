import java.io.*;

class Xref
{
     /* Store and manage identifer data */
     // maximum number of idenfiers
     final int MAX_IDENTIFERS = 1000;

     // Storage space for idenfier data
     String[] identiferInformation = new String[MAX_IDENTIFERS];

     // Current number of entries in database
     int numberOfStoredWords;

     void add(String word, int lineNumber)
     {
       /* If not a Java reserved word, insert word into the database,
       indicating that it is referenced on line lineNumber */

       // all Java reserved words; word at end guarantees
       String[] javaReservedWord = {"abstract", "assert", "boolean", "break",
            "byte", "case", "catch", "char", "class", "const", "continue",
            "default", "do", "double", "else", "enum", "extends", "false",
            "final", "finally", "float", "for", "goto", "if", "implements",
            "import", "instanceof", "int", "interface", "long", "native",
            "new", "null", "package", "private", "protected", "public",
            "return", "short", "static", "strictfp", "super", "switch",
            "synchronized", "this", "throw", "throws", "transient", "true",
            "try", "void", "volatile", "while", word};

       int i;        // termination of for loop

       // traverse javaReservedWord and see if any entry matches word
       for (i=0; !word.equals(javaReservedWord[i]); i++);

       // matches a reserved word, so don't add to database
       if ( i < javaReservedWord.length-1 )  return;

       /* doesn't match a reserved word, so proceed by searching to see if
          word is already in database */

       else
       {
         for (int i = 0 ; i < identiferInformation.size; i++ )
            if (word != database.get(i))
              identiferInformation.add(i, word);
       }
     }

     Static void alphabetize(String line)
     {
       for (int i = 0; i < numberOfStoredWords; i++)
       {
          for (int j = i + 1; j < n; j++)
          {
            if (line[i].compareTo(line[j])>0)
            {
              temp = line[i];
              line[i] = line[j];
              line[j] = temp;
            }
          }
       }
     }

     Static void output(BufferedWriter outputFile) throws IOException
     {
       outputFile.newLine();     // for readability

       for (int i = 0; i < numberOfStoredWords; i++ )
       {
         outputFile.newLine();
         outputFile.write(javaReservedWord[i]);
       }
     }
}
