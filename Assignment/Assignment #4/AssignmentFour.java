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

		    if (sentence.isEmpty())      // quit the program when user enter an empty string
		    {
			       break;
		    }
        else
		    {
            StringTokenizer st = new StringTokenizer(sentence);

            while (st.hasMoreTokens())
            {
              List<String> sentenceElement = new ArrayList<String>();
              sentenceElement.add(st.nextToken());
            }

            System.out.println(sentenceElement);
		    }
	  }
  }
}
