import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class COSC251_Sp16_Week3_Exercise_1 {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		
		System.out.printf("%s", "Use this program to design your sanwhich first pick your bread\n white, wheat, or rye?");
		
		String Bread = userInput.nextLine();
		
		System.out.printf("%s", "Now pick your protein\n roast beef, ham, chicken, or tofu");
		
		String Protein = userInput.nextLine();
		
		System.out.printf("%s", "Now pick your topping\n tomato, lettuce, or onion");
		
		String Topping = userInput.nextLine();
		
		System.out.printf("%s", "Now pick you condiment\n mayo, bbq sauce, or ketchup");

		String Condiment = userInput.nextLine();
		
		System.out.printf("%s %s %s %s %swhite", "Your sandwich will consist of: ", Bread, Protein, Topping, Condiment);
		
		
		/*
		 ********** 
		 * Create a program that allows someone to create a sandwich
		 * The program should allow them to choose one of each of 
		 * the following: 
		 * Bread, Protein, Topping, and Condiment
		 * 
		 * Bread can be white, wheat, or rye
		 * Protein can be roast beef, ham, chicken, or tofu
		 * Topping can be tomato, lettuce, or onion
		 * Condiment can be mayo, bbq sauce, or ketchup
		 * 
		 * 
		 /**/
		
		

	}

}

/*
 **********
 *  How would this be different if it was a bagel store 
 *  with the following options:
 *
		 * Bagel can be plain, everything, or chocolate chip
		 * Protein can be bacon or lox (smoked salmon)
		 * Topping can be cream cheese, butter, tomato, lettuce, or onion
		 * Condiment can be mayo, grape jelly, or strawberry jelly
		 * 
 /**/
