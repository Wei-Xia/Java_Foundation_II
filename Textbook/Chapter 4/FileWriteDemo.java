import java.util.*;       // Needed for Scanner class
import java.io.*;         // Needed for File I/O classes

/**
This program writes data to a file
*/

public class FileWriteDemo
{
  public static void main(String[] args) throws IOException {

    String filename;
    String friendName;
    int numFriends;

    // Create a Scanner object for keyboard input
    Scanner keyboard = new Scanner(System.in);

    // Get the number of friends
    System.out.print("How many friends do you have? ");
    numFriends = keyboard.nextInt();

    // Consume the remaining newline character
    keyboard.nextLine();

    // Get the filename
    System.out.print("Enter the filename: ");
    filename = keyboard.nextLine();
  }
}
