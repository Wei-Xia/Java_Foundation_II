import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.ArrayList;


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
      List<String> sentenceElement = new ArrayList<>();


      while (st.hasMoreTokens())
      {
        System.out.println(st.nextToken());   // Output each words

        sentenceElement.add(st.nextToken());


        // String i = st.nextToken();
        // for(int index = 0 ;index < arrayElement.length; index++)
        // {
        //   arrayElement[index]= i;
        // }
      }

      // for(int index = 0; index < arrayElement.length; index++)
      // {
      //   System.out.println(arrayElement[index]);
      // }
		}



	}
  }
}
