import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.*;

class AssignmentFourOne
{
  public static void main(String[] args)
  {
    while (true)
	  {
		    System.out.println("Enter a sentence:");
		    Scanner keyboard = new Scanner(System.in);
		    String sentence = keyboard.nextLine();

		    if (sentence.isEmpty())      // quit the program when user enter an empty string
		    {
			      break;
		    }
        else
		    {
            StringTokenizer st = new StringTokenizer(sentence);

            List<String> sentenceElement = new ArrayList<String>();

            while (st.hasMoreTokens())
            {
              sentenceElement.add(st.nextToken());
            }

            System.out.println(sentenceElement);
		    }
	  }
  }
}
