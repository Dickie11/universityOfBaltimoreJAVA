import java.util.Scanner;

public class COSC251_Week7_WarmUp {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		
		//Loops and Methods
		
				/*WARM UP
				 * 
				 *
				 * Create the GetGreeting() method
				 * which returns a String that you might see
				 * if the user were accessing a company's
				 * text interface.
				 * 
				/* */
				
				String yourName;
				
				String newGreeting = GetGreeting();
				
				System.out.println(newGreeting);
				
				System.out.println("Please enter your first name:");
				yourName = userInput.nextLine();
				
				System.out.println("Hi, " + yourName + ", welcome back.");

				
				
				userInput.close();

			//End Main Method
			}
			
public static String GetGreeting(){
	
	return "Welcome to company X";
	
}
	
	
//End Class COSC251_Week7_WarmUp
}
