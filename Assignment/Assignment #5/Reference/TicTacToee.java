import java.io.*;

public class TicTacToee {

	public static void main(String[] args)
	{
		new InputStreamReader(System.in);
		BufferedReader theKeyboard = new BufferedReader(new InputStreamReader(System.in));

		Board aBoard = new Board();

		System.out.println("TicTacToe Game starts. Please enter 1-9 to make your choice.");

		System.out.println(aBoard); // print the board

		int [] move = new int [2];
		char winner;
		int getTurn = 1;

		while(true) // loop only breaks when X or O wins, or a cat's game
		{
			if( (getTurn == 1 ) || getTurn > 1) // skips X's getTurn if X losses coin toss
			{
					System.out.print("Player X, where will you make your mark?");
					while(true)
					{
						move = getMove();
						if(!aBoard.elementMarked(move[0], move[1])) break; // can't take occupied space
						System.out.println("That space is occupied.");
					}


				aBoard.markX(move[0], move[1]); // mark an 'X' (20) on the board

				winner = aBoard.Win(); // Check for a win
				if(winner != 'N') break;

				System.out.println(aBoard);

				getTurn++;
			}

			// Player O's getTurn
			System.out.print("Player O, where will you make your mark? ");

			while(true)
			{
				move = getMove();
				if(!aBoard.elementMarked(move[0], move[1])) break;
				System.out.println("That space is occupied.");
			}

			aBoard.markO(move[0], move[1]);

			winner = aBoard.Win();
			if( winner != 'N') break;

			System.out.println(aBoard);
			getTurn++;
		}

		System.out.println(aBoard);
		if(winner == 'C') System.out.println("Cat's game.");

		if(winner != 'C') System.out.println("The winner is: " + winner);

	}

	/*
	 * choice reads the users choice and translates it to rows and columns
	 * RegetTurns: choice [], a 1D int array with the [0]row and [1]column of the choice
	 * Won't accept a choice other than 1-9
	 *
	 */
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

			if(errorInput) System.out.print("Enter a number, 1-9: ");
		}
		while(errorInput);

		return move;
	}
}
