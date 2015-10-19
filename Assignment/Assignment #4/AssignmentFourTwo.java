import java.util.*;

class AssignmentFourTwo
{
  public static void main(String[] args)
  {
    while (true)
	  {
		    System.out.println("Enter a sentence:");
		    Scanner keyboard = new Scanner(System.in);
        String[] myPhrase = keyboard.nextLine().split(" ");

		    if (myPhrase.isEmpty())      // quit the program when user enter an empty string
		    {
			        break;
		    }
        else
		    {
              HashMap<String, Integer> myWordsCount = new HashMap<String, Integer>();

              for (String s : myPhrase)
              {
                if (myWordsCount.containsKey(s))
                    myWordsCount.replace(s, myWordsCount.get(s) + 1);
                else
                    myWordsCount.put(s, 1);
              }

              // System.out.println(myWordsCount.getValue(s));     // Output the all HashMap to check it is correct

              Iterator iterator = myWordsCount.keySet().iterator();

              while (iterator.hasNext())
              {
                  String key = iterator.next().toString();
                  Integer value = myWordsCount.get(key);

                  System.out.println(key + " " + value);
              }
		    }
	  }
  }
}
