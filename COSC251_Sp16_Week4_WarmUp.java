import java.util.Scanner;
import java.util.Scanner;


public class COSC251_Sp16_Week4_WarmUp {

	public static void main(String[] args) {


		Scanner userInput = new Scanner(System.in);
		
	/*Warm Up
	 * 
	 * 
	 * 
	 *   Write a Java program that allows 
		 the user to answer the following multiple choice question.
		 The program should give different feedback for each choice.

			Use the example question below:
			What is the correct way to declare a variable to store an integer value in Java?
				a. int 1x=10;
				b. int x=10;
				c. float x=10.0f;
				d. string x="10";
	 */
		
		
	
	
	
	String answer;
	
	System.out.println("What is the correct way to declare a variable to store an integer value in Java?");
	System.out.println("a. Int 1x=10");
	System.out.println("b. intx=10");
	System.out.println("c. Float x=10.0f");
	System.out.println("d. string x=10");
	
	System.out.println("enter your answer:");
	
	answer = userInput.nextLine();
	/*
	if (answer.toLowerCase().equals("a"))
	{
		System.out.println("incorrect");
	}
	else if (answer.toLowerCase().equals("b"))
	{
		System.out.println("This is correct");	
	}
	else if (answer.toLowerCase().equals("c"))
	{
		System.out.println("incorrect, this is also wrong");
	}
	else if (answer.toLowerCase().equals("d"))
	{
		System.out.println("This is incorrect aswell");
	}
	else {
		System.out.print("you entered and invalid option");
	}
	*/
	
	
	switch (answer){
		case "a":
			System.out.println("incorrect");
			break;
		case "b":
			System.out.println("This is correct");	
			break;
		case "c":
			System.out.println("incorrect, this is also wrong");
			break;
		case "d":
			System.out.println("This is incorrect aswell");
			break;
			default:
				
			break;
			
			userInput.close();
	}
	}

}
