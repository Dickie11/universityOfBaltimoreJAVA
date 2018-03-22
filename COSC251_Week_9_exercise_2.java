import java.util.Scanner;


public class COSC251_Week_9_exercise_2 {

	private static Scanner userInput = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//COSC 251 Week 9
		//Arrays
		
		/*Exercise 2
		 * 
		 * Pass by value versus pass by Reference
		 * 
		 * 
		/* */
				
		
		int a = 5, b = 10, c = 8;

		int[] myIntArray1 = new int[]{a, b, c};

		System.out.println("Current variable values:");

		System.out.println("a = " + a );
		System.out.println("b = " + b );
		System.out.println("c = " + c );
		
		a = setValue(a);
		b = setValue(b);
		c = setValue(c);

		System.out.println();
		System.out.println("New variable values:");

		System.out.println("a = " + a );
		System.out.println("b = " + b );
		System.out.println("c = " + c );
		
		/* */
		 
		
		System.out.println("Old array values:");
		
		ShowArray(myIntArray1);
		
		FillArray(myIntArray1);
		
		
		System.out.println("New Array values:");
		
		ShowArray(myIntArray1);

		
		/* */

		
		
		userInput.close();
		
	//End Main
	}

	//Put new methods here
	public static int setValue(int aVal){
		aVal = GetInt( "Enter value other than " + aVal + ":");
		return aVal;
	}

	
	public static void FillArray(int[] anArray){
		for (int i=0; i < anArray.length; i++){
			
			
			anArray[i] = GetInt( "Enter value for anArray[" + i + "]\n other than " + anArray[i] + ":");
			
			
		}
	//END FillArray
	}

	
	public static void ShowArray(int[] anArray){
		for (int i=0; i < anArray.length; i++){
			
			
			System.out.println("anArray[" + i + "]'s value = " + anArray[i]);
			
			
		}
	//END ShowArray
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
	
//End class
}
