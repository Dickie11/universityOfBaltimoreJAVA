import java.util.Scanner;
import java.util.Scanner;


public class COSC251_Sp16_Week4_Exercise1 {

	public static void main(String[] args) {


		Scanner userInput = new Scanner(System.in);
		
	/*

	 * Switch syntax
		 
		 switch ( [variable_to_test] ) {
				case [value]:
					code_here;
					break;
				case [value]:
					code_here;
					break;
				default:
					values_not_caught_above;
		 }
	 * 
	 * 
	 * Exercise 1:
	 * 
	 * Write a Java program that reads a date from the user in numeric 
	 * form.  For example, February 17, 2003 would be entered as the 
	 * three integers 2, 17, and 2003.  Your program must then determine 
	 * if the date is a “valid” date.  Use the following information to 
	 * determine if the date is valid:  
	 * 	January, March, May, July, August, October, and December all have 31 days.  
	April, June, September, and November all have 30 days.  
	February has 28 days in a non-leap year and 29 days in a leap year. 
	
	A year is a leap year (and contains February 29) if it is divisible by 4. 
	But if the year is also divisible by 100 then it is not a leap year, 
	unless it is divisible by 400.
	1700, 1800, 1900, 1987 = not leap years
	1600, 2000, 2004, 2016 = leap years
	 	
		Print the date in mm/dd/yyy form and
		print either “valid date” or “invalid date” as output.
		 
		 *
		 *
		 *
		 *
		/*Start code*/

	int myMonth;
	int myDay;
	int myYear;

	System.out.println("This program will determine if a date is valid. \n\n");
	
	System.out.println("Please enter the month as mm:");
	myMonth = userInput.nextInt();

	System.out.println("Please enter the day as dd:");
	myDay = userInput.nextInt();
	

	System.out.println("Please enter the year as yyyy:");
	myYear = userInput.nextInt();
		
		
	switch (myMonth){
		case 1: 
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: 
			if (myDay<0 || myDay>31)
			{
			System.out.print("invalid date");
			}	
			else
			{
				System.out.print(myMonth+"/"+myDay+"/"+myYear);
			}
			break;
		case 2: 
			if (myYear % 4 == 0 || myYear % 400 == 0)
		{
					if (myDay<0 || myDay>29)
					{
						System.out.print("invalid date");
					}
		}
			else if (myDay<0 || myDay>28)
				{
				System.out.print("invalid date");
				}	
			else
			{
				System.out.print(myMonth+"/"+myDay+"/"+myYear);
			}
				
		
			break;
		case 4:
		case 6:
		case 9:
		case 11: if (myDay<0 || myDay>30)
		{
			System.out.print("Invalid Date");
		}
			else
			{
				System.out.print(myMonth+"/"+myDay+"/"+myYear);
			}
		
			default: System.out.print("please Enter a valid month");
			myMonth = userInput.nextInt();
	
	}
	}
	
	

	
	}


