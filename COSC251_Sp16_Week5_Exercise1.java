import java.util.Scanner;

public class COSC251_Sp16_Week5_Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		
		//Chapter 5 Methods
		
		
		/*Exercise 1
		 * 
		 * Write a program that takes a string 
		 * from the user and calls a method to 
		 * print each character of the string 
		 * on a separate line.
		 * 
		/* */
		System.out.print("Please enter your name!");
		String userName = userInput.nextLine();
		
		printEachChar(userName);
		

		userInput.close();
	//End Main
	}
	//Other methods go here

	public static void printEachChar(String uName){
		for (int x = 0; x < uName.length() ; x++){
			System.out.println(uName.charAt(x));
		}
	}
	
	
//End class
}
