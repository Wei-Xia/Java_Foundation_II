import java.util.StringTokenizer;
import java.util.Scanner;

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
			// StringTokenizer st = new StringTokenizer(sentence);
			// String[] arrayElement = new String();
      //
      // while (st.hasMoreTokens())
		  //   {
			// 	    for(int i = 0; i < arrayElement.length; i++)
			// 	      {
			// 		        arrayElement[index] = i;
			// 	      }
      //
			// 	          for (int i = 0; i < arrayElement.length; i++)
  		// 		            {
			// 		       System.out.println(arrayElement[index]);
			// 	              }
      //
      //   System.out.println(st.nextToken());
		  //   }
      StringTokenizer st = new StringTokenizer(sentence);

      while (st.hasMoreTokens())
      {
        System.out.println(st.nextToken());
      }
		}
	}
  }
}
