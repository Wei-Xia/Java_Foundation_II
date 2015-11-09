import java.util.Arrays;

public class ClassicBoard
{
   int numberOfMovesPlayed = 0;
   int lastMove = 0;
   int[][] board;


   public ClassicBoard()
   {
      board = new int[3][3];
   }



 /**
  * Creates a move in the board where player owns square square (1-9).
  *
  * @param player - the player whose turn it is currently (int)
  * @param square - the square with the move to return (int)
  * @return true - the player move is in the square (boolean)
  * @return false - the player's move is invalid (boolean)
  */
   public boolean makeMove(int player, int square)
   {
      int x = square / 3;
      int y = 0;
      if (square <= 3)
      {
         x = square - 1;
         y = 0;
      }
      else if (square > 3 && square <= 6)
      {
         x =  square - 4;
         y = 1;
      }
      else if (square > 6)
      {
         x = square - 7;
         y = 2;
      }
      if (board[y][x] == 0)
      {
         board[y][x] = player;
         numberOfMovesPlayed++;
         lastMove = square;
         return true;
      }
      return false;
   }

 /**
  * Returns the last move made's square (1-9).
  *
  * @return lastMove - the square with the last move (int)
  */
   public int getLastMove()
   {
      return lastMove;
   }

 /**
  * Returns a string representation of the board.
  *
  * @return output - the String representation of the board (String)
  */

///********************
 //I need this
 //used for computer moves



   public String toString()
   {
      String output = "";
      output += (Arrays.toString(board[0])) + "\n";
      output += (Arrays.toString(board[1])) + "\n";
      output += (Arrays.toString(board[2])) + "\n";

      return output;
   }

 /**
  * Prints the board to System.out and adds a new line character at the end.
  */
   public void printBoard()
   {
      System.out.println(toString());
   }
}
