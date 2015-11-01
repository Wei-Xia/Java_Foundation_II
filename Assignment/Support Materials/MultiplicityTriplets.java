import java.util.*;         // Need this for Scanner

class MultiplicityTriplets
  {
    /* DISPLAY INPUT, GOVERNED BY CHARACTER MULTIPLICITY, AS TRIPLETS SEPARATED BY BLANKS*/

    public static void main(String[] args)
    {
        final int OUTPUT_UNIT_SIZE = 3;       // number of characters in each output unit (i.e. triplet).
        Scanner keyboard = new Scanner(System.in);      // user input from keyboard
        int outputCourt = OUTPUT_UNIT_SIZE - 1;     // Remaining size of current triplet - 1.

        // Keep going until we input a negative multiplicity
        while(true)
        {
          int count = keyboard.nextInt();         //Number of times number is to be output.
          if (count<0) break;                     //Stop execution when input negative multiplicity.
          int number = keyboard.nextInt();        //Input value to be output multiple times;

          // Output number, count times
          for (; count>0; count--)
          {
              System.out.print(number);

              // Output blank after each triplet
              if (--outputCourt < 0)
              {
                  System.out.print(" ");   //Display blank that comes after each triplet.
                  outputCourt = OUTPUT_UNIT_SIZE - 1 ;  // reinitialize count for next triplet.
              }         //End if
          }             //End for
        }               //End while
    }                   //End main
  }                     //End class MultiplicityTriplets
