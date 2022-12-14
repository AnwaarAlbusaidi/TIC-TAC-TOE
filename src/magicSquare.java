import java.util.Scanner;

public class magicSquare {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
       Scanner scan = new Scanner (System.in);
        int userinput;
        final int row,coulm;
        System.out.println("Enter the Magic Square size ");
        userinput = scan.nextInt();
        int[][] magic = new int[userinput][userinput];
        
        System.out.println("The Magic Square for order " + userinput + ",");
        System.out.println("Magic constant: " + userinput * (userinput * userinput + 1) / 2);
        System.out.println("Matrix: ");
        
        

	}

}
