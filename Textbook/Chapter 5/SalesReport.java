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
}
