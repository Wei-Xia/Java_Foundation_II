import java.util.*;

class AssignmentFourTwo
{
  public static void main(String[] args)
  {
    while (true)
	{
		    System.out.println("Enter a sentence:");
		    Scanner keyboard = new Scanner(System.in);
        	String[] sentence = keyboard.nextLine().split(" ");

		    if (sentence.isEmpty())      
		    {
				break;	// quit the program when user enter an empty string
		    }
       		
       		else
		    {
            	HashMap<String, Integer> myWordsCount = new HashMap<String, Integer>();

            	for (String s : sentence)
            		{
                		if (myWordsCount.containsKey(s))
                    	myWordsCount.replace(s, myWordsCount.get(s) + 1);
                		else
                    	myWordsCount.put(s, 1);
              		}

//             	System.out.println(myWordsCount.getValue(s));     
            		// Output the all HashMap to check it is correct

    			Iterator iterator = myWordsCount.keySet().iterator();

              	while (iterator.hasNext())
              	{
              		String key = iterator.next().toString();
              		Integer value = myWordsCount.get(key);

              		System.out.println(key + "\t\t" + value);
          		}
		    }
	}
  }
}
