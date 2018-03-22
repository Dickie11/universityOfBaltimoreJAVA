import java.util.Scanner;

public class COSC251_Sp16_Week6_Exercise1 {

	public static void main(String[] args) {


		Scanner userInput = new Scanner(System.in);
		

		//Loops and Methods
		
		
		/*Exercise 1
		 *
		 * This program takes a string from the user,
		 * then prints out the reverse of the string to the user.
		 * 
		 * 
		 * Create the method that takes the string and returns another string 
		 * with the letters in reverse order.
		 * 
		 * 
		/* */
	
		
		String anyString="", newString="";
		
		
		
		System.out.println("Please enter a word to be reversed:");
		anyString = userInput.nextLine();
		
		
		newString = ReverseWord(anyString); 
		
		System.out.println("The word in reverse is: " + newString);
		
		
		userInput.close();
	}
	
	public static String ReverseWord(String myString){
		String myRev = "";
		
		for (int x = (myString.length()-1); x >= 0; x--){
			
			myRev += myString.charAt(x);
				
		}
		
		return myRev;
	}
	
}
