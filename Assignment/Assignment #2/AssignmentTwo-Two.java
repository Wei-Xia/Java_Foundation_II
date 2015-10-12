// Assignment #2 - 2
// CS 504
// Wei

import java.util.*;

class AssignmentTwo-Two
	{
		public static void main(String[] args)
			{					
				int n = -10; i = -10; j = -10; k = -10;

				do
				{
					n = getAndVerfyInput("Enter size of circle(n)", 0, Integer.MAX_VALUE);
					if (n==0) break;

					i = getAndVerfyInput("Enter first point(i)", 0, n);
					do
					{
						j = getAndVerfyInput("Enter second point(j)", 0, n);
					} while (j==i);

					k = getAndVerfyInput("Enter third point(k)", 0, n);

					if (j>i)
					{
						if (k <= j && k >i)
						{
							System.out.println("\nk does not lie on the arc from" +  
								"j to i when moving clockwise on a circle of size n.");
						}
						else
						{
							System.out.println("\nk lies on the arc from j to i" + 
								"when moving clockwise on a circle of size n.");
						}
					}
					else
						if (k > j && k <= i)
						{
							System.out.println("\nk lies on the arc from j to i " + 
								"when moving clockwise on a circle of size n.");
						}
						else
						{
							System.out.println("\nk doesn't lie on the arc from j " +
								"to i when moving clockwise on a circle of size n.");
						}
				} while (n!=0);
			}

		static int getAndVerfyInput(String userPrompt, int lowerBound, 
											int upperBound, int temp)
			{
				int result;
				Scanner keyboard = new Scanner(System.in);
				
				do
				{
					System.out.println(userprompt);
					result = keyboard.nextInt();
					if (temp > 0 && result == -1)
					{
						return temp;
					}
				} while	(result > upperBound || result < lowerBound);
				
				return result;
			}
	}
