import java.util.ArrayList;
import java.util.Scanner;

class Inventory {
	
	static ArrayList<Inventory> myInv = new ArrayList<Inventory>(); 	
	private static Scanner userInput = new Scanner(System.in);
	private String make;
	private String model;
	private int year;
	private int body;
	private int invNum;
	private int price;
	
	private static String[] bodyStyle = new String[]{"4 door Sedan","2 door Coup","2 door Truck","4 door Truck","4 door Van",};
	private static String[] yearList = new String[]{"2011", "2012", "2013", "2014", "2015", "2016", "2017",}; 
	
	public Inventory(String vMake, String vModel, int vYear, int vBody, int vInvNum, int vPrice) {
		make= vMake;
		model=vModel;
		year=vYear;
		body=vBody;
		invNum=vInvNum;
		price=vPrice;
		}
	public Inventory() {
	
		System.out.println("Please enter the make: ");
		make = userInput.nextLine();
		System.out.println("Please enter the model: ");
		model = userInput.nextLine();
		setYear();
		setBody();
		invNum = D_Dickens_COSC251_FALL2016_Project2.GetInt("Please enter the Inventory Number");
		price = D_Dickens_COSC251_FALL2016_Project2.GetInt("Please enter the Asking Price: ");
			
	}
	private void setYear() {
		boolean validInput = false;
		String myPrompt = "Please choose the model year for" + this.make + " " + this.model + " from the following choices:\n";
		for (int i=0; i < Inventory.yearList.length;i++){
			myPrompt += (i+1) + ") " + Inventory.yearList[i] + "\n";
		}
		while (!validInput){
			this.year = D_Dickens_COSC251_FALL2016_Project2.GetInt(myPrompt)-1;
			if (this.year>=0 && this.year<Inventory.yearList.length){
				validInput=true;
			}else{
				System.out.println("You did not choose a valid option.");
			}
		}
		
	}
	public void setBody() {
		boolean validInput = false;
		String myPrompt = "Please choose the body style for" + this.make + " " + this.model + " from the following choices:\n";
		for (int i=0; i < Inventory.bodyStyle.length;i++){
			myPrompt += (i+1) + ") " + Inventory.bodyStyle[i] + "\n";
		}
		while (!validInput){
			this.body = D_Dickens_COSC251_FALL2016_Project2.GetInt(myPrompt)-1;
			if (this.body>=0 && this.body<Inventory.bodyStyle.length){
				validInput=true;
			}else{
				System.out.println("You did not choose a valid option.");
			}
		}
	}
	public String getInv(){
		return make + " " + model + " " + "Inventory #: " + invNum;
		
	}

	public void printInv() {
		System.out.println("Make: "+ make);
		System.out.println("Model: "+ model);
		System.out.println("Year: "+ yearList[year]);
		System.out.println("Body: "+ bodyStyle[body]);
		System.out.println("Inventory #: "+ invNum);
		System.out.println("Price: $"+ price);
		
		
	}
public static int getIndex() {
		
		int index = D_Dickens_COSC251_FALL2016_Project2.GetInt("please enter the number corresponding to the entry");
		return index;
	}
public void modify() {
	System.out.println("Please enter the make: ");
	make = userInput.nextLine();
	System.out.println("Please enter the model: ");
	model = userInput.nextLine();
	setYear();
	setBody();
	invNum = D_Dickens_COSC251_FALL2016_Project2.GetInt("Please enter the Inventory Number");
	price = D_Dickens_COSC251_FALL2016_Project2.GetInt("Please enter the Asking Price: ");
	
}
public static void removeInventory() {
	int iRem = -1;
	int iDel = -1;
	while(iDel!=1){
		for(int i = 0; i <myInv.size(); i++){
			System.out.println((i + 1) + "-" + myInv.get(i).getInv());
		}
		iRem= D_Dickens_COSC251_FALL2016_Project2.GetInt("Please select an item to delete or enter 0 to go back") -1;
		if(iRem>=0 && iRem<myInv.size()){
			System.out.println("Confirm Deletion of : " + myInv.get(iRem).getInv());
			iDel = D_Dickens_COSC251_FALL2016_Project2.GetInt("1 - yes\n2 - no");
		}else{
			if(iRem == -1){
				iDel = 1;
			}else{
				System.out.println("Invalid Selection");
			}
		}
	}
	if(iRem >=0 && iDel < myInv.size()){
		myInv.remove(iRem);
	}
}
public static void modifyInventory() {

	int iE = -1;
	int iEdit = -1;
	while(iEdit!=1){
		for(int i = 0; i < myInv.size(); i++){
			System.out.printf("%d, %s", (i + 1)," ");myInv.get(i).printInv();
			System.out.println();
			}
		
		iE= D_Dickens_COSC251_FALL2016_Project2.GetInt("Please select an item to edit or enter 0 to go back") -1;
		if(iE>=0 && iE<myInv.size()){
			System.out.println("Confirm edit of : " + myInv.get(iE).getInv());
			iEdit = D_Dickens_COSC251_FALL2016_Project2.GetInt("1 - yes\n2 - no");
		}else{
			if(iE == -1){
				iEdit = 1;
			}else{
				System.out.println("Invalid Selection");
			}
		}
	}
	if(iE >=0 && iEdit < myInv.size()){
		myInv.get(iE).modify();

	}	
}
public static void searchInv(){
	int userOption = -1;
	String stringVal;
	int intVal;
	boolean foundVal = false;
	while(userOption != 0){
		foundVal = false;
		System.out.println("Please pick an attribute that you want to search for:");
		System.out.println("1 - Make");
		System.out.println("2 - Model");
		System.out.println("3 - Year");
		System.out.println("4 - Body Style");
		System.out.println("5 - Inventory Number");
		System.out.println("0 - done");
		
		userOption = D_Dickens_COSC251_FALL2016_Project2.GetInt("Pick one:");
		
		switch(userOption){
			
			case 1:
				//System.out.println("you chose 2!");
				stringVal = D_Dickens_COSC251_FALL2016_Project2.getString("Enter the Make you want to search for:");

				for(int i = 0; i < myInv.size(); i++){
					if(stringVal.equalsIgnoreCase(myInv.get(i).make)){
						System.out.println(myInv.get(i).getInv());
						foundVal = true;
					}
				}
				
				//  (!foundVal) is the same as (foundVal == false)
				if(!foundVal)
				{
					System.out.println("No items found!");
				}
				
				break;
			case 2:
				//System.out.println("you chose 3!");
				stringVal = D_Dickens_COSC251_FALL2016_Project2.getString("Enter the Model you want to search for:");

				for(int i = 0; i < myInv.size(); i++){
					if(stringVal == myInv.get(i).model){
						System.out.println(myInv.get(i).getInv());
						foundVal = true;
					}
				}
				
				//  (!foundVal) is the same as (foundVal == false)
				if(!foundVal)
				{
					System.out.println("No items found!");
				}
				break;
			case 3:
				//System.out.println("you chose 4!");intVal = MyHelper.getInt("Enter the age you want to search for:");
				String myPrompt = "Please choose the role you want to search for:\n";
				for (int i=0; i < Inventory.yearList.length ;i++){
					myPrompt += (i+1) + ") " + Inventory.yearList[i] + "\n";
				}
				
				intVal = D_Dickens_COSC251_FALL2016_Project2.GetInt(myPrompt);
				
				
				for(int i = 0; i < myInv.size(); i++){
					if((intVal-1) == myInv.get(i).year){
						System.out.println(myInv.get(i).getInv());
						foundVal = true;
					}
				}
				
				//  (!foundVal) is the same as (foundVal == false)
				if(!foundVal)
				{
					System.out.println("No items found!");
				}
				break;
			case 4:
				//System.out.println("you chose 4!");intVal = MyHelper.getInt("Enter the age you want to search for:");
				String myPrompt1 = "Please choose the Body Style you want to search for:\n";
				for (int i=0; i < Inventory.bodyStyle.length ;i++){
					myPrompt1 += (i+1) + ") " + Inventory.bodyStyle[i] + "\n";
				}
				
				intVal = D_Dickens_COSC251_FALL2016_Project2.GetInt(myPrompt1);
				
				
				for(int i = 0; i < myInv.size(); i++){
					if((intVal-1) == myInv.get(i).year){
						System.out.println(myInv.get(i).getInv());
						foundVal = true;
					}
				}
				
				//  (!foundVal) is the same as (foundVal == false)
				if(!foundVal)
				{
					System.out.println("No items found!");
				}
				break;
			case 5:
				//System.out.println("you chose 3!");
				intVal = D_Dickens_COSC251_FALL2016_Project2.GetInt("Enter the age you want to search for:");

				for(int i = 0; i < myInv.size(); i++){
					if(intVal == myInv.get(i).invNum){
						System.out.println(myInv.get(i).getInv());
						foundVal = true;
					}
				}
				
				//  (!foundVal) is the same as (foundVal == false)
				if(!foundVal)
				{
					System.out.println("No items found!");
				}
				break;
			case 0:
				//System.out.println("goodbye!");
				break;
			default:
				System.out.println("Invalid option.");
				break;
		}
		
	}
}


}
