import java.util.Scanner;

public class COSC251_Sp16_Week6_WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		//Loops and Methods
		
		/*WARM UP
		 * 
		 *
		 * This program is supposed to get a string from the user,
		 * find any vowels in the string, and print them out.
		 * 
		 * Find and fix the error(s) that are causing it to fail.
		 * 
		 * 
		/* */
		
		String anyString="", allVowels="";
		
		System.out.println("Please enter a word or words to find the vowels:");
		
		anyString = userInput.nextLine();
		
		allVowels = GetVowels(anyString);
				
		System.out.println("The vowels in your string are: " + allVowels);
		
		userInput.close();
	//End Main
	}
	
	public static String GetVowels(String myString){
		String myVowels = "";
		
		for (int x=0; x < myString.length(); x++){
			
			switch(myString.toLowerCase().charAt(x))
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				myVowels += myString.charAt(x) + " ";
				break;
			default:
				break;
				
			}
		}
		
		return myVowels;
	}
	
//End Class
}
