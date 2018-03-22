import java.util.Scanner;


public class COSC251_Week_8_exercise_1 {

	private static Scanner userInput = new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//COSC 251 Week 8
		//Arrays
		
		/*Exercise 1
		 * 
		 * Create an array of integers then print out all 
		 * members of the array.
		 * 
		 * 
		/* */
		//int[] myIntArray = new int[]{1,3,7,9};
		//int myIntArray[] = {1, 3, 7, 9};
		
		/*int numValues = 4;
		
		int[] myIntArray = new int[numValues];
		myIntArray[0] = 1;
		myIntArray[1] = 3;
		myIntArray[2] = 7;
		myIntArray[3] = 9;
		/*
		System.out.println(myIntArray[0]);
		System.out.println(myIntArray[1]);
		System.out.println(myIntArray[2]);
		System.out.println(myIntArray[3]);
		*/
		/*for(int i = 0; i < myIntArray.length; i++)
		{
			System.out.println(myIntArray[i]);
		}
		/*Exercise 2
		 * 
		 * Allow the user to enter the size of the array and then enter all values.
		 * 
		 * 
		/* */
		int numValues = 0;
		System.out.println("Please enter the amount of values you wish to enter");
		numValues = userInput.nextInt();
		int[] myIntArray = new int[numValues];
		for(int i = 0; i < myIntArray.length; i++)
		{
			System.out.println("please enter a value");
			myIntArray[i] = userInput.nextInt();
		}
		System.out.println("the input is");
		for(int i = 0; i < myIntArray.length; i++)
		{
			System.out.println(myIntArray[i]);
		}
		
		

		/*Exercise 3
		 * 
		 * Print the highest value, lowest value, and average of the values.
		 * 
		 * 
		/* */
		
		
		int maxVal, minVal, totalVal = 0;
		double averageVal;
		maxVal= myIntArray[0];
		
		minVal= myIntArray[0];
		
		totalVal= myIntArray[0];
		
		for(int i=1; i < myIntArray.length; i++)
		{
			if (myIntArray[i] > maxVal){
				maxVal = myIntArray[i];
			}
			
			if (myIntArray[i] < minVal){
				minVal = myIntArray[i];
			}
			totalVal += myIntArray[i];
		}
		
		averageVal= totalVal / myIntArray.length;
		
		System.out.println("smallest = "+ minVal+ " largest = "+ maxVal+ " The average = "+ averageVal);
		
		userInput.close();
		
	//End Main
	}

	//Put new methods here

	
	
//End class
}
