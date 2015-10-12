import java.util.*;

class MorseCode
{
  public static void main(String[] args)
  {

    char [] English = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
                        'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
                        'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
                        'Y', 'Z',' '};

    String [] Morse = { "·-", "-···", "-·-·", "-··", "·", "··-·", "--·", "····",
                        "··", "·---", "-·-", "·-··", "--", "-·", "---", "·--·",
                        "--·-",  "·-·", "···", "-", "··-", "···-", "·--", "-··-",
                        "-·--", "--··","bb"};

    String sentence;
    Scanner keyboard = new Scanner(System.in);

      System.out.println("Please enter a sentence in English, or enter $ to quit");
      sentence = keyboard.nextLine();
      sentence = sentence.toUpperCase();

      while(!sentence.contains("$")){
      for ( int a = 0; a < English.length; a++ )
      {
        for ( int b = 0; b < sentence.length (); b++ )
        {
          if ( English[a] == sentence.charAt(b))
          System.out.print(Morse[a]+"b");
        }
      }
      System.out.println("\nPlease enter a sentence in English, or enter $ to quit");
      sentence = keyboard.nextLine();
      sentence = sentence.toUpperCase();
      }


  }
}
