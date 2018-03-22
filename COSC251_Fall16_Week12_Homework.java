public class COSC251_Fall16_Week12_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* *
		*
		*
		*	Create the newCar class which allows the following java program to run.
		*YOU MUST NOT MODIFY THE EXISTING CODE, ONLY CONSTRUCT THE CLASS PROPERLY TO ALLOW IT TO RUN.
		
		*	The instance of car1 should be created containing default values for color, brand, and model 
		*     other than black chevy malibu 
		*   The newCar method should be set up so that instance of car2 contains black chevy malibu
		*     as the values for color, brand, and model because those values are passed as arguements
		*     
		*	The car2.showCar() method should output a line of text that says
		*	"I drive a Black Chevy Malibu."
		*
		*	car1.showCar() should show its color, brand, and model so it says
		*   "I drive a [color] [brand] [model]"
		
		*	The information stored in the newCar class should be encapsulated and not
		*	directly accessible from the main method.
		/**/
		
		newCar car1 = new newCar();
		
		newCar car2 = new newCar("Black", "Chevy", "Malibu");
		
		car1.showCar();
		car2.showCar();
		
	}

}


class newCar{
	
	private String color= "Black";
	private String brand= "Chevy";
	private String model= "Malibu";

	public newCar() {
		color= "color";
		brand= "brand";
		model= "model";
	}
	
	public newCar(String string, String string2, String string3) {
		this.color= string;
		this.brand= string2;
		this.model= string3;
	}


	public void showCar(){
		System.out.println("I drive a "+color+" "+brand+" "+model);
	}
}



