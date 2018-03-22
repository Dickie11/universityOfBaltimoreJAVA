import java.util.Scanner;


public class COSC251_Week_8_warm_up {

	private static Scanner userInput = new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//COSC 251 Week 8
		//Chapter 6: Arrays
		
		/*WARM UP
		 * 
		 * This program should take a specific number of grades
		 * print them all, then show the average.
		 * 
		 *You must create the CalcAverage method 
		 *so that it returns the average given 
		 *the total and number of values.
		 * 
		 * 
		/* */
		
		int numGrades = 5;
		double[] myDoubleArray = new double[numGrades];
		double runningTotal = 0;
		double classAverage;
		
		
		for (int i=0; i < numGrades; i++){
			
			
			myDoubleArray[i] = GetDouble("Please enter student " + (i + 1) + "'s grade:");
			runningTotal += myDoubleArray[i];
			
		}
		
		classAverage = CalcAverage(runningTotal, numGrades);
		
		for (int i=0; i < myDoubleArray.length; i++){
			System.out.println("Student " + (i + 1) + "'s grade: " + myDoubleArray[i]);
		}
		
		System.out.println("The class average is: " + classAverage);
		
		userInput.close();
		
	//End Main
	}

	//Put new methods here

	public static double CalcAverage(double runningTotal, int numGrades){
		double classAverage = 0;
		classAverage = (numGrades / runningTotal);
		return classAverage;
	}
	
	
	
	public static double GetDouble(String myPrompt){
		//This method takes a a string value
		//then uses it to prompt the user and get input
		//it then returns the integer

		double myVal = 0;
		boolean validInput = false;
		
		while(!validInput){
			try
			{
				System.out.println(myPrompt);
				myVal = Double.parseDouble(userInput.nextLine());
				validInput = true;
			}
			catch(NumberFormatException myNumFormatEx){
				System.out.println("You have entered an invalid entry!");
			}
		}

		return myVal;
	
	//End GetUserInput
	}
	
//End class
}
