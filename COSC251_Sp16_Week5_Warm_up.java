import java.util.Scanner;

public class COSC251_Sp16_Week5_Warm_up {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner userInput = new Scanner(System.in);
		
		//try to debug the following code
		
		//a)
		/* */
		int x = 1, total = 0;
		while (x <= 10)
		{
			total += x;
			
			x++;
		}
		

		System.out.println("x = " + x);
		System.out.println("total = " + total);
		
		/**/
				
		//b)
		int newTotal = 0;
		int y = 0;
		
		while (y<=100)
		{
			y++;/* This means y= y+1  called accumulator*/
			newTotal += y;
		
			
		System.out.println("y = " + y);
		System.out.println("new total = " + newTotal);
		
		}
		
		userInput.close();
		
	}

}
