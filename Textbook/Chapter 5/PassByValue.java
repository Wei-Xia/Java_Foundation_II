/**
This program demonstrates that only a copy of an argument is passed into a method.
*/

public class PassByValue
{
  public static void main(String[] args) {

    int number = 99;

    // Display the value in number
    System.out.println("number is " + number);

    // Call changeMe, passing the value in number as an argument
    changeMe(number);

    // Display
  }
}
