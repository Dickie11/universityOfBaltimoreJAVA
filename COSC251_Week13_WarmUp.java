import java.util.ArrayList;
import java.util.Scanner;

public class COSC251_Week13_WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<FamilyMember> myFamily = new ArrayList<FamilyMember>(); 

		myFamily.add(new FamilyMember("Lisa", "Simpson", 8, 1));
		myFamily.add(new FamilyMember("Maggie", "Simpson", 1, 1));
		myFamily.add(new FamilyMember("Bart", "Simpson", 10, 0));
		myFamily.add(new FamilyMember("Homer", "Simpson", 39, 3));
		myFamily.add(new FamilyMember("Marge", "Simpson", 34, 2));
		myFamily.add(new FamilyMember("Abe", "Simpson", 82, 4));
					
		
		
		/*
		Warm up:
			The myFamily array list is being filled with family members,
			create a FamilyMember constructor that accepts the given 
			parameters so that the family members are created correctly.
		 
		Exercise 1:
			Create a default constructor that gives the user an interface to create a new 
			family member.  Use error handling to account for incorrect user input.
			
		Exercise 2:
			Create an interface that gives the user some options for manipulating the data.
			1 option should be to show all of the entries
			1 option should be to add a new entry
			1 option should be to delete an entry
		    
		Exercise 3:
			Add a menu option that lets the user modify an existing entry.
		
		Exercise 4:
			Add a menu option that allows the user to search by category.
		
		 /**/
		
		int userOption = -1;
		while(userOption != 0){
			
			System.out.println("Please pick from on of the following options:");
			System.out.println("1 - list items");
			System.out.println("2 - add item");
			System.out.println("3 - delete item");
			System.out.println("0 - exit");
			
			userOption = MyHelper.getInt("Pick one:");
			
			switch(userOption){
				case 1:

					for(int i = 0; i < myFamily.size(); i++){
						myFamily.get(i).aboutMe();
						System.out.println();
					}
					break;
				case 2:
					//System.out.println("you chose 2!");

					myFamily.add(new FamilyMember());
					break;
				case 3:
					//System.out.println("you chose 3!");
					int delChoice = -1;
					int verifyDel = 0;
					while (verifyDel != 1){
						System.out.println("Pick a member to delete or press 0 to go back!");

						for(int i = 0; i < myFamily.size(); i++){
							System.out.println((i + 1) + " - " + myFamily.get(i).getName());
						}
						delChoice = MyHelper.getInt("Pick the item to remove:") - 1;
						
						if (delChoice >=0 && delChoice < myFamily.size()){
							System.out.println("Are you sure you want to delete " + myFamily.get(delChoice).getName());
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
					
					if(delChoice >=0 && delChoice < myFamily.size()){
						myFamily.remove(delChoice);
					}
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
	
	public void aboutMe(){
		System.out.println("My name is " + this.firstName + " " + this.lastName);
		System.out.println("I am " + this.age + " years old.");
		System.out.println("I am the " + FamilyMember.allRoles[this.role] + " in the family.");
	}
	
	public String getName(){
		return firstName + " " + lastName;
	} 
	
	public void setName(String first, String last){
		this.firstName = first;
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




