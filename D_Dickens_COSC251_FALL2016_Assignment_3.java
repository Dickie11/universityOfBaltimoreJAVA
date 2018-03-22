import java.util.Scanner;
public class D_Dickens_COSC251_FALL2016_Assignment_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		
		
		
		/* COSC 251 Week 6 Homework
	    *
	    *
	    * A salesperson makes $200 per week plus 9% of total sales.
	    *
	    * Write a program that takes all sales numbers for the week,
	    * then calculates the total sales as well as what the salesman's
	    * weekly earnings would be.
	    *
	    * The program should allow for input continuously until the user
	    * indicates that all sales have been entered.
	    *
	    *
	   /**/

		System.out.println("This program will allow a salesman to enter his sales for the week and will \n"
				+ "calculate the total sales for the week and the salesmans total pay.");
		
		double totalPay = 200;
		
		System.out.println("Please enter your first sale");
		
		int totalSales = userInput.nextInt(); 
		
		System.out.println("Do you have more sales for the week? enter 1 for yes, 0 for no");
		
		int moreSales = userInput.nextInt();
		
		while (moreSales== 1)
		{
			System.out.println("Please enter your next sale");
			int sales = userInput.nextInt();
			totalSales = sales + totalSales;
			System.out.println("Do you have more sales to enter, press 1 for yes, and 0 for no");
			moreSales= userInput.nextInt();
	
		}
		totalPay= totalPay + ( .09 * totalSales);
		System.out.println("The total sales for the week is: $" + totalSales);
		System.out.println("The salesman total pay for the week is: $" + totalPay);

		
		
		
		
		
		
		
	}

}
