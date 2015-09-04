// CS 504 AssignmentOne
// Name: Wei

import java.util.*;

public class AssignmentOne {

	public static void main(String[] args) {

		System.out.println("Please enter i,j,k,n");
		int i,j,k,n;
		Scanner scan = new Scanner (System.in);
		i = scan.nextInt();
		j = scan.nextInt();
		k = scan.nextInt();
		n = scan.nextInt();

		if (j<k && k<=n && i<j)
			System.out.println("k lies on the arc from j to i when moving clockwise on a circle of size n");
		else
			if(k<=i && i<j)
				System.out.println("k lies on the arc from j to i when moving clockwise on a circle of size n");
			else
				if(j<k && k<=i)
					System.out.println("k lies on the arc from j to i when moving clockwise on a circle of size n");
				else
					System.out.println("k does NOT lie on the arc from j to i when moving clockwise on a circle of size n");
					
	}
}
