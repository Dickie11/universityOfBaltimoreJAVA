import java.io.PrintStream;
import java.util.Scanner;


public class COSC251_Fall16_HW_Week7 {

	public static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {


		/*
		 * Everything in this program works except for the two methods ShowGreeting and ShowBoard
		 * You will create these methods to print a message to welcome to users to the game
		 * and display the game board to the user as a typical tic tac toe board.
		 * 
		 * Notice the use of the established GetInt method that we developed in class.
		 * 
		 * DO NOT CHANGE ANY OF THE EXISTING CODE!!!
		 * ONLY ADD THESE TWO METHODS!!!
		 * 
		 * If any of the existing code is modified, the assignment WILL NOT BE ACCEPTED.
		 * 
		 */
		
		//Game variables
		
			
			//This variable keeps track of which player is going
			//If it's true then player 1 is going, if it's false then player 2 is going
			//Remember to change it every turn
			boolean currentPlayer1 = true;
			
			//This will tell us if the game is over and we can stop our loop
			//0=tie, 1=win, <0 means game is not over.
			int winStatus = -1;
			
			//This is our check to see if each move is valid
			boolean validMove = false;
			
			//This string is the game board. There are 9 positions in tic tac toe
				//Starting at 0 ensures the user selects the exact index they want to change
			String gameBoard = "012345678";
			
			String playerName = "";
			int playerMove = 9;
		
		//Game starts here
		//This method welcomes the user to a game of tic tac toe
		ShowGreeting();
		
		//This is the game loop that allows players to play the game.
		while (winStatus < 0){
			//reset validMove ever loop
			validMove = false;
			
			//figure out which player is going
			playerName = GetPlayerName(currentPlayer1);
					
			//Show game board to the user and make it look like a tic tac toe board
			ShowBoard(gameBoard);
			
			//Get the player input and make sure it's a valid move
			while (!validMove){
				playerMove = GetInt(playerName + ", please enter the number of the position you would like to take.");
				if (playerMove < gameBoard.length() && playerMove >= 0){
					//Check to see they pick a number within range
					if (gameBoard.charAt(playerMove)!='X' && gameBoard.charAt(playerMove)!='O'){
						//Check to see that the space isn't already filled
						validMove = true;
					}
					else{
						System.out.println("Sorry, that space is taken.");
					}
					
				}
				else{
					System.out.println("Sorry, that is not a valid space.");
				}
			}
			
			//This inserts the player's choice into the gameBoard
			gameBoard = InsertMove(gameBoard, playerMove, currentPlayer1);
			
			//Find out if the game is over
			winStatus = CheckWin(gameBoard);
			
			if (winStatus < 0){
				
				//Switch players if the game is not over
				currentPlayer1 = !currentPlayer1;
			}
			
		}//End while loop
		
		//If loop is done, game is over so show the final board to the players
		ShowBoard(gameBoard);
		
		//Display the outcome of the game
		switch (winStatus){
		case 1:
			System.out.println("Congratulations " + playerName + "!  You Win!");
			break;
		case 0:
			System.out.println("The game is a TIE!  What a match!");
			break;
		default:
			System.out.println("Something went wrong, contact the game developer support line.");
			break;
		}
		
		
		
		userInput.close();
	//End Main Method
	}


	public static String InsertMove(String myBoard, int theMove, boolean thePlayer){
		
		if (thePlayer){
			myBoard = myBoard.replace(myBoard.charAt(theMove), 'X');
		}
		else{
			myBoard = myBoard.replace(myBoard.charAt(theMove), 'O');
		} 
		
		return myBoard;
	}//End InsertMove Method
	
	public static String GetPlayerName(boolean isPlayer1){
		if (isPlayer1){
			return "Player 1";
		}
		else{
			return "Player 2";
		}
	}//End GetPlayerName Method

	public static int GetInt(String myPrompt){
		boolean validNum = false;
		int anyInt = 0;
		
		while(!validNum){
			
			System.out.println(myPrompt);
			
			try{
				anyInt = Integer.parseInt(userInput.nextLine());
				validNum = true;
			}
			catch(NumberFormatException exp1){
	
				System.out.println("You did not enter a valid integer.");
			}
		
		}
		
		return anyInt;
	}//End GetInt Method
	
	public static int CheckWin(String theBoard){
		//boolean that will be set to false if there is a possible move available
		boolean isTie = true;
		
		//Default to no win, no tie
		int gameStatus = -1;
		
		//Check the 8 possible combinations for a win, if any 1 is true a win has been established
		if (	theBoard.charAt(0) == theBoard.charAt(1) && theBoard.charAt(0) == theBoard.charAt(2) ||
				theBoard.charAt(0) == theBoard.charAt(3) && theBoard.charAt(0) == theBoard.charAt(6) ||
				theBoard.charAt(0) == theBoard.charAt(4) && theBoard.charAt(0) == theBoard.charAt(8) ||
				theBoard.charAt(1) == theBoard.charAt(4) && theBoard.charAt(1) == theBoard.charAt(7) ||
				theBoard.charAt(2) == theBoard.charAt(4) && theBoard.charAt(2) == theBoard.charAt(6) ||
				theBoard.charAt(2) == theBoard.charAt(5) && theBoard.charAt(2) == theBoard.charAt(8) ||
				theBoard.charAt(3) == theBoard.charAt(4) && theBoard.charAt(3) == theBoard.charAt(5) ||
				theBoard.charAt(6) == theBoard.charAt(7) && theBoard.charAt(0) == theBoard.charAt(8) 
			
			
			){
			gameStatus = 1;
		}
		

		//check for a tie, meaning no win has been established and all spaces are filled
		for (int i = 0; i < theBoard.length(); i++){
			//go through each space and check to see that the space is not filled
			if (theBoard.charAt(i)!='X' && theBoard.charAt(i)!='O'){
				isTie = false;
			}
		}
		
		if (isTie){
			gameStatus = 0;
		}
		
		return gameStatus;
	}//End CheckWin Method
	
	
	public static String ShowGreeting(){
		String greeting = ("Welcome to Tic Tac Toe, you will be prompted for your user name then play by entering the\nnumber corresponding space you wish to occupy. You win by obtaining 3 spaces in a row either\nhorizontally vertically or diagonally, there is a tie when neither player accomplishes this. Enjoy!\n\n");
		System.out.print(greeting);
		return greeting;
	}
	
	public static String ShowBoard(String gameBoard){
		
		char result0 = gameBoard.charAt(0);
		char result1 = gameBoard.charAt(1);
		char result2 = gameBoard.charAt(2);
		char result3 = gameBoard.charAt(3);
		char result4 = gameBoard.charAt(4);
		char result5 = gameBoard.charAt(5);
		char result6 = gameBoard.charAt(6);
		char result7 = gameBoard.charAt(7);
		char result8 = gameBoard.charAt(8);
		System.out.printf("| %-3s | %-3s | %-3s |\n %-9s\n| %-3s | %-3s | %-3s |\n %-9s\n| %-3s | %-3s | %-3s |\n\n", result0, result1, result2, "-----------------", result3, result4, result5, "-----------------", result6, result7, result8);
		return gameBoard;
	}
	
//End class COSC251_Fall16_HW_Week7
}
