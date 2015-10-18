import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.*;


class AssignmentFour
{
  public static void main(String[] args)
  {

    while (true)
	   {
		System.out.println("Enter a sentence:");
		Scanner keyboard = new Scanner(System.in);
		String sentence = keyboard.nextLine();

		if (sentence.isEmpty())      // isEmpty is to decide whether user enters an empty string or not
		{
			break;
		}

    else
		{
      StringTokenizer st = new StringTokenizer(sentence);
      // ArrayList sentenceElement = new ArrayList();
      List<String> sentenceElement = new ArrayList<String>();


      while (st.hasMoreTokens())
      {
        // System.out.println(st.nextToken());   // Output each words
        sentenceElement.add(st.nextToken());
      }

      for(int index = 0; index < sentenceElement.length; index++)
      {
        System.out.println(sentenceElement[index]);
      }


		}



	}
  }
}
