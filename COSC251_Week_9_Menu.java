import java.util.Scanner;

public class COSC251_Week_9_Menu {


	private static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/*
		 * The following program shows the menu from a concession stand
		 * It allows user to select a menu category or exit
		 * 
		 * You must create the ShowSubMenu() method which will list all of the options in the category
		 * and allow the user to pick one of the item to show the price of that item
		 * or enter 0 to go back to the previous menu.
		 * 
		 */
		
		int userChoice = -1;
		
		String[] menu = new String[]{
				"Entrees", "Sides", "Drinks"
				};
		
		
		String[] entrees = new String[]{
				"hot dog", "chicken fingers", "crab cakes", "hamburger"
				};		

		String[] ePrices = new String[]{
				"$3.00", "$4.00", "$5.00", "$3.50"
				};	
		
		
		String[] sides = new String[]{
				"chips", "onion rings", "fries"
				};

		String[] sPrices = new String[]{
				"$1.00", "$2.00", "$1.50"
				};	
		
		
		String[] drinks = new String[]{
				"beer", "soda"
				};		

		String[] dPrices = new String[]{
				"$6.00", "$2.00"
				};	
		
		System.out.println("Welcome to the consession stand! Take a minute to browse our menu.");
		
		while(userChoice != 0){
			
			System.out.println("Here are the menu catergories.");
			
			for(int i = 0; i < menu.length; i++){
				
				System.out.printf("%5d-%-10s%n", i+1, menu[i]);
				
			}

			System.out.printf("%5d-%-10s%n", 0, "Exit");
			System.out.println();
			userChoice = GetInt("Please enter your choice:");
			
			
			
			switch(userChoice){

				case 0:

					System.out.println("Good Bye.");
					break;
				case 1:
					System.out.println("You have selected " + menu[userChoice-1] + ".");
					ShowSubMenu(entrees, ePrices);
					break;

				case 2:
					System.out.println("You have selected " + menu[userChoice-1] + ".");
					ShowSubMenu(sides, sPrices);
					break;

				case 3:
					System.out.println("You have selected " + menu[userChoice-1] + ".");
					ShowSubMenu(drinks, dPrices);
					break;
				default:
					System.out.println("You have not selected a valid category.");
					break;
			}
		}
	}

	public static void ShowSubMenu(String[] theItems, String[] thePrices){
		int theInput = -1;
		
		while(theInput != 0){
			for(int i = 0; i < theItems.length; i++){
				
				System.out.printf("%5d-%-10s%n", i+1, theItems[i]);
				
			}

			System.out.printf("%5d-%-10s%n", 0, "Go Back");
			
			theInput = 	GetInt("What would you like to see?");
			
			if (theInput > theItems.length){
				System.out.println("That's not a valid choice.");
			}else{
				if (theInput > 0){
					System.out.println(theItems[theInput-1] + " costs " + thePrices[theInput-1]);
				}
			}
		}
		
		
	}
	
	public static int GetInt(String myPrompt){
		//This method takes a a string value
		//then uses it to prompt the user and get input
		//it then returns the integer

		int myVal = 0;
		boolean validInput = false;
		
		while(!validInput){
			try
			{
				System.out.println(myPrompt);
				myVal = Integer.parseInt(userInput.nextLine());
				validInput = true;
			}
			catch(NumberFormatException myNumFormatEx){
				System.out.println("You have entered an invalid number!");
			}
		}

		return myVal;
	
	//End GetUserInput
	}
}
