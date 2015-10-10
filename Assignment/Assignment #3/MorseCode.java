import java.util.*;

class MorseCode
{
  public static void main(String[] args)
  {

    char [] English = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
                        'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
                        'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
                        'Y', 'Z'};

    String [] Morse = { "·-", "-···", "-·-·", "-··", "·", "··-·", "--·", "····",
                        "··", "·---", "-·-", "·-··", "--", "-·", "---", "·--·",
                        "--·-",  "·-·", "···", "-", "··-", "···-", "·--", "-··-",
                        "-·--", "--··"};

    String c;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Please enter a sentence in English.");

    c = keyboard.nextLine();

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
