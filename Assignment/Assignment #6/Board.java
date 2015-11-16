/**
Board can represents 2D 3*3 array for TicTacToe game.
It can check if someone wins or a cat's game.
It can check if a square has been chosen.
It can also mark an X or O from the player's choice.
*/

class Board
{
	private int [][] myBoard = new int [3][3];

// 	Create a 3 by 3 array and use for a tic tac toe board.
	public Board()
	{
		for(int row = 0; row < 3; row++)
		{
			for(int column = 0; column < 3; column++)
			{
				myBoard [row] [column] = 0;
			}
		}
	}

	public int [] [] copyBoard()
	{
		return myBoard;
	}

	/*
	markFirst makes places a 2 accumulation for X
	*/
	public void markFirst(int row, int column)
	{
		myBoard [row] [column] = 2;
	}

	/*
	markSecond makes places a 1 accumulation for O
	*/
	public void markSecond(int row, int column)
	{
		myBoard [row] [column] = 1;
	}

	/*
	elementMarked returns a true if the space has been taken
	*/
	public boolean elementMarked(int row, int column)
	{
		if(myBoard [row] [column] == 0) return false;
		else return true;
	}

	/*
	Win constructor checks if someone wins.
	Here are the meanings of each return type
	'N' means no winner;
	'X' means X won;
	'O' means O won;
	'C' means a C's game.
	*/
public char win()
	{
		char winner = 'N';
		int catCheck = 1;

		// Check the columns
		for(int column = 0; column < 3; column++)
		{
			int accumulation = myBoard [0] [column] * myBoard [1] [column] * myBoard [2] [column];
			if(accumulation == 8) // 2*2*2 = 8, a win for X
			{
				winner = 'X';
				break;
			}
			if(accumulation == 1) // 1*1*1 = 1, a win for O
			{
				winner = 'O';
				break;
			}
		}

		if(winner != 'N') return winner;

		// Check the rows
		for(int row = 0; row < 3; row++)
		{
			int accumulation = myBoard [row] [0] * myBoard [row] [1] * myBoard [row] [2];
			if(accumulation == 8)
			{
				winner = 'X';
				break;
			}
			if(accumulation == 1)
			{
				winner = 'O';
				break;
			}
		}

		if(winner != 'N') return winner;

		// Check one diagonal
		int accumulation = myBoard [0] [0] * myBoard [1] [1] * myBoard [2] [2];
		if(accumulation == 1) winner = 'O';
		if(accumulation == 8) winner = 'X';

		// Check the other diagonal
		accumulation = myBoard [0] [2] * myBoard [1] [1] * myBoard [2] [0];
		if(accumulation == 1) winner = 'O';
		if(accumulation == 8) winner = 'X';

		// If nobody's won, Check for a cat's game
		if(winner == 'N')
		{
			for(int row = 0; row < 3; row++)
			{
				for(int column = 0; column < 3; column++)
				{
					catCheck *= myBoard [row] [column];
				}
			}
			// any empty space is a zero. So product is zero if there is space left.
			if(catCheck != 0) winner = 'C';
		}

		return winner;
	}

	/*
	toString enables printing out of the board
	*/
	public String toString()
	{
		String printBoard = "";
		char XorO;
		int position = 49;   // In ASCII, 49 stands for number 1

		for(int row = 0; row < 3; row++)
		{
			for(int column = 0; column < 3; column++)
			{
				if(myBoard[row] [column] == 1)
					// In ASCII, 79 stands for an O  (78+1)
					XorO = (char) (myBoard [row] [column] + 78);
				else
					if(myBoard[row] [column] == 2)
						// In ASCII, 88 stands for an X  (86+2)
						XorO = (char) (myBoard [row] [column] + 86);
					else
						XorO = (char) (position);

					position++;

				printBoard = printBoard + XorO + " ";
			}
			printBoard = printBoard + "\n" ; // starts a new line at the end of a row
		}
		return printBoard;
	}
}
