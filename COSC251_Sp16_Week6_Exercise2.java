import java.util.Scanner;

public class COSC251_Sp16_Week6_Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);

		//Loops and Methods
		

		/*Exercise 2
		 * 
		 * Write a program that takes a positive integer
		 * from user input and calls a method which
		 * returns true if it is a prime number
		 * and false if it is not, 
		 * then prints out the result to the user.		 
		 * 
		 * 
		 * 
		/**/
		
		

		int myInt;
		boolean isPrime;
		
		
		System.out.println("Please enter a number to see if it is prime:");
		myInt = Integer.parseInt( userInput.nextLine() );
		
		
		isPrime = PrimeTester(myInt); 
		
		if (isPrime){
			System.out.println(myInt + " is prime!");
			
		}
		else{
			System.out.println(myInt + " is NOT prime!");
			
		}

		userInput.close();
	//End Main
	}
	
	public static boolean PrimeTester(int testInt){
		
		int tempInt;
		boolean checkPrime = true;
		
		for (int x = 2; x < testInt; x++ ){
			
			tempInt = testInt % x;
			
			//System.out.println("tempInt=" + tempInt);
			
			if (tempInt == 0){
				checkPrime = false;
			}
			
		}
		
		
		return checkPrime;
	}

}
