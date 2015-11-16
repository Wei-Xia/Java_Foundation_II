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

		int players =1;
		String input = "";
		boolean badInput = false;

		do // get the number of players -- only accept 1 or 2
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
			else badInput = true;

			if(badInput) System.out.print("Enter a number, 1 or 2: ");
		}
		while(badInput);


		System.out.println("TicTacToe Game starts."+ 
						   " Please enter 1-9 to make your choice.");

		int [] move = new int [2];
		char winner;
		int getTurn = 1;		  // The initialization of turns

		System.out.println(Game); // print the board for first time

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
						if(!Game.elementMarked(move[0], move[1])) break; 
						System.out.println("That space is occupied.");
					}

				}

				else // Or computer player
					move = ComputerPlayer.makeMove(Game.copyBoard(), getTurn);


				Game.markFirst(move[0], move[1]); // mark an X on the board

				winner = Game.win(); // Check if win

				if(winner != 'N')
					break;
				System.out.println(Game);

				getTurn++;    //return turn to the other player
			}

			// Player O's turn
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

			winner = Game.win();	// Check if win

			if(winner != 'N')
				break;
			System.out.println(Game);

			getTurn++;    //return turn to the other player
		}

		System.out.println(Game);

		if(winner == 'C')
			System.out.println("This is a cat's game.");

		if(winner != 'C')
			System.out.println("The winner is: " + winner);

	}

	// getMove gets the users choice and translates it into rows and columns
	public static int[] getMove()
	{
		new InputStreamReader(System.in);
		BufferedReader theKeyboard = new BufferedReader(new InputStreamReader(System.in));

		String input = "";
		int [] move = new int[2];
		boolean errorInput = false;
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
				 if(input.equals("1")) {move [0] = 0; move[1] = 0; errorInput = false;}
			else if(input.equals("2")) {move [0] = 0; move[1] = 1; errorInput = false;}
			else if(input.equals("3")) {move [0] = 0; move[1] = 2; errorInput = false;}
			else if(input.equals("4")) {move [0] = 1; move[1] = 0; errorInput = false;}
			else if(input.equals("5")) {move [0] = 1; move[1] = 1; errorInput = false;}
			else if(input.equals("6")) {move [0] = 1; move[1] = 2; errorInput = false;}
			else if(input.equals("7")) {move [0] = 2; move[1] = 0; errorInput = false;}
			else if(input.equals("8")) {move [0] = 2; move[1] = 1; errorInput = false;}
			else if(input.equals("9")) {move [0] = 2; move[1] = 2; errorInput = false;}
			else errorInput = true;

			if(errorInput)
				System.out.print("Error input. Enter a number within 1-9: ");
		}
		while(errorInput);

		return move;
	}
}
	
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
			int accumulation =   myBoard [0] [column] 
							   * myBoard [1] [column] 
							   * myBoard [2] [column];
							   
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

		if(winner != 'N') 
			return winner;

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
