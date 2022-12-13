
import java.util.Scanner;

/**
 * 
 */

/**
 * @This class implemented to play Tic-Tac-Toe written by : Anwaar Al-Busaidi
 */
public class xoGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaration of variables
		Scanner scan = new Scanner(System.in);
		char[][] grid = { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', '9' } };
		int i, j; // variables to be used in loops
		boolean playgame = true;
		int playerChoice;
		boolean Player1 = true;
		int rowIndex;
		int columIndex;

		while (playgame == true) {
			print(grid);
			if (Player1) // check if it is player 1 turn
			{
				System.out.println("Player 1, Make a move(symbol : x), Enter postion: ");
				playerChoice = scan.nextInt();
				if (playerChoice <= 3) {
					rowIndex = 0;  //if input is 1 or 2 or 3 that mean we are in row 0
					columIndex = playerChoice - 1;
					if (grid[rowIndex][columIndex] == 'x' || grid[rowIndex][columIndex] == 'o') {
						System.out.println("Someone has already made a move at this position! Try again.");
						Player1 = true;
					} else {
						grid[rowIndex][columIndex] = 'x';
						if (winner(grid) == 'x') {
							System.out.println("Player 1 is the winner");
							playgame = false;
						} else if (winner(grid) == 'o') {
							System.out.println("Player 2 is the winner");
							playgame = false;
						}
					}

				} else if (playerChoice <= 6) {
					rowIndex = 1;   //if input is 4 or 5 or 6 that mean we are in row 1
					columIndex = playerChoice - 4;
					if (grid[rowIndex][columIndex] == 'x' || grid[rowIndex][columIndex] == 'o') {
						System.out.println("Someone has already made a move at this position! Try again.");
						Player1 = true;
					} else {
						grid[rowIndex][columIndex] = 'x';
						if (winner(grid) == 'x') {
							System.out.println("Player 1 is the winner");
							playgame = false;
						} else if (winner(grid) == 'o') {
							System.out.println("Player 2 is the winner");
							playgame = false;
						}
					}
				} else if (playerChoice <= 9) {
					rowIndex = 2;  //if input is 7 or 8 or 9 that mean we are in row 2
					columIndex = playerChoice - 7;
					if (grid[rowIndex][columIndex] == 'x' || grid[rowIndex][columIndex] == 'o') {
						System.out.println("Someone has already made a move at this position! Try again.");
						Player1 = true;
					} else {
						grid[rowIndex][columIndex] = 'x';
						if (winner(grid) == 'x') {
							System.out.println("Player 1 is the winner");
							playgame = false;
						} else if (winner(grid) == 'o') {
							System.out.println("Player 2 is the winner");
							playgame = false;
						}
					}
				}

				System.out.println();
				Player1 = false;

			} // End of if (player1)

			else // it is player 2 turn
			{
				System.out.println("Player 2, Make a move(symbol : 0), Enter postion: ");
				playerChoice = scan.nextInt();
				if (playerChoice <= 3) {
					rowIndex = 0;  //if input is 1 or 2 or 3 that mean we are in row 0
					columIndex = playerChoice - 1;
					if (grid[rowIndex][columIndex] == 'x' || grid[rowIndex][columIndex] == 'o') {
						System.out.println("Someone has already made a move at this position! Try again.");
						Player1 = false;
					} else {
						grid[rowIndex][columIndex] = 'o';
						if (winner(grid) == 'x') {
							System.out.println("Player 1 is the winner");
							playgame = false;
						} else if (winner(grid) == 'o') {
							System.out.println("Player 2 is the winner");
							playgame = false;
						} else
							Player1 = true;
					}

				} else if (playerChoice <= 6) {
					rowIndex = 1;    //if input is 4 or 5 or 6 that mean we are in row 1
					columIndex = playerChoice - 4;
					if (grid[rowIndex][columIndex] == 'x' || grid[rowIndex][columIndex] == 'o') {
						System.out.println("Someone has already made a move at this position! Try again.");
						Player1 = false;
					} else {
						grid[rowIndex][columIndex] = 'o';
						if (winner(grid) == 'x') {
							System.out.println("Player 1 is the winner");
							playgame = false;
						} else if (winner(grid) == 'o') {
							System.out.println("Player 2 is the winner");
							playgame = false;
						} else
							Player1 = true;
					}
				} else if (playerChoice <= 9) {
					rowIndex = 2;    //if input is 7 or 8 or 9 that mean we are in row 2
					columIndex = playerChoice - 7;
					if (grid[rowIndex][columIndex] == 'x' || grid[rowIndex][columIndex] == 'o') {
						System.out.println("Someone has already made a move at this position! Try again.");
						Player1 = false;
					} else {
						grid[rowIndex][columIndex] = 'o';
						if (winner(grid) == 'x') {
							System.out.println("Player 1 is the winner");
							playgame = false;
						} else if (winner(grid) == 'o') {
							System.out.println("Player 2 is the winner");
							playgame = false;
						} else
							Player1 = true;
					}
				}
			} // End of else
		} // End of while
	}// End of Main class

	// print function to print the grid game
	public static void print(char[][] g) {
		for (int i = 0; i < g.length; i++) {
			for (int j = 0; j < g.length; j++) {
				System.out.print(g[i][j]);
				System.out.print(" " + "| ");
			}
			System.out.println();
			System.out.println("-----------");
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

}// End of xoGame class
