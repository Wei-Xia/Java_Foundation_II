import java.util.Scanner; // Needed for the Scanner class 2

/*
This program has a problem reading input.
*/

public class CorrectedInputProblem{

      public static void main(String[] args){

        String name;        // To hold the user's name
        int age;            // To hold the user's age
        double income;      // To hold the user's income

        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get the user's age.
        System.out.print("What is your age? ");
        age = keyboard.nextInt();

        // Get the user's income
        System.out.print("What is your annual income? ");
        income = keyboard.nextDouble();

        // Consume the remaining newline.
        keyboard.nextLine();

        // Get the user's name.
        System.out.print("What is your name? ");
        name = keyboard.nextLine();

        // Display the information back to the user.
        System.out.println("Hello, " + name + ". Your age is " + age + " and your income is $" + income);
      }
}

/* Notes:
Notice that after the user’s income is read by the nextDouble method in line 24,
the nextLine method is called in line 27. The purpose of this call is to
consume, or remove, the newline character that remains in the keyboard buffer.
Then, in line 31, the nextLine method is called again. This time it correctly reads the user’s name.

Notice that in line 27, where we consume the remaining newline character,
we do not assign the method’s return value to any variable.
This is because we are simply calling the method to remove the newline character, 
and we do not need to keep the method’s return value.
*/
