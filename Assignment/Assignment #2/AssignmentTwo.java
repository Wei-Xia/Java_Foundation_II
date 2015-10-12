import java.util.*;

class AssignmentTwo
	{
		public static void main(String[] args)
			{
				int n,i,j,k;					// n is size of circle, and i, j and k are the circular coordinates of 3 points on it

				do
				{
					n = getAndVerfyInput("Enter sieze of circle, n", 0, Integer.MAX_VALUE);
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
							System.out.println("\nk does not lie on the arc from j to i when moving clockwise on a circle of size n.");
						}
						else
							System.out.println("\nk lies on the arc from j to i when moving clockwise on a circle of size n.");
					}
					else if (k > j && k <= i)
					{
							System.out.println("\nk lies on the arc from j to i when moving clockwise on a circle of size n.");
					}
					else
							System.out.println("\nk doesn't lie on the arc from j to i when moving clockwise on a circle of size n.");
				} while ( n!=0);
			}

		static int getAndVerfyInput(String userPrompt, int lowerBound, int upperBound)
			{
				System.out.println(userPrompt);

				int result;
				Scanner keyboard = new Scanner(System.in);			// Scanner object wrapped around the keyboard, for user input
				result = keyboard.nextInt();

				while	(result > upperBound || result < lowerBound)
				{
					System.out.println(userPrompt);
					result = keyboard.nextInt();
				}

				return result;
			}
	}
