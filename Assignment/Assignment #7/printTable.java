public class printTable
{
  public static void main(String[] args)
  {
    Board Game = new Board();
    System.out.println(Game);

  }

  class Board{
    Board()
      {
        for(int row = 0; row < 3; row++)
        for(int column = 0; column < 3; column++)
          myBoard [row] [column] = 0;
      }
  }
}
