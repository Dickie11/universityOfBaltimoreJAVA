import java.util.Scanner;

public class COSC251_Fall2016_Week11_excercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mySecondClass secondClassInstance_01 = new mySecondClass();
		mySecondClass secondClassInstance_02 = new mySecondClass();
		mySecondClass secondClassInstance_03 = new mySecondClass();
		mySecondClass secondClassInstance_04 = new mySecondClass();

		System.out.println(myFirstClass.myVar);
		
		//System.out.println(mySecondClass.mySecondInt);
		//Must reference instance if the variable being referenced isn't static
		System.out.println(secondClassInstance_01.mySecondInt);
		System.out.println(secondClassInstance_01.myInt);
		//Accessing a static element through an instance is allowed but not advisable
		//secondClassInstance_01.mySecondInt = myHelper.GetInt("Enter a number");
		System.out.println(secondClassInstance_01.mySecondInt);
		
		myFirstClass.myVar = 22;
		//can change
		System.out.println(myFirstClass.myVar);
		
		myFirstClass.helloWorld();
	}//end main

}//end class

class myFirstClass{
	
		//Static elements in a class are referenced
		//through the class name
	public static int myVar = 10;
	
	public static void helloWorld(){
		System.out.println("Hello World!");
	}
}

class mySecondClass{
	public int mySecondInt= 100;
	public static int myInt = 10;
}

