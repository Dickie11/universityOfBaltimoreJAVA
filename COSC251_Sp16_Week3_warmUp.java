import java.util.Scanner;

public class COSC251_Sp16_Week3_warmUp {

	public static void main(String[] args) {


		Scanner userInput = new Scanner(System.in);
		
		/*The following code should only print the 
		 * sum of y and z if they are both between 
		 * 5 and 10, otherwise it should provide 
		 * a single statement about what is wrong 
		 * with the input.
		 * Find out which cases this doesn't work 
		 * correctly and try to fix it.
		 * 
		 * */
		
		int y,z;

		System.out.println("Please enter the value of y:");

		y = userInput.nextInt();

		System.out.println("Please enter the value of z:");

		z = userInput.nextInt();
		
		if (y<5)
		{
			if (z<5)
			{
				System.out.println("The values are too low");
			}
			else
			{
				System.out.println("The value of y is too low ");
			}
		}
		else
			if (y>10)
			{	if (z>10)
					System.out.println("The values are too high");
			}
				else{
					System.out.println("The value of y is too high");
				}
			}
			else{
				if (z>10){
				
					System.out.println("The value of z is too high");
				}
				if (z<5){
					System.out.println("The value of z is too low");
				}
				else{
					System.out.printf("%s%d","the sum of the numbers is: ", + (z + y) );
				}
			}
		/**/

	}

}
