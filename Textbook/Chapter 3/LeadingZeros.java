/**
This program displays numbers padded with leading zeros.
*/

public class LeadingZeros
{
  public static void main(String[] args) {

    // Declare a variety of double variables
    double num1 = 1.234;
    double num2 = 12.345;
    double num3 = 123.456;

    // display each variable with leading zeros, in a field of 9 spaces,
    // rounded to 2 decimal places.
    System.out.printf("%09.2f\n", num1);
    System.out.printf("%09.2f\n", num2);
    System.out.printf("%09.2f\n", num3);
  }
}
