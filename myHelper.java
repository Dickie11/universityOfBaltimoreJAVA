import java.util.Scanner;

public class myHelper {
		private static Scanner userInput = new Scanner(System.in);
		
	public static int GetInt(String Prompt){
			

			int myVal = 0;
			boolean validInput = false;
			
			while(!validInput){
				try
				{
					System.out.println(Prompt);
					myVal = Integer.parseInt(userInput.nextLine());
					validInput = true;
				}
				catch(NumberFormatException myNumFormatEx){
					System.out.println("You have entered an invalid number!");
				}
			}

			return myVal;
		}

	}
