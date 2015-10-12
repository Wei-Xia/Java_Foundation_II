import java.util.*;

class AssignmentTwo
	{
		/* Determine if k is on the arc when moving clockwise from j to i on a circle of size n. */

		public static void main(String[] args)
			{
				int n,i,j,k;					// n is size of circle, and i, j and k are the circular coordinates of 3 points on it

				n = getAndVerfyInput("Enter size of circle, n", 0, Integer.MAX_VALUE);
				i = getAndVerfyInput("Enter first point(i)", 0, n);
				j = getAndVerfyInput("Enter second point(j)", 0, n);
				k = getAndVerfyInput("Enter third point(k)", i, j);

				// Determine if n, i, j and k satisfy all 4 necessary conditions and display appropriate message
				if (n>0 && i>=0 && i<=n && j>=0 && j<=n && k>=0 && k<=n && i!=j &&
						((k<=i&&i<j)||(i<j&&j<k)||(j<k&&k<=i)))
					System.out.println("\nk lies on the arc from j to i when moving clockwise on a circle of size n.");
				else
					System.out.println("\nk does not lie on the arc from j to i when moving clockwise on a circle of size n.");
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
