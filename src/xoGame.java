import java.security.PublicKey;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author LAP-8
 *
 */
public class xoGame {
	/**
	 * @
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//Declaration of variables
		Scanner scan = new Scanner(System.in);
		 char [][] grid = {{'1','2','3'},
		                   {'4','5','6'},
		                   {'7','8','9'}};
		int i,j;
		boolean Playgame = true;
		char playerChoice;
		boolean Player1= true;
		print(grid);
		while(Playgame = true)
		{
			
			if(Player1)
			{
				System.out.println("Player 1, Make a move(symbol : x), Enter postion: ");
				playerChoice = scan.next().charAt(0);
				for ( i = 0 ; i< grid.length ; i++)
				{
					for (j= 0 ; j< grid.length ; j++)
						{
							if(playerChoice == grid[i][j])
								{
									grid[i][j]= 'x';
									print(grid);
								}//End of if statement
						}
				}
				System.out.println();
				Player1= false;
			}
				else 
				{
					System.out.println("Player 2, Make a move(symbol : 0), Enter postion: ");
					playerChoice = scan.next().charAt(0);
					for ( i = 0 ; i< grid.length ; i++)
					{
						for (j= 0 ; j< grid.length ; j++)
							{
								if(playerChoice == grid[i][j])
									{
										grid[i][j]= 'o';
										print(grid);
									}//End of if statement
							}
					}
					Player1= true;
				}
			} // End of while
	}//End of Main class
	
	//print function to print the grid game
	public static void print(char[][] g)
	{
		for ( int i = 0 ; i< g.length ; i++)
		{
			for ( int j= 0 ; j< g[i].length ; j++)
			{
				System.out.print(g[i][j]);
			    System.out.print(" " + "| ");
			} 
			System.out.println();
			System.out.println("-----------");
		}
	
	}//end of print function
	
	public static char woner(char[][] g)
	{
		for(int i= 0;i<3;i++) //to check the row
		{
			if((g[i][0] == g[i][1] && g[i][1] == g[i][2]) = 'x')
			 return 'x';
			else if((g[i][0] == g[i][1] && g[i][1] == g[i][2]) = 'o')
			 return '0';
		}
		for(int i= 0;i<3;i++) //to check the column
		{
			if((g[0][i] == g[1][i] && g[1][i] == g[2][i]) = 'x')
			 return 'x';
			else if((g[0][i] == g[1][i] && g[1][i] == g[2][i]) = 'o')
			 return '0';
		}
		
	
			
			
	}
}//End of xoGame class
