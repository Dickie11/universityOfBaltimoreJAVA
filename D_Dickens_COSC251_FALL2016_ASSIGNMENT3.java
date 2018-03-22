import java.util.Scanner;

public class D_Dickens_COSC251_FALL2016_ASSIGNMENT3 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner userInput = new Scanner(System.in);
		
				int Loan;
				
				int Down;
				
				int moving;
				
				int Move;
				
				int vet;
				
				int credit;
				
				int earn;
				
		
			System.out.println("This Program is used to help you pick the correct mortgage for your situation");
		
			System.out.println("Please enter the amount of the loan you are trying to get");
		
		Loan = userInput.nextInt();
		
			System.out.println("Please enter the amount of your down payment");
		
		Down = userInput.nextInt();
		
		if (Down < (.2 * Loan))
		{
			System.out.println("You should purchase an FHA Loan");
		}
		else if (Down > (.2 * Loan))
		{
			System.out.println("Are you moving soon? (enter 1 for yes 0 for no)");
		
			moving = userInput.nextInt();
		
			if (moving == 1)			
			{
						System.out.println("How long until you move? enter number of years");
			
			
					Move = userInput.nextInt();
				
					if (Move < 10)
					{
				
					System.out.println("You should purchase a Balloon Loan");
					}
					
					else
					{
						System.out.println("You should purchase an Adjustable Rate Mortgage");
					}
			}
		
					
		else
		
			{
				System.out.println("Are you a veteran? enter 1 for yes and 0 for no");
			
			
				vet = userInput.nextInt();
				
				if (vet==1)
				{
				System.out.println("you should purchase a VA Loan");
				}
				else
					{
						System.out.println("What is your Credit Score?");
					
				
					credit = userInput.nextInt();
					
					if (credit < 620)
					{
						System.out.println("You should purchase a Sub prime loan");
					}
					else if (credit > 621)
						{
							System.out.println("Do you expect to be earning considerably more in the next 10 years? type 1 for yes 0 for no");
						
							earn = userInput.nextInt();
						
							if (earn == 1)
						
						{
							System.out.println("you should purchase an interest only loan");
							}
							else
							{
								System.out.println("you should purchase a Conventional Loan");
							}
						}
					}
				}
					
		}		
	}
}			
		
				
		
		
		

	


