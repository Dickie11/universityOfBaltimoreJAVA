
import java.util.Scanner;

public class COSC251_Week_10_WarmUp_T_Tac_Toe {
	
	private static Scanner userInput = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] gameBoard = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};
		
		
	/* *
	 *  The gameBoard array represents the possible choices for a tic tac toe game.
	 *  
	 *  Create the DrawBoard method which prints out these choices
	 *
	 *  It should look something like this
	 
	 	 1 | 2 | 3 
	 	--- --- ---
	 	 4 | 5 | 6 
	 	--- --- ---
	 	 7 | 8 | 9 
	 *  
	 */
		
		System.out.println("Welcome to tic tac toe!");
		System.out.println("Now we are ready to play!\n\n");
		
		
		DrawBoard(gameBoard);
			
		
		

		userInput.close();
	//END MAIN
	}
	public static void DrawBoard(String[] theBoard){
		System.out.printf(" %s | %s | %s %n", theBoard[0], theBoard[1], theBoard[2]);
		System.out.println("--- --- ---");
		System.out.printf(" %s | %s | %s %n", theBoard[3], theBoard[4], theBoard[5]);
		System.out.println("--- --- ---");
		System.out.printf(" %s | %s | %s %n", theBoard[6], theBoard[7], theBoard[8]);
	}
	
	
	
//End Class	
}
