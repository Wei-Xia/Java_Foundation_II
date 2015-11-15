/**
	ComputerPlayer is the AI client for computer, user can play with this
		"smart" computer.
*/

class ComputerPlayer
{
	public static int [] makeMove(int theBoard [] [], int turn)
	{
		int square = 5;
		int choice [] = new int [2];

		if(turn==1) // first move is to get 5
		{
			square = 5;
			choice = squareConvert(square);
			return choice;
			}

		choice = randomMove(theBoard); // make a random move.
		return choice;
		}



	public static int [] randomMove(int theBoard [] [] )
	{
		int choice [] = new int [2];
		int randomRow;
		int randomCol;

		while(true)
		{
			randomRow = (int) (Math.random()*3 );
			randomCol = (int) (Math.random()*3 );
			if(theBoard [randomRow] [randomCol] == 0) break;
		}
		choice [0] = randomRow;
		choice [1] = randomCol;

		return choice;
	}

	/*
	 * squareConvert takes in a square (1-9) and converts it to a row and column
	 * Recieve: square, and int (1-9)
	 * Returns: choice [], a 2D array with the row and column of the choice
	 *
	 */
	public static int [] squareConvert(int square)
	{
		int choice [] = new int [2];

		if(square == 1) {choice [0] = 0; choice[1] = 0;}
		else if(square == 2) {choice [0] = 0; choice[1] = 1;}
		else if(square == 3) {choice [0] = 0; choice[1] = 2;}
		else if(square == 4) {choice [0] = 1; choice[1] = 0;}
		else if(square == 5) {choice [0] = 1; choice[1] = 1;}
		else if(square == 6) {choice [0] = 1; choice[1] = 2;}
		else if(square == 7) {choice [0] = 2; choice[1] = 0;}
		else if(square == 8) {choice [0] = 2; choice[1] = 1;}
		else if(square == 9) {choice [0] = 2; choice[1] = 2;}

		return choice;
	}
}
