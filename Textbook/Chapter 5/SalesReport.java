import java.util.*;           // For the Scanner class
import java.io.*;             // For file I/O classes
import javax.swing.JOptionPane;   // For the JOptionPane class

/**
This program opens a file containing the sales amounts for 30 days.
It calculates and displays the total sales and average daily sales.
*/

public class SalesReport
{
  public static void main(String[] args) throws IOException{

    final int NUM_DAYS = 30;  // Number of days of sales
    String filename;          // The name of the file to open
    double totalSales;        // Total sales for period
    double averageSales;      // Average daily sales

    // Get the name of the file
    filename = getFileName();

    // Get the total sales from the file
    totalSales = getTotalSales(filename);

    // calculate the average
    averageSales = totalSales / NUM_DAYS;

    // display the total and average
    displayResults(totalSales, averageSales);

    System.exit(0);
  }

  /**
  The getFileName method prompts the user to enter the name of the file to open.
  @return A reference to a String object containing the name of the file.
  */

  public static String getFileName()
  {
    String file;      // To hold the file name

    // Prompt the user to enter a file name
    file = JOptionPane.showInputDialog("Enter the name of the file\n" + "containing 30 days of sales amounts.")

    // Return the name
    return file;
  }

  
}
