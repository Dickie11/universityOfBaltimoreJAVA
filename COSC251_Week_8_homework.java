import java.util.Scanner;
import java.util.Random;


public class COSC251_Week_8_homework {

	private static Scanner userInput = new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	//Variables	
		//This is the string to store the user's input
		String inputString = "";

		
		//This is the array of possible guess word
		String[] wordList = new String[]{
			"sometimes", "correct", "doubtful", "hardly",
			"merciful", "robust", "around", "debate", "qualifies",
			"gladly", "sooner", "amazing", "exactly", "republic",
			"joyous", "capacity", "sketch", "paused", "national",
			"award", "stump", "tiny", "sound", "vexed"
			};
		       
		       
		//The method PickWord selects a random word from the list
		//that the user will try to guess
		String guessWord = PickWord(wordList);
		
		
		
		//currentGuess is String that stores the user's progress.
			//The CreateGuess method should initialize currentGuess, 
			//replacing each character in guessWord with "-".
		String currentGuess = CreateGuess(guessWord);
		
		//This sets the allowable number of tries based on the guessWord
			// The number of tries that the user is allowed to make 
			// should be 10 or the length of the guess word + 4, 
			// whichever is lower.
		int numTries = SetNumTries(guessWord);
		
		//This keeps track of what try the user is on.
		int currentTry = 0;
	
	//Greeting	
		//This method shows the game name and the initial currentGuess to the user.
		ShowTitle(currentGuess);
		
	//Game logic	
		//This is the game loop that allows the user to keep guessing
		while(!currentGuess.equals(guessWord) && currentTry < numTries){
			
			//Let the user know how many tries they have left
			System.out.println("You have " + (numTries - currentTry) + " tries remaining.");
			
			//Each time the loop runs, the user is on a new try
			currentTry++;
						
			//GetString method prompts the user and returns their input
			inputString = GetString("Enter one character or your guess word:");
			
			//This checks if the user is guessing the whole word or just one letter
			if (inputString.length()>1){
				
				//This simply checks to see if the user guessed the correct word
				if (inputString.equals(guessWord)){
					currentGuess = guessWord;
					
				}else{
					System.out.println("No! " + inputString + " is not the Guess word.");
				}
				
			}
			else{
				//This takes the user input and looks for it in the guessWord
				//It also uses currentGuess to store the user's previous guesses
				//You must return a string with the user's guess inserted into the correct
				//locations in the string
				
				currentGuess = TryGuess(inputString, guessWord, currentGuess);
			}
			
			//This shows the user their progress
			System.out.println("Try " + currentTry + ":" + currentGuess);
		}
		

		
		
		//This shows the win or lose message.
		if (currentGuess.equals(guessWord)){
			System.out.println("Congratulations! You guessed the word " + guessWord.toUpperCase() + " in " + currentTry + " tries!");
		}
		else{
			System.out.println("Sorry, you did not guess the word within the allowed number of tries.  It was " + guessWord.toUpperCase() + ", try again!");
			
		}
		
		/* */

		userInput.close();
	//End Main
	}

	




	//Other methods go here
	
	public static String  PickWord(String[] wordList){
		Random random = new Random();
		int idx = random.nextInt(wordList.length);
		String Word = (wordList[idx]);
		return Word;
		}
	
	public static String CreateGuess(String guessWord){
		for(int i=0; i <= guessWord.length() -1; i++){
			guessWord = guessWord.replace(guessWord.charAt(i), '-');
		}
		return guessWord;
		}
	
	public static int SetNumTries(String guessWord){
		int tries= guessWord.length();
		tries += 4;
		return tries;
	}
	
	public static void ShowTitle(String currentGuess){
		System.out.println("Welcome to Hang Man, Your current guess is\n          " + currentGuess);
		}
	
	public static String GetString(String Prompt){
		System.out.println(Prompt);
		String GuessString = userInput.nextLine();
		return GuessString;
	}
	
	//*public static String TryGuess(String inputString, String guessWord, String[] currentGuess){
		//for(int i=0; i < guessWord.length() -1; i++){
			//if (inputString.equals(guessWord.charAt(i)){
				//String tryGuess = guessWord.replace(guessWord.charAt(i), inputString);
				//currentGuess[i] = inputString;
			//}
		
		//return tryGuess, currentGuess1;
		//}
	
	private static String TryGuess(String inputString, String guessWord, String currentGuess) {
		  StringBuilder currentGuessBuilder = new StringBuilder(currentGuess);
		  char letterChosenByUser = inputString.toCharArray()[0];
		  for (int i = 0; i < guessWord.toCharArray().length; i++) {   
		        if (guessWord.toCharArray()[i] == letterChosenByUser) {
		            currentGuessBuilder.setCharAt(i, letterChosenByUser);
		        }
		    }
		    
		    return currentGuessBuilder.toString();
		}
	
	
//End class
}
