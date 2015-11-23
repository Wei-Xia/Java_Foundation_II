import java.io.*;

class TicTacToe
{
	public static void main(String[] args)
	{
		new InputStreamReader(System.in);
		BufferedReader theKeyboard = new BufferedReader(new InputStreamReader(System.in));

		Board Game = new Board();

		System.out.print("Enter 1 to play with computer;" +
						 "\nEnter 2 to play with other people.\nPlease enter 1-2: " );

		final int BOARD_SIZE = 4;			// Tic-Tac-Toe board is BOARD_SIZE*BOARD_SIZE
		final int DOUBLE_SIZE = BOARD_SIZE * BOARD_SIZE;		// The square of the size, in order to count the total number of cells/squares

		int players =1;				// The identifier for how many players
		String input = "";
		boolean badInput = false;			// Boolean in case user enters the other numbers not 1 or 2

		do 							// get the number of players -- only accept 1 or 2
		{
			try
			{
				input = theKeyboard.readLine();
			}
			catch(IOException e)
			{
				System.out.println("input error:" + e);
				System.exit(1);
			}
			if(input.equals("1"))
			{
				badInput = false;
				players = 1;
			}
			else if(input.equals("2"))
			{
				badInput = false;
				players = 2;
			}
			else
				badInput = true;

			if(badInput)
				System.out.print("Enter a number, 1 or 2: ");
		}
		while(badInput);


		System.out.println("TicTacToe Game starts."+
						   " Please enter 1-9 to make your choice.");

		int [] move = new int [2];		// Turn one move into two dimensions
		char winner;						// The identifier for winner
		int getTurn = 1;		 						 // The initialization of turns

		while(true) 			  // loop only breaks when X or O wins, or a cat's game
		{
			// Player X's turn
			if(getTurn%2 != 0)
			{
				if (players == 2)
				{
					System.out.print("Player X, Enter 1-9 to make choice: ");
					while(true)
					{
						move = getMove();
						// can't take occupied space
						if(!Game.elementMarked(move[0], move[1]))
							break;
						System.out.println("That space is occupied.");
					}
				}

				else											 // Or computer player
					move = ComputerPlayer.makeMove(Game.copyBoard(), getTurn);

				Game.markFirst(move[0], move[1]); 				// mark an X on the board

				winner = Game.win(); 									// Check if win

				if(winner != 'N')
					break;
				System.out.println(Game);

				getTurn++;    							//return turn to the other player
			}

			// Player O's turn
      char[] canWin=Game.canWin();
      if(canWin[0]=='X') //If X could win with his next move
      	System.out.println("Be careful! Player X can win " +
								"if he/she plays in square " +(int)Game.canWin()[1]+ "!");
        System.out.print("Player O, Enter 1-9 to make choice: ");

			while(true)
			{
				move = getMove();
				if(!Game.elementMarked(move[0], move[1]))
					break;
				System.out.println("This square has been chosen." +
								   " Please enter a new square.");
			}

			Game.markSecond(move[0], move[1]);

			winner = Game.win();										// Check if win

			if(winner != 'N')
				break;
			System.out.println(Game);

			getTurn++;    								//return turn to the other player
		}

		System.out.println(Game);

		if(winner == 'C')
			System.out.println("This is a cat's game.");

		else
			System.out.println("The winner is: " + winner);

	}

	// getMove gets the users choice and translates it into rows and columns
	static int[] getMove()
	{
		new InputStreamReader(System.in);
		BufferedReader theKeyboard = new BufferedReader(new InputStreamReader(System.in));

		String input = "";
		int [] move = new int[2];
		boolean errorInput = false;

		final int BOARD_SIZE = 4;			// Tic-Tac-Toe board is BOARD_SIZE*BOARD_SIZE
		final int DOUBLE_SIZE = BOARD_SIZE * BOARD_SIZE;

		do
		{
			try
			{
				input = theKeyboard.readLine();
			}
			catch(IOException e)
			{
				System.out.println("input error:" + e);
				System.exit(1);
			}

			errorInput = false;

				 if(input.equals("1")) {move [0] = 0; move[1] = 0;}
			else if(input.equals("2")) {move [0] = 0; move[1] = 1;}
			else if(input.equals("3")) {move [0] = 0; move[1] = 2;}
			else if(input.equals("4")) {move [0] = 0; move[1] = 3;}
			else if(input.equals("5")) {move [0] = 1; move[1] = 0;}
			else if(input.equals("6")) {move [0] = 1; move[1] = 1;}
			else if(input.equals("7")) {move [0] = 1; move[1] = 2;}
			else if(input.equals("8")) {move [0] = 1; move[1] = 3;}
			else if(input.equals("9")) {move [0] = 2; move[1] = 0;}
			else if(input.equals("10")) {move [0] = 2; move[1] = 1;}
			else if(input.equals("11")) {move [0] = 2; move[1] = 2;}
			else if(input.equals("12")) {move [0] = 2; move[1] = 3;}
			else if(input.equals("13")) {move [0] = 3; move[1] = 0;}
			else if(input.equals("14")) {move [0] = 3; move[1] = 1;}
			else if(input.equals("15")) {move [0] = 3; move[1] = 2;}
			else if(input.equals("16")) {move [0] = 3; move[1] = 3;}
			else errorInput = true;

			if(errorInput)
				System.out.print("Error input. Enter a number within 1-"+ DOUBLE_SIZE + ": ");
		}
		while(errorInput);

		return move;
	}
}

/**
Board can represents 2D 3*3 array for TicTacToe game.
It can check if someone wins or a cat's game.
It can check if a square has been chosen.
It can also mark an X or O from the player's choice.
*/

class Board
{

	final int BOARD_SIZE = 4;			// Tic-Tac-Toe board is BOARD_SIZE*BOARD_SIZE

	int [][] myBoard = new int [BOARD_SIZE][BOARD_SIZE];

	// 	Create a 3 by 3 array and use for a tic tac toe board.
	Board()
	{
		for(int row = 0; row < BOARD_SIZE; row++)
			for(int column = 0; column < BOARD_SIZE; column++)
				myBoard [row] [column] = 0;
	}

	int [] [] copyBoard()
	{
		return myBoard;
	}

	//markFirst makes places a 2 accumulation for X
	void markFirst(int row, int column)
	{
		myBoard [row] [column] = 2;
	}


	//markSecond makes places a 1 accumulation for O
	void markSecond(int row, int column)
	{
		myBoard [row] [column] = 1;
	}

	//elementMarked returns a true if the space has been taken
	boolean elementMarked(int row, int column)
	{
		if(myBoard [row] [column] == 0) return false;

		return true;
	}

	/*
	Win constructor checks if someone wins.
	Here are the meanings of each return type
	'N' means no winner;
	'X' means X won;
	'O' means O won;
	'C' means a C's game.
	*/
	char win()
	{
		char winner = 'N';
		int catCheck = 1;

		// Check the columns
		for(int column = 0; column < BOARD_SIZE; column++)
		{
			int accumulation =   myBoard [0] [column]
							   * myBoard [1] [column]
							   * myBoard [2] [column];

			if(accumulation == 8) 							// 2*2*2 = 8, a win for X
			{
				winner = 'X';
				break;
			}
			else if(accumulation == 1) 							// 1*1*1 = 1, a win for O
			{
				winner = 'O';
				break;
			}
		}

		if(winner != 'N')
			return winner;

		// Check the rows
		for(int row = 0; row < BOARD_SIZE; row++)
		{
			int accumulation = myBoard [row] [0] * myBoard [row] [1] * myBoard [row] [2];
			if(accumulation == 8)
			{
				winner = 'X';
				break;
			}
			else if(accumulation == 1)
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
			for(int row = 0; row < BOARD_SIZE; row++)
				for(int column = 0; column < BOARD_SIZE; column++)
					catCheck *= myBoard [row] [column];
			// any empty space is a zero. So product is zero if there is space left.
			if(catCheck != 0) winner = 'C';
		}

		return winner;
	}

	char [] canWin()
	{
    char winner = 'N';
    int catCheck = 1;
    char [] result=new char[2];

		final int BOARD_SIZE = 4;			// Tic-Tac-Toe board is BOARD_SIZE*BOARD_SIZE
		final int DOUBLE_SIZE = BOARD_SIZE * BOARD_SIZE;

		for(int i=1; i<(DOUBLE_SIZE+1); i++)
		{
			winner = 'N';
      //Places an X if a cell is not occupied
      if(!elementMarked(ComputerPlayer.Convert(i)[0],ComputerPlayer.Convert(i)[1]))
      	markFirst(ComputerPlayer.Convert(i)[0],ComputerPlayer.Convert(i)[1]);
      else //If cell is occupied, skip this iteration
        continue;

      // Check the columns
      for (int column = 0; column < BOARD_SIZE; column++)
			{
          int accumulation = myBoard[0][column] *
														 myBoard[1][column] * myBoard[2][column];

          if (accumulation == 8) // 2*2*2 = 8, a win for X
          {
              winner = 'X';
              break;
          }
          else if (accumulation == 1) // 1*1*1 = 1, a win for O
          {
              winner = 'O';
              break;
          }
    	}

			if (winner != 'N')
			{
				result[0] = winner; //assume the winner
      	result[1]=(char)i;  //assume this square that will win
				//undo all the behavior before
      	myBoard[ComputerPlayer.Convert(i)[0]][ComputerPlayer.Convert(i)[1]] = 0;
      	return result;
    	}

    	// Check the rows
    	for (int row = 0; row < BOARD_SIZE; row++)
			{
    		int accumulation = myBoard[row][0] * myBoard[row][1] * myBoard[row][2];

				if (accumulation == 8)
				{
      		winner = 'X';
        	break;
      	}
      	else if (accumulation == 1)
				{
        	winner = 'O';
        	break;
      	}
    	}

    	if (winner != 'N')
			{
    		result[0] = winner; //assume the winner
      	result[1]=(char)i;  //assume this square that will win
				//undo all the behavior before
      	myBoard[ComputerPlayer.Convert(i)[0]][ComputerPlayer.Convert(i)[1]] = 0;
      	return result;
    	}

    	// Check one diagonal
    	int accumulation = myBoard[0][0] * myBoard[1][1] * myBoard[2][2];
    	if (accumulation == 1)
    		winner = 'O';
    	else if (accumulation == 8)
			{
      	winner = 'X';
    		result[0] = winner; //assume the winner
      	result[1]=(char)i;  //assume this square that will win
				//undo all the behavior before
      	myBoard[ComputerPlayer.Convert(i)[0]][ComputerPlayer.Convert(i)[1]] = 0;
      	return result;
    	}

    	// Check the other diagonal
    	accumulation = myBoard[0][2] * myBoard[1][1] * myBoard[2][0];
    	if (accumulation == 1)
    		winner = 'O';
    	else if (accumulation == 8)
			{
      	winner = 'X';
      	result[0] = winner; //assume the winner
      	result[1]=(char)i;  //assume this square that will win
				//undo all the behavior before
      	myBoard[ComputerPlayer.Convert(i)[0]][ComputerPlayer.Convert(i)[1]] = 0;
      	return result;
    	}

    	// If nobody's won, Check for a cat's game
    	if (winner == 'N')
			{
    		for (int row = 0; row < 3; row++)
      		for (int column = 0; column < 3; column++)
        		catCheck *= myBoard[row][column];

      	if (catCheck != 0)
      		winner = 'C';
    	}

    	result[0] = winner; //assume the winner
    	result[1]=(char)i;  //assume this square that will win
			//undo all the behavior before
    	myBoard[ComputerPlayer.Convert(i)[0]][ComputerPlayer.Convert(i)[1]] = 0;
		}

    	return result;
}

	//toString enables printing out of the board
	public String toString()
	{
		String printBoard = "";
		char XorO;
		int position = 49;   						// In ASCII, 49 stands for number 1

		for(int row = 0; row < BOARD_SIZE; row++)
		{
			for(int column = 0; column < BOARD_SIZE; column++)
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
			printBoard = printBoard + "\n" ; 	// starts a new line at the end of a row
		}
		return printBoard;
	}
}


/**
	ComputerPlayer is the AI client for computer,
	user can play with this "smart" computer.
*/

class ComputerPlayer
{
	static int [] makeMove(int board [] [], int turn)
	{
		int square = 5;
		int move [] = new int [2];

		move = randomMove(board); 								// make a random move
		return move;
	}

	static int [] randomMove(int board [] [] )
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

	//Convert will convert square (1-9) into a row and column
	static int [] Convert(int square)
	{
		int move [] = new int [2];

				 if(square == 1) {move [0] = 0; move[1] = 0;}
 		else if(square == 2) {move [0] = 0; move[1] = 1;}
 		else if(square == 3) {move [0] = 0; move[1] = 2;}
 		else if(square == 4) {move [0] = 0; move[1] = 3;}
 		else if(square == 5) {move [0] = 1; move[1] = 0;}
 		else if(square == 6) {move [0] = 1; move[1] = 1;}
 		else if(square == 7) {move [0] = 1; move[1] = 2;}
 		else if(square == 8) {move [0] = 1; move[1] = 3;}
 		else if(square == 9) {move [0] = 2; move[1] = 0;}
 		else if(square == 10) {move [0] = 2; move[1] = 1;}
 		else if(square == 11) {move [0] = 2; move[1] = 2;}
 		else if(square == 12) {move [0] = 2; move[1] = 3;}
 		else if(square == 13) {move [0] = 3; move[1] = 0;}
 		else if(square == 14) {move [0] = 3; move[1] = 1;}
 		else if(square == 15) {move [0] = 3; move[1] = 2;}
 		else if(square == 16) {move [0] = 3; move[1] = 3;}

		return move;
	}
}
