import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @This class implemented to play Tic-Tac-Toe written by : Anwaar Al-Busaidi
 */
public class xoGame {

	public static boolean playGame = true;

	public static void main(String[] args) throws IOException {
		// Declaration of variables
		Scanner scan = new Scanner(System.in);
		char[][] grid = { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', '9' } };
		// boolean playGame = true;
		int playerChoice;
		boolean Player1 = true;
		int rowIndex;
		int columIndex;
		int count = 1;
		// start the game
		System.out.println(" press 1 for new game and 2 for resum the game: ");
		int userinput = Integer.parseInt(scan.nextLine());
		while (playGame == true) {
			// start new game
			if (userinput == 1) {
				ReadFromFile(grid);
				print(grid);
				writeToFile(grid);
				if (count <= 9) {
					if (Player1) // check if it is player 1 turn
					{
						System.out.println("Player 1, Make a move(symbol : x), Enter postion or 0 to exit: ");
						playerChoice = scan.nextInt();
						if (playerChoice <= 3 && playerChoice != 0) {
							rowIndex = 0; // if input is 1 or 2 or 3 that mean we are in row 0
							columIndex = playerChoice - 1;
							if (check(grid[rowIndex][columIndex]) == true)// check if Someone already made a move at
																			// this position!
								Player1 = true;
							else {
								grid[rowIndex][columIndex] = 'x';
								howIsTheWinner(grid);
								writeToFile(grid);
							}
						} else if (playerChoice <= 6 && playerChoice != 0) {
							rowIndex = 1; // if input is 4 or 5 or 6 that mean we are in row 1
							columIndex = playerChoice - 4;
							if (check(grid[rowIndex][columIndex]) == true)// check if Someone already made a move at
																			// this
																			// position!
								Player1 = true;
							else {
								grid[rowIndex][columIndex] = 'x';
								howIsTheWinner(grid);
								writeToFile(grid);
							}
						} else if (playerChoice <= 9 && playerChoice != 0) {
							rowIndex = 2; // if input is 7 or 8 or 9 that mean we are in row 2
							columIndex = playerChoice - 7;
							if (check(grid[rowIndex][columIndex]) == true)// check if Someone already made a move at
																			// this
																			// position!
								Player1 = true;

							else {
								grid[rowIndex][columIndex] = 'x';
								howIsTheWinner(grid);
								writeToFile(grid);
							}
						} else if (playerChoice == 0) {
							System.out.println("you exit the game");
							writeToFile(grid);
							playGame = false;
						}
						System.out.println();
						Player1 = false;
					} // End of if (player1)

					else // it is player 2 turn
					{
						System.out.println("Player 2, Make a move(symbol : o), Enter postion or 0 to exit: ");
						playerChoice = scan.nextInt();
						if (playerChoice <= 3 && playerChoice != 0) {
							rowIndex = 0; // if input is 1 or 2 or 3 that mean we are in row 0
							columIndex = playerChoice - 1;
							if (check(grid[rowIndex][columIndex]) == true)// check if Someone already made a move at
																			// this
																			// position!
								Player1 = false;
							else {
								grid[rowIndex][columIndex] = 'o';
								howIsTheWinner(grid);
								writeToFile(grid);
								Player1 = true;
							}
						} else if (playerChoice <= 6 && playerChoice != 0) {
							rowIndex = 1; // if input is 4 or 5 or 6 that mean we are in row 1
							columIndex = playerChoice - 4;
							if (check(grid[rowIndex][columIndex]) == true)// check if Someone already made a move at
																			// this
																			// position!
								Player1 = false;
							else {
								grid[rowIndex][columIndex] = 'o';
								howIsTheWinner(grid);
								writeToFile(grid);
								Player1 = true;
							}
						} else if (playerChoice <= 9 && playerChoice != 0) {
							rowIndex = 2; // if input is 7 or 8 or 9 that mean we are in row 2
							columIndex = playerChoice - 7;
							if (check(grid[rowIndex][columIndex]) == true)// check if Someone already made a move at
																			// this
																			// position!
								Player1 = false;
							else {
								grid[rowIndex][columIndex] = 'o';
								howIsTheWinner(grid);
								writeToFile(grid);
								Player1 = true;
							}

						} else if (playerChoice == 0) {
							System.out.println("you exit the game");
							writeToFile(grid);
							playGame = false;
						}
					} // End of else
					count++;
				} // End of if count
				else {
					System.out.println("Board is Full and no WINNER");
					writeToFile(grid);
					playGame = false;
				}
			}
			// new game
			else if (userinput == 2) {
				print(grid);
				writeToFile(grid);
				if (count <= 9) {
					if (Player1) // check if it is player 1 turn
					{
						System.out.println("Player 1, Make a move(symbol : x), Enter postion or 0 to exit: ");
						playerChoice = scan.nextInt();
						if (playerChoice <= 3 && playerChoice != 0) {
							rowIndex = 0; // if input is 1 or 2 or 3 that mean we are in row 0
							columIndex = playerChoice - 1;
							if (check(grid[rowIndex][columIndex]) == true)// check if Someone already made a move at
																			// this position!
								Player1 = true;
							else {
								grid[rowIndex][columIndex] = 'x';
								howIsTheWinner(grid);
								writeToFile(grid);
							}
						}

						else if (playerChoice <= 6 && playerChoice != 0) {
							rowIndex = 1; // if input is 4 or 5 or 6 that mean we are in row 1
							columIndex = playerChoice - 4;
							if (check(grid[rowIndex][columIndex]) == true)// check if Someone already made a move at
																			// this
																			// position!
								Player1 = true;
							else {
								grid[rowIndex][columIndex] = 'x';
								howIsTheWinner(grid);
								writeToFile(grid);
							}
						} else if (playerChoice <= 9 && playerChoice != 0) {
							rowIndex = 2; // if input is 7 or 8 or 9 that mean we are in row 2
							columIndex = playerChoice - 7;
							if (check(grid[rowIndex][columIndex]) == true)// check if Someone already made a move at
																			// this
																			// position!
								Player1 = true;

							else {
								grid[rowIndex][columIndex] = 'x';
								howIsTheWinner(grid);
								writeToFile(grid);
							}
						} else if (playerChoice == 0) {
							System.out.println("you exit the game");
							writeToFile(grid);
							playGame = false;
						}
						System.out.println();
						Player1 = false;
					} // End of if (player1)

					else // it is player 2 turn
					{
						System.out.println("Player 2, Make a move(symbol : o), Enter postion or 0 to exit: ");
						playerChoice = scan.nextInt();
						if (playerChoice <= 3 && playerChoice != 0) {
							rowIndex = 0; // if input is 1 or 2 or 3 that mean we are in row 0
							columIndex = playerChoice - 1;
							if (check(grid[rowIndex][columIndex]) == true)// check if Someone already made a move at
																			// this
																			// position!
								Player1 = false;
							else {
								grid[rowIndex][columIndex] = 'o';
								howIsTheWinner(grid);
								writeToFile(grid);
								Player1 = true;
							}
						} else if (playerChoice <= 6 && playerChoice != 0) {
							rowIndex = 1; // if input is 4 or 5 or 6 that mean we are in row 1
							columIndex = playerChoice - 4;
							if (check(grid[rowIndex][columIndex]) == true)// check if Someone already made a move at
																			// this
																			// position!
								Player1 = false;
							else {
								grid[rowIndex][columIndex] = 'o';
								howIsTheWinner(grid);
								writeToFile(grid);
								Player1 = true;
							}
						} else if (playerChoice <= 9 && playerChoice != 0) {
							rowIndex = 2; // if input is 7 or 8 or 9 that mean we are in row 2
							columIndex = playerChoice - 7;
							if (check(grid[rowIndex][columIndex]) == true)// check if Someone already made a move at
																			// this
																			// position!
								Player1 = false;
							else {
								grid[rowIndex][columIndex] = 'o';
								howIsTheWinner(grid);
								writeToFile(grid);
								Player1 = true;
							}

						} else if (playerChoice == 0) {
							System.out.println("you exit the game");
							writeToFile(grid);
							playGame = false;
						}
					} // End of else
					count++;
				} // End of if count
				else {
					System.out.println("Board is Full and no WINNER");
					writeToFile(grid);
					playGame = false;
				}
			}
		} // End of while
		scan.close();
	}// End of Main class

	/**
	 * This method will print the grid game
	 * 
	 * @param g for grid(2D array)
	 */
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

	/**
	 * This method will check if their is a winner by check rows and columns and
	 * dislodge
	 * 
	 * @param g for grid(2D array)
	 * @return the player symbol for the winner return x if player 1 is the winner
	 *         return y if player 1 is the winner
	 */
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

	/**
	 * This method will check if the position choices by player one or two is empty
	 * or not
	 * 
	 * @param y
	 * @return true if Someone has already made a move at this position and False if
	 *         no one has made a move at this position
	 */
	public static boolean check(char y) {
		if (y == 'x' || y == 'o') {
			System.out.println("Someone has already made a move at this position! Try again.");
			return true;
		} else
			return false;
	}

	/**
	 * This method will check if their is any winner by calling the winner method
	 * 
	 * @param y for grid(2D array)
	 */
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

	/**
	 * This method will write data to a file
	 * 
	 * @param g for grid(2D array)
	 * @throws IOException
	 */
	public static void writeToFile(char[][] g) throws IOException {
		PrintWriter writer = new PrintWriter("grid.txt");
		for (int row = 0; row < g.length; row++) {
			for (int colum = 0; colum < g.length; colum++) {
				writer.write(g[row][colum]);
			}
			if (row < 2)
				writer.write("\n");
			else
				writer.write("\n");
		}
		writer.close();
	}// end of writeToFile Method

	/**
	 * This method will read data from file and store in the 2D array(grid of the
	 * game)
	 * 
	 * @param g for grid(2D array)
	 * @throws FileNotFoundException
	 */
	public static void ReadFromFile(char[][] g) throws FileNotFoundException {
		Scanner textFile;
		try {
			textFile = new Scanner(new File("grid.txt"));
			while (textFile.hasNextLine()) {
				for (int i = 0; i < g.length; i++) {
					String line = textFile.nextLine(); // read line by line and store it in array
					g[i] = line.toCharArray();
				}
			}
			textFile.close();
		} catch (FileNotFoundException e) {
			PrintWriter writer = new PrintWriter("grid.txt");
		}
	}// end of ReadFromFile Method
}// End of xoGame class
