import javax.swing.*;

/**
  This program creates three instances of the Rectangle class.
*/

public class RoomArea
{
  public static void main(String[] args)
  {
      double number;      // To hold a number
      double totalArea;   // The total area
      String input;       // To hold user input

      // Create three Rectangle objects
      Rectangle kitchen = new Rectangle();
      Rectangle bedroom = new Rectangle();
      Rectangle den = new Rectangle();

      // Get and store the dimension of the kitchen
      input = JOptionPane.showInputDialog("What is the kitchen's length?");
      number = Double.parseDouble(input);
      kitchen.setLength(number);

      input = JOptionPane.showInputDialog("What is the kitchen's width?");
      number = Double.parseDouble(input);
      kitchen.setWidth(number);

      // Get and store the dimension of the bedroom
      input = JOptionPane.showInputDialog("What is the bedroom's length?");
      number = Double.parseDouble(input);
      bedroom.setLength(number);

      input = JOptionPane.showInputDialog("What is the bedroom's width?");
      number = Double.parseDouble(input);
      bedroom.setWidth(number);

      // Get and store the dimension of the den
      input = JOptionPane.showInputDialog("What is the den's length?");
      number = Double.parseDouble(input);
      den.setLength(number);

      input = JOptionPane.showInputDialog("What is the den's width?");
      number = Double.parseDouble(input);
      den.setWidth(number);



  }
}
