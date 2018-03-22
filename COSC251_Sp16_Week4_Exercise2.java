import java.util.Scanner;

public class COSC251_Sp16_Week4_Exercise2 {

	public static void main(String[] args) {


		Scanner userInput = new Scanner(System.in);
		
		/*Exercise 2
		 * 
		 * Generate a random number between 0 and 100 inclusive, 
		 * then ask the user to guess its value.
		 * Tell the user higher or lower based
		 * on their guess and ask for a new guess
		 * 
		 * When user gets number, announce win.
		 * 
		 * Variation 1: Count number of guesses and display number of tries
		 * Variation 2: Limit number of guesses  
		 * 				announce loss if goes over
		 * 				print winning number
		 * 
		/**/
		/*
		int randomNumber = (int) (Math.random());*/
		
		/*
		for(int x = 0; x < 10000; x++){
			if (randomNumber == 100){
			System.out.println(randomNumber);
			}
			randomNumber = (int) (Math.random() * 101);
					
		}
		*/
		
		System.out.println("Welcome to the number guessing game, In this game you will be asked \n"
				+ "to guess a randomly generated number. you have 10 tries to guess the correct number:  ");
		
		int randomNumber = (int) (Math.random() * 101);
		int guess = -1, counter = 0;
		while (guess != randomNumber && counter < 10){
			System.out.println("Please enter your guess:\n");
			guess = userInput.nextInt();
			counter++;
			if (counter > 9)
			{
				System.out.println("You took more than the alloted amount of tries, please play again");
			}
			else if (guess > randomNumber)
			{
				System.out.println("Your guess was too high! \n Please try again.");
			}
			else if (guess < randomNumber)
			{
				System.out.println("Your guess was too low! \n Please try again.");
			}
			else
			{
				System.out.println("Your guess was correct! \n.");
			}
			
		}
		
		
		System.out.println("It took you " + counter + " Tries. \n"
				+ "Thank you for playing");
		
		userInput.close();

	}

}
