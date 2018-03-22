
public class COSC251_Week_10_Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Week 10 Arrays
		 * 
		 * Exercise 2
		 * 
		 * Look at values stored in the following 2-dimensional arrays.
		 * 
		 * Currently the menu is shown in a way that is hard to read.
		 * 
		 * You must remove the current menu code and create a method called ShowMenu 
		 * to print out the menu as a chart which makes it easier to read
		 * 
		 * The chart should look like this
		 * 
		 | Entrees             | Sides             | Drinks             | Snack              |
		  -----------------------------------------------------------------------------------
		 | Entree 1     -$price| Side 1     -$price| Drink 1     -$price| Snack 1     -$price|
		 | Entree 2     -$price| Side 2     -$price| Drink 2     -$price| Snack 2     -$price|
		 | Entree 3     -$price| Side 3     -$price|                    | Snack 3     -$price|
		 | Entree 4     -$price|                   |                    |
		 * 
		 */
		
		String[][] menu = new String[][]{
			{"Entrees", "hot dog", "chicken fingers", "crab cakes", "hamburger"},
			{"Sides", "chips", "onion rings", "fries"},
			{"Drinks", "beer", "soda"},
			{"Snacks", "big cookie", "pretzel", "ice cream cone"}
				};
		
		String[][] menuPrices = new String[][]{
			{"", "$3.00", "$4.00", "$5.00", "$4.00"},
			{"", "$1.00", "$2.00", "$1.50"},
			{"", "$6.00", "$2.00"},
			{"", "$1.00", "$1.50", "$2.50"}
				};	
		
				ShowMenu(menu, menuPrices);
		
		/*for(int i = 0; i < menu.length; i++){	
			//Print the category
			System.out.println(menu[i][0]);
			
			//Go through the items in that sub array
			for(int j = 1; j < menu[i].length; j++){
				
				//Print the menu item with price
				System.out.print(menu[i][j] + "-" + menuPrices[i][j]);
				//Insert a comma if there are more items after this
				if(j < menu[i].length-1){
					
					System.out.print(", ");
					
				}
			}
			//Jump to the next line.
			System.out.println();
		*/}
		
		
	//End main method
	

	public static void ShowMenu(String[][] theMenu, String[][] thePrices){
		int longestArray = theMenu[0].length;
		System.out.print("|");
		for( int i = 0; i<theMenu.length; i++){
			System.out.printf(" %-20s |", theMenu[i][0]);
			if (theMenu[i].length > longestArray){
				longestArray = theMenu[i].length;
			}
		}
	
		for(int j = 1; j< longestArray; j++){
			System.out.print("\n|");
		
			for( int i = 0; i<theMenu.length; i++){
				if (j < theMenu[i].length){
				System.out.printf(" %-15s %s|", theMenu[i][j], thePrices[i][j]);
				}
				else{
					System.out.printf(" %-20s |", "");
				}
			}
		}	
			
	}
//End Class
}
