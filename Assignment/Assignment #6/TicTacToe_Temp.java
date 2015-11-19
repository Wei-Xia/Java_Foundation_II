import java.io.*;

class TicTacToe_Temp
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
				{
					move = ComputerPlayer.makeMove(Game.copyBoard(), getTurn);
				}

				Game.markFirst(move[0], move[1]); // mark an X on the board

				winner = Game.win(); // Check if win

				if(winner != 'N')
					break;
				System.out.println(Game);

				getTurn++;    //return turn to the other player
			}

			for (int i=1; i<10; i++)
			{
				move = i;
				move = getMove();
				winner = Game.win();	// Check if win
				if( winner != 'N')
					break;
				System.out.println(Game);
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
