import java.util.Scanner;

public class COSC251_Week7_Exercise2 {

	public static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {

		
		

		//Loops and Methods
		
		
		/*Exercise 2
		 *
		 * Write a program that takes two numbers from the user as well as
		 * a letter for add (a), subtract (s), multiply (m), or divide (d)
		 * 
		 * The numbers will be sent to an appropriate method which will return the answer.
		 * 
		 * The program will then show the entire equation.
		 * 
		/* */
		
		System.out.println("Welcome to Calculator, you will be prompted to enter 2 numbers\n"
				+ "and an opertaion to be done to the two numbers");
		
		int Int1;
		
		int Int2;
		
		double answer;
		
		
		Int1 = GetInt("Please Enter an Integer");
		
		Int2 = GetInt("Please Enter an Integer");
		
		String operator= "";
		
		boolean isOperator = false;
		
		String validInput = "asmd";
		
		 
	while(!isOperator){
			
			System.out.println("Please enter (a) for addition,\n(s) for subtraction,\n(m) for multiplication,\nor (d) for division");
			
			operator = userInput.nextLine();
			
			if(		//!validInput.contains(operator.toLowerCase()) 
					
					!(operator.equalsIgnoreCase("a") ||
					operator.equalsIgnoreCase("s") ||
					operator.equalsIgnoreCase("m") ||
					operator.equalsIgnoreCase("d")))
					/**/
					{
					System.out.println("Incorect input!");
					}
			else{
				isOperator = true;
			}
		}
		
			if(operator.equals("a")){
				answer = addition(Int1, Int2);
			}
			else if(operator.equals("s")){
				answer = subtraction(Int1, Int2);
			}
			else if(operator.equals("m")){
				answer = multiplication(Int1, Int2);
			}
			else{
				answer = division(Int1, Int2);
			}
			
	}

	
	
	public static int GetInt(String myPrompt){
		
		boolean validNum = false;
		int anyInt = 0;
		while(!validNum){
			System.out.println(myPrompt);
			
			try{
				anyInt = Integer.parseInt(userInput.nextLine());
				validNum = true;
			}
			catch(NumberFormatException exp1){
				System.out.println("Error! You did not enter an integer");
				validNum = false;
			}
			}
		return anyInt;
	}
	
	public static double addition(int Int1, int Int2){
		
		double answer = (Int1 + Int2);
		
		System.out.println(Int1+" plus "+Int2+" equals " + answer);
		
		return answer;
	}
	public static double subtraction(int Int1, int Int2){
		
		double answer = (Int1 - Int2);
		
		System.out.println(Int1+" minus "+Int2+" equals " + answer);
		
		return answer;
	}
	public static double multiplication(int Int1, int Int2){
		
		double answer = (Int1 * Int2);
		
		System.out.println(Int1+" times "+Int2+" equals " + answer);
		
		return answer;
	}
	public static double division(int Int1, int Int2){
		
		double answer = ((double)Int1 /(double) Int2);
		
		System.out.println(Int1+" divided by "+Int2+" equals " + answer);
		
		return answer;
	}
	
}
