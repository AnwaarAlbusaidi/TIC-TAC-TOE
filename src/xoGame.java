import java.util.Scanner;

/**
 * @This class implemented to play Tic-Tac-Toe written by : Anwaar Al-Busaidi
 */
public class xoGame {

	public static boolean playGame = true;

	public static void main(String[] args) {
		// Declaration of variables
		Scanner scan = new Scanner(System.in);
		char[][] grid = { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', '9' } };
		// boolean playGame = true;
		int playerChoice;
		boolean Player1 = true;
		int rowIndex;
		int columIndex;
		int count = 1;
		while (playGame == true) {
			print(grid);
			if (count <= 9) {
				if (Player1) // check if it is player 1 turn
				{
					System.out.println("Player 1, Make a move(symbol : x), Enter postion: ");
					playerChoice = scan.nextInt();
					if (playerChoice <= 3) {
						rowIndex = 0; // if input is 1 or 2 or 3 that mean we are in row 0
						columIndex = playerChoice - 1;
						if (check(grid[rowIndex][columIndex]) == true)// check if Someone already made a move at this
																		// position!
							Player1 = true;
						else {
							grid[rowIndex][columIndex] = 'x';
							howIsTheWinner(grid);
						}
					}

					else if (playerChoice <= 6) {
						rowIndex = 1; // if input is 4 or 5 or 6 that mean we are in row 1
						columIndex = playerChoice - 4;
						if (check(grid[rowIndex][columIndex]) == true)// check if Someone already made a move at this
																		// position!
							Player1 = true;
						else {
							grid[rowIndex][columIndex] = 'x';
							howIsTheWinner(grid);
						}
					} else if (playerChoice <= 9) {
						rowIndex = 2; // if input is 7 or 8 or 9 that mean we are in row 2
						columIndex = playerChoice - 7;
						if (check(grid[rowIndex][columIndex]) == true)// check if Someone already made a move at this
																		// position!
							Player1 = true;
						else {
							grid[rowIndex][columIndex] = 'x';
							howIsTheWinner(grid);
						}
					}
					System.out.println();
					Player1 = false;

				} // End of if (player1)

				else // it is player 2 turn
				{
					System.out.println("Player 2, Make a move(symbol : o), Enter postion: ");
					playerChoice = scan.nextInt();
					if (playerChoice <= 3) {
						rowIndex = 0; // if input is 1 or 2 or 3 that mean we are in row 0
						columIndex = playerChoice - 1;
						if (check(grid[rowIndex][columIndex]) == true)// check if Someone already made a move at this
																		// position!
							Player1 = false;
						else {
							grid[rowIndex][columIndex] = 'o';
							howIsTheWinner(grid);
							Player1 = true;
						}
					} else if (playerChoice <= 6) {
						rowIndex = 1; // if input is 4 or 5 or 6 that mean we are in row 1
						columIndex = playerChoice - 4;
						if (check(grid[rowIndex][columIndex]) == true)// check if Someone already made a move at this
																		// position!
							Player1 = false;
						else {
							grid[rowIndex][columIndex] = 'o';
							howIsTheWinner(grid);
							Player1 = true;
						}
					} else if (playerChoice <= 9) {
						rowIndex = 2; // if input is 7 or 8 or 9 that mean we are in row 2
						columIndex = playerChoice - 7;
						if (check(grid[rowIndex][columIndex]) == true)// check if Someone already made a move at this
																		// position!
							Player1 = false;
						else {
							grid[rowIndex][columIndex] = 'o';
							howIsTheWinner(grid);
							Player1 = true;
						}

					}
				} // End of else
				count++;
			} // End of if count
			else {
				System.out.println("Board is Full");
				playGame = false;
			}
		} // End of while
	}// End of Main class

	// print function to print the grid game
	public static void print(char[][] g) {
		for (int row = 0; row < g.length; row++) {
			for (int colum = 0; colum < g.length; colum++) {
				System.out.print(g[row][colum]);
				if (colum < 2)
					System.out.print(" " + "| ");
			}
			if (row < 2) {
				System.out.println();
				System.out.println("-----------");
			} else
				System.out.println();
		}

	}// end of print function

	public static char winner(char[][] g) {
		for (int i = 0; i < 3; i++) // to check the row
		{
			if (g[i][0] == g[i][1] && g[i][1] == g[i][2])
				return g[i][0];
		}
		for (int j = 0; j < 3; j++) // to check the column
		{
			if (g[0][j] == g[1][j] && g[1][j] == g[2][j])
				return g[0][j];
		}

		if (g[0][0] == g[1][1] && g[1][1] == g[2][2]) // check dislodge
			return g[0][0];

		if (g[0][2] == g[1][1] && g[1][1] == g[2][0]) // check dislodge
			return g[1][1];

		return 'D';
	}// end for winner method

	public static boolean check(char y) {
		if (y == 'x' || y == 'o') {
			System.out.println("Someone has already made a move at this position! Try again.");
			return true;
		} else
			return false;
	}

	public static void howIsTheWinner(char[][] y) {
		for (int row = 0; row < y.length; row++) {
			for (int colum = 0; colum < y.length && playGame == true; colum++) {
				if (winner(y) == 'x') {
					playGame = false;
					System.out.println("Player 1 is the winner");
				} else if (winner(y) == 'o') {
					playGame = false;
					System.out.println("Player 2 is the winner");
				}
			}
		}
	}// end of howIsTheWinner method

}// End of xoGame class
