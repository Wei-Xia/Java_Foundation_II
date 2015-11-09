import java.util.Scanner;

public class OneTest
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      ClassicBoard b = new ClassicBoard();
      ClassicBoard c = new ClassicBoard();

      int numberOfMoves = 1;
      int humansLastMove = -1;

      while(b.findWin() <= 0 && numberOfMoves < 10)
      {
         if (numberOfMoves % 2 == 0)
         {
            System.out.println("B turn now. Please enter an integer from 1 to 9.");
            int in1 = scan.nextInt();
            while(!b.makeMove(2,in1))
            {
               System.out.println("You entered an invalid move. Please enter a new one.");
               in1 = scan.nextInt();
            }
            b.printBoard();
            numberOfMoves++;
         }
         else
         {
           System.out.println("C turn now. Please enter an integer from 1 to 9.");
           int in1 = scan.nextInt();
           while(!c.makeMove(2,in1))
           {
              System.out.println("You entered an invalid move. Please enter a new one.");
              in1 = scan.nextInt();
           }
           c.printBoard();
           numberOfMoves++;
         }
      }
   }
}
