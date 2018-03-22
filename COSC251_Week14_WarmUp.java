import java.util.ArrayList;
import java.util.Scanner;

public class COSC251_Week14_WarmUp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		FamilyMember.myFamily.add(new FamilyMember("Lisa", "Simpson", 8, 1));
		FamilyMember.myFamily.add(new FamilyMember("Maggie", "Simpson", 1, 1));
		FamilyMember.myFamily.add(new FamilyMember("Bart", "Simpson", 10, 0));
		FamilyMember.myFamily.add(new FamilyMember("Homer", "Simpson", 39, 3));
		FamilyMember.myFamily.add(new FamilyMember("Marge", "Simpson", 34, 2));
		FamilyMember.myFamily.add(new FamilyMember("Abe", "Simpson", 82, 4));
					
		System.out.println(FamilyMember.myFamily.get(0).toString());
		System.out.println(FamilyMember.myFamily.get(0).getClass());
		System.out.println(FamilyMember.myFamily.get(0).hashCode());
		/*
		Warm up:
			Create a non-static method in the FamilyMember class called toString().  
			Instead of printing out the family member's information, 
			it will return the identifying information as a string.  
			The information should be formatted so it would be displayed as 1 line if it were printed out.
			
		 
		Exercise 1:
			Move the array list so that it is part of the FamilyMember class.
			This should serve as a master list of all the instances of the class.
			Move the code for listing and deleting member so they are methods of the class.
			Modify any necessary parts of the code to make the program work.
			
		    
		Exercise 2:
			Add a menu option that lets the user modify an existing entry.
		
		Exercise 3:
			Add a menu option that allows the user to search by category.
		
		 /**/
		
		int userOption = -1;
		while(userOption != 0){
			
			System.out.println("Please pick from on of the following options:");
			System.out.println("1 - list items");
			System.out.println("2 - add item");
			System.out.println("3 - delete item");
			System.out.println("4 - edit item");
			System.out.println("5 - search items");
			System.out.println("0 - exit");
			
			userOption = MyHelper.getInt("Pick one:");
			
			switch(userOption){
				case 1:

					FamilyMember.listAll();
					
					break;
				case 2:
					//System.out.println("you chose 2!");

					FamilyMember.myFamily.add(new FamilyMember());
					break;
				case 3:
					//System.out.println("you chose 3!");
					FamilyMember.removeMember();
					break;
				case 4:
					//System.out.println("you chose 4!");
					FamilyMember.editMember();
					break;
				case 5:
					//System.out.println("you chose 5!");
					FamilyMember.searchMember();
					break;
				case 0:
					System.out.println("goodbye!");
					break;
				default:
					System.out.println("Invalid option.");
					break;
			}
			
		}
		
		
	}
	

}

class FamilyMember{

	public static ArrayList<FamilyMember> myFamily = new ArrayList<FamilyMember>(); 
	
	private String firstName;
	private String lastName;
	private int age;
	private int role;
	
	private static String[] allRoles = new String[]{"son","daughter", "mom", "dad", "grandpa", "grandma"};
	
	public FamilyMember(){
		firstName = MyHelper.getString("Please enter the first name of the member you are adding:");
		lastName = MyHelper.getString("Please enter the last name of the member you are adding:");
	    age = MyHelper.getInt("Please enter the age of the member you are adding:");
	    setRole();
	}
	
	public FamilyMember(String fName, String lName, int myAge, int roleNum){
		firstName = fName;
		lastName = lName;
		age = myAge;
		role = roleNum;
	}
	
	public String toString(){
		return String.format("|%15s|%15s|%5d|%10s| ", firstName, lastName, age, FamilyMember.allRoles[this.role]);
	}
	
	public void aboutMe(){
		System.out.println("My name is " + this.firstName + " " + this.lastName);
		System.out.println("I am " + this.age + " years old.");
		System.out.println("I am the " + FamilyMember.allRoles[this.role] + " in the family.");
	}
	
	public static void listAll(){
		System.out.printf("|%15s|%15s|%5s|%10s|%n", "first name", "last name", "age", "role");
		System.out.printf("|%15s|%15s|%5s|%10s|%n", "---------------", "---------------", "-----", "----------");
		
		for(int i = 0; i < myFamily.size(); i++){
			
			System.out.println(myFamily.get(i).toString());
		}
	}
	
	public static void removeMember(){
		int delChoice = -1;
		int verifyDel = 0;
		while (verifyDel != 1){
			System.out.println("Pick a member to delete or press 0 to go back!");

			for(int i = 0; i < FamilyMember.myFamily.size(); i++){
				System.out.println((i + 1) + " - " + FamilyMember.myFamily.get(i).getName());
			}
			delChoice = MyHelper.getInt("Pick the item to remove:") - 1;
			
			if (delChoice >=0 && delChoice < FamilyMember.myFamily.size()){
				System.out.println("Are you sure you want to delete " + FamilyMember.myFamily.get(delChoice).getName());
				verifyDel = MyHelper.getInt("1 - yes \n2 - no");
			}
			else{
				if(delChoice == -1){
					verifyDel = 1;
				}
				else{
				System.out.println("Invalid selection!");
				}
			}
		}
		
		if(delChoice >=0 && delChoice < FamilyMember.myFamily.size()){
			FamilyMember.myFamily.remove(delChoice);
		}
	}
	

	public static void editMember(){
		int editChoice = -1;
		int verifyEdit = 0;
		while (verifyEdit != 1){
			System.out.println("Pick a member to edit or press 0 to go back!");

			for(int i = 0; i < FamilyMember.myFamily.size(); i++){
				System.out.println((i + 1) + " - " + FamilyMember.myFamily.get(i).toString());
			}
			
			editChoice = MyHelper.getInt("Pick the item to edit:") - 1;
			
			if (editChoice >=0 && editChoice < FamilyMember.myFamily.size()){
				System.out.println("Are you sure you want to edit " + FamilyMember.myFamily.get(editChoice).getName());
				verifyEdit = MyHelper.getInt("1 - yes \n2 - no");
			}
			else{
				if(editChoice == -1){
					verifyEdit = 1;
				}
				else{
				System.out.println("Invalid selection!");
				}
			}
		}
		
		
		if(editChoice >=0 && editChoice < FamilyMember.myFamily.size()){
			FamilyMember.myFamily.get(editChoice).changeValues();
		}
	}
	
	public static void searchMember(){
		int userOption = -1;
		String stringVal;
		int intVal;
		boolean foundVal = false;
		while(userOption != 0){
			foundVal = false;
			System.out.println("Please pick an attribute that you want to search for:");
			System.out.println("1 - first name");
			System.out.println("2 - last name");
			System.out.println("3 - age");
			System.out.println("4 - role");
			System.out.println("0 - done");
			
			userOption = MyHelper.getInt("Pick one:");
			
			switch(userOption){
				case 1:
					stringVal = MyHelper.getString("Enter the name you want to search for:");

					for(int i = 0; i < myFamily.size(); i++){
						if(stringVal.equalsIgnoreCase(myFamily.get(i).firstName)){
							System.out.println(myFamily.get(i).toString());
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
					//System.out.println("you chose 2!");
					stringVal = MyHelper.getString("Enter the last name you want to search for:");

					for(int i = 0; i < myFamily.size(); i++){
						if(stringVal.equalsIgnoreCase(myFamily.get(i).lastName)){
							System.out.println(myFamily.get(i).toString());
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
					//System.out.println("you chose 3!");
					intVal = MyHelper.getInt("Enter the age you want to search for:");

					for(int i = 0; i < myFamily.size(); i++){
						if(intVal == myFamily.get(i).age){
							System.out.println(myFamily.get(i).toString());
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
					String myPrompt = "Please choose the role you want to search for:\n";
					for (int i=0; i < FamilyMember.allRoles.length ;i++){
						myPrompt += (i+1) + ") " + FamilyMember.allRoles[i] + "\n";
					}
					
					intVal = MyHelper.getInt(myPrompt);
					
					
					for(int i = 0; i < myFamily.size(); i++){
						if((intVal-1) == myFamily.get(i).role){
							System.out.println(myFamily.get(i).toString());
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
	
	public void changeValues(){
		//System.out.println("Nothing was changed, this is a test.");
		int userOption = -1;
		while(userOption != 0){
			
			System.out.println("Please pick an attribute that you want to edit for " + getName() + ":");
			System.out.println("1 - first name");
			System.out.println("2 - last name");
			System.out.println("3 - age");
			System.out.println("4 - role");
			System.out.println("0 - done");
			
			userOption = MyHelper.getInt("Pick one:");
			
			switch(userOption){
				case 1:

					setFirstName(MyHelper.getString("Please enter the new first name:"));
					
					break;
				case 2:
					//System.out.println("you chose 2!");

					setLastName(MyHelper.getString("Please enter the new last name:"));
					
					break;
				case 3:
					//System.out.println("you chose 3!");
					setAge(MyHelper.getInt("Please enter a new age:"));
					break;
				case 4:
					//System.out.println("you chose 4!");
					setRole();
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
	
	public String getName(){
		return firstName + " " + lastName;
	} 
	
	public void setName(String first, String last){
		this.firstName = first;
		this.lastName = last;
		
	}
	
	public void setFirstName(String first){
		this.firstName = first;
		
	}
	
	public void setLastName(String last){
		this.lastName = last;
		
	}
	
	public void setAge(int famAge){
		this.age = famAge;
		
	}
	
	public void setRole(){
		boolean validInput = false;
			String myPrompt = "Please choose the role of " + this.firstName + " " + this.lastName + " from the following choices:\n";
			for (int i=0; i < FamilyMember.allRoles.length;i++){
				myPrompt += (i+1) + ") " + FamilyMember.allRoles[i] + "\n";
			}

		while (!validInput){
			this.role = MyHelper.getInt(myPrompt)-1;
			if (this.role>=0 && this.role<FamilyMember.allRoles.length){
				validInput=true;
			}else{
				System.out.println("You did not choose a valid option.");
			}
		}
		
	}
}


class MyHelper {
	
	public static Scanner myInput = new Scanner(System.in);
	
	public static int getInt(String myPrompt){
		int myInt = 0;
		boolean isValid = false;
		
		while(!isValid){
			try{
				System.out.println(myPrompt);
				myInt = Integer.parseInt(myInput.nextLine());
				isValid = true;
			}
			catch(NumberFormatException NFE){
	
				System.out.println("You did not enter an integer.");
				
			}
		}
		
		return myInt;
	}//End getIntMethod
	
	public static String getString(String myPrompt){
		System.out.println(myPrompt);
		return myInput.nextLine();
	}//End getString method
	
	//End MyHelper Class
}




