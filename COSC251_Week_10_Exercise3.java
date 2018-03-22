import java.util.Scanner;

public class COSC251_Week_10_Exercise3 {

	private static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Week 10 Arrays
		 * 
		 * Exercise 3
		 * 
		 * Part 1
		 * 
		 * Look at values stored in the following 2-dimensional arrays and how they are different 
		 * from the previous exercise
		 * 
		 * Either create from scratch or take the code from that example and modify 
		 * the ShowMenu method to handle this
		 * new configuration of data in the same chart format
		 * 
		 */
		
		
		String[][] menuItems = new String[][]{	
			{"Appetizers", "Soups", "Entrees", "Sides", "Drinks"},
			{"pretzel", "nachos"},
			{"corn chowder", "chicken noodle", "tomato", "chilli"},
			{"hot dog", "chicken fingers", "crab cakes", "hamburger"},
			{"chips", "onion rings", "fries"},
			{"beer", "soda"}
				};
		
		double[][] menuPrices = new double[][]{
			{},
			{1.75, 2.25},
			{2.00, 2.00, 2.00, 2.50},
			{3.00, 4.00, 5.00, 4.00},
			{1.00, 2.00, 1.50},
			{6.00, 2.00}
				};
			

		double[][] orderQT = new double[][]{
			{},
			{0, 0},
			{0, 0, 0, 0},
			{0, 0, 0, 0},
			{0, 0, 0},
			{0, 0}
				};
		

		int menuLevel = 0;
		
		
		ShowWelcome();	
		
//		ShowMenu(menuItems, menuPrices);
		
		
		/*
		 *  * 
		 * Part 2
		 * 
		 * Create a method called TakeOrder which allows the user to place an order
		 * They should first be given a choice of categories to order from 
		 * as well as a "show order" and "finish ordering" option
		 * after selecting a category, they should be given a list of items to order 
		 * as well as a "show order" and "go back" option
		 * Each item they select will be added to their order
		 * The orderQT array will hold the quantity of the items they select
		 * 
		 * When the user selects "finish ordering" the order and total are shown
		 * with a request for payment
		 * 
		 * 
		 */
		
		TakeOrder(menuItems, menuPrices, orderQT, menuLevel);
		
		userInput.close();
		
	}//End Main

	
	public static void ShowWelcome(){
		//Displays a welcome message
		System.out.println("Welcome to the UB diner, \"good eats\"");
	}
	
	

	public static int GetInt(String myPrompt){
		//This method takes a a string value to prompt the user and
		//gets numeric input it then returns the input as an integer

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
				System.out.println("You have not entered an valid number!");
			}
		}

		return myVal;
	
	//End GetUserInput
	}
	
}//End Class
