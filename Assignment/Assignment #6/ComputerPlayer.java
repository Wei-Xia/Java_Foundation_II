/**
	ComputerPlayer is the AI client for computer, 
	user can play with this "smart" computer.
*/

class ComputerPlayer
{
	public static int [] makeMove(int board [] [], int turn)
	{
		int square = 5;
		int move [] = new int [2];

		if(turn==1) // first move is to get 5
		{
			square = 5;
			move = Convert(square);
			return move;
		}

		move = randomMove(board); // make a random move.
		return move;
	}

	public static int [] randomMove(int board [] [] )
	{
		int move [] = new int [2];
		int randomRow;
		int randomCol;

		while(true)
		{
			randomRow = (int) (Math.random()*3 );
			randomCol = (int) (Math.random()*3 );
			if(board [randomRow] [randomCol] == 0) 
				break;
		}
		move [0] = randomRow;
		move [1] = randomCol;

		return move;
	}

// 	Convert will convert square (1-9) into a row and column
	public static int [] Convert(int square)
	{
		int move [] = new int [2];

			 if(square == 1) {move [0] = 0; move[1] = 0;}
		else if(square == 2) {move [0] = 0; move[1] = 1;}
		else if(square == 3) {move [0] = 0; move[1] = 2;}
		else if(square == 4) {move [0] = 1; move[1] = 0;}
		else if(square == 5) {move [0] = 1; move[1] = 1;}
		else if(square == 6) {move [0] = 1; move[1] = 2;}
		else if(square == 7) {move [0] = 2; move[1] = 0;}
		else if(square == 8) {move [0] = 2; move[1] = 1;}
		else if(square == 9) {move [0] = 2; move[1] = 2;}

		return move;
	}
}
