
public class D_DICKENS_COSC251_FA2016_HOMEWORK2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 3 + 3 * 6 - 2;
		
		int num2 = 6 * 4 + 8 / 2;
		
		int num3 = (3 + 3) * 6 - 2;
				
		int num4 = 6 * (4 + (8 / 2));
		
		System.out.printf("%s\n %s\n %s\n", "Dear Mr. Garrison,", 
		"I am writing you to thank you for teaching me the order of operations in math. I have been learning a new programing language called Java and it also uses the order of operations.",
		"I have taken the time to write out a few mathmatical expressions for you to explain how the operators work in java and how the order of operations applies. In the first expression:");
		
		System.out.printf("%s, %d", " 3 + 3 * 6 - 2=", num1);
		
		System.out.printf("%s\n %s", ". To follow the order of operations 3 is first multiplied by 6, giving you a product of 18, then 3 is added to 18 giving you a sum of 21, then 2 is subtracted from", "21 leaving you with an answer of 19. In the next equation:");
		
		System.out.printf("%s, %d", " (3 + 3) * 6 - 2=", num3);
		
		System.out.printf("%s\n %s\n %s", ". But if we add parentheses we can change the order of operations in java, just like in math. If I",
				"place 3 + 3 in parenthases as you see above it changes the outcome of the equation by changing the order of operations. In this equation first 3 is added to 3 giving you 6,", "then it multiplies 6 by 6 giving you 36, then it subtract 2 from 36 giving you an answer of 34. In the next equation:");
		
		System.out.printf("%s, %d", " 6 * 4 + 8 / 2=", num2);
		
		System.out.printf("%-80s\n %-80s %s", ". In this equation, first 6 is multiplied by 4", "leaving 24, then 8 is devided by 2 leaving you with 4, then 24 is added to 4 leaving you with an answer of 28", "In the next equation: ");

		System.out.printf("%s, %d", "6 * (4 + (8 / 2))=", num4);
		
		System.out.printf("%-80s\n %-80s\n %s\n %s\n %180s", "In this equation we change", "the order of operations by placing 8 / 2 in parentheses, and then placing parentheses around 4 and (8 / 2) making it (4 + (8 / 2)). That makes the equation operate as follows:",
				"First 8 is devided by 2 leaving 4, then 4 is added to 4 leaving 8, then 6 is multiplied by 8 leaving you with an answer of 48. This is how the order of operations works in java Mhm'kay.", "Thank you for teaching me.", "-Sincerely, David Dickens.");
		
	}

}
