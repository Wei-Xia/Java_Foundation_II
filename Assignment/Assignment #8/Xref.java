class Xref
{
    /* Store and manage identifer data */
    // maximum number of idenfiers
    final int MAX_IDENTIFERS = 1000;

    // Storage space for idenfier data
    String[] identiferInformation = new String[MAX_IDENTIFERS];

    // Current number of entries in database
    int numberOfStoredWords;

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

         if (!character.isLetterOrDigit(c) && c != '_' && c != '$')
         c = ' ';

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

       // Create an ArrayList to hold some names.
       ArrayList<String> database = new ArrayList<String>();

       for (int i = 0 ; i < database.size; i++ )
       {
          if (word != database.get(i))
            database.add(i, word)
       }
     }
}
