import java.util.Scanner;


public class COSC251_Week_9_exercise_1 {

	private static Scanner userInput = new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//COSC 251 Week 9
		//Arrays
		
		/*Exercise 1
		 * 
		 * This program takes all possible values for
		 * a deck of cards, inserts those values into
		 * an array of card, then shuffles the array.
		 * 
		 * You must create the method InsertCards.
		 * 
		 * InsertCards accepts 2 arrays and returns an array
		 * that has every combination of all of the values from 
		 * one array with every value from the other.
		 * 
		 * Example cards: "2C", "4S", "10D", "AH"
		/* */
		
				
		String[] myCardValues = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		String[] myCardSuits = new String[]{"H", "C", "D", "S"};
		
		String[] myDeckArray = new String[52];
		
		myDeckArray = InsertCards(myCardValues, myCardSuits);

		ShowArray(myCardValues,"myCardValues");
		ShowArray(myCardSuits,"myCardSuits");
		ShowArray(myDeckArray,"myDeckArray");
		
		
/*  Exercise 3
		 *
		 * You must create the method ShuffleDeck
		 *
		 * ShuffleDeck takes an array as a reference and changes the 
		 * order of the values in the array.
		 */
		
		//ShuffleDeck(myDeckArray);
		

//		ShowArray(myDeckArray,"myDeckArray");
		
		
		/* */
		
		userInput.close();
		
	//End Main
	}

	//Put new methods here

	public static String[] InsertCards(String[] theValues, String[] theSuits){
		String[] myDeck = new String[52];
		
		for (int i = 0; i < theSuits.length; i++){
			
			for (int j = 0; j < theValues.length; j++){
				//System.out.println((i * 13) + j); 
				myDeck[(i * theValues.length) + j] = (theValues[j] + theSuits[i]);
				//0, i = 0, j = 0
				//13, i = 1, j = 0
				//26, i = 2, j = 0
				//39, i = 3, j = 0
			}
			
		}
		
		return myDeck;
	}
	
	
	public static void ShowArray(String[] anArray, String arrayName){
		for (int i=0; i < anArray.length; i++){
			
			
			System.out.println( arrayName + "[" + i + "]'s value = " + anArray[i]);
			
			
		}
	//END ShowArray
	}
	
	
	
//End class
}
