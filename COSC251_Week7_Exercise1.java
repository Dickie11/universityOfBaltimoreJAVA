import java.util.Scanner;

public class COSC251_Week7_Exercise1 {

	public static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {

		
		

		//Loops and Methods
		
		
		/*Exercise 1
		 *
		 *Part 1
		 *
		 * Write a program that tells the user to enter a vowel.
		 * If the user types in anything but a vowel, the program says the input is wrong
		 * and continually prompts the user for acceptable input.
		 * 
		 * When a vowel is entered, the program cheers for the user.
		 * 
		*/
		
		String myVowel = "";
		boolean isVowel = false;
		String validInput = "aeiou";
		
		System.out.println("Helo user, This is a simple test");
		
		while(!isVowel){
			
			System.out.println("Please input a vowel");
			
			myVowel = userInput.nextLine();
			
			if(		//!validInput.contains(myVowel.toLowerCase()) 
					
					!(myVowel.equalsIgnoreCase("a") ||
					myVowel.equalsIgnoreCase("e") ||
					myVowel.equalsIgnoreCase("i") ||
					myVowel.equalsIgnoreCase("o") ||
					myVowel.equalsIgnoreCase("u"))
					/**/
					){
					System.out.println("Mistakes were made");
					}
			else{
				isVowel = true;
			}
		}
		
		System.out.println("Cheers correct!");
		
		
		/* * Part 2
		 * 
		 * Have the program then ask the user for an integer and 
		 * continually prompt the user until they have entered valid input.
		 * 
		 * Cheer for the user when they have entered a valid number.
		 * 
		/* */
		
		
		int myInt;
		myInt = GetInt("Please Enter an Integer");
		
			System.out.println("you entered valid input");
				
			System.out.println("Thank you for taking the test");
		
		
		
		userInput.close();
	
}

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
				System.out.println("Error! You did not enter an integer");
				validNum = false;
			}
			}
		return anyInt;
	}

}
