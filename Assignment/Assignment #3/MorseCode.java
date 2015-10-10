import java.util.*;

class MorseCode
{
  public static void main(String[] args)
  {

    char [] English = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                        'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                        'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
    String [] Morse = { ".-" , "-..." , "-.-." , "-.." , "." , "..-." , "--." , "...." ,
                        ".." , ".---" , "-.-" , ".-.." , "--" , "-." , "---" , ".--." ,
                        "--.-" ,  ".-." , "..." , "-" , "..-" , "...-" , ".--" , "-..-" , "-.--" , "--.." , "|" };

    String c = Input.getString ( "Please enter a sentence in English, and separate each word with a blank space." );

            c = c.toLowerCase ();

            for ( int x = 0; x < English.length; x++ )
            {
                for ( int y = 0; y < c.length (); y++ )
                {
                    if ( English [ x ] == c.charAt ( y ) )

                    System.out.print ( Morse [ x ] + " " );
                }
            }
  }
}
