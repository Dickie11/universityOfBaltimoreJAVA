
import java.util.Scanner;
public class D_Dickens_COSC251_FALL2016_Project2 {
	private static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inventory.myInv.add(new Inventory("Dodge", "Dart", 5, 0, 101, 16000 ));
		Inventory.myInv.add(new Inventory("Nissan", "Versa", 5, 0, 102, 18000 ));
		Inventory.myInv.add(new Inventory("Toyota", "Camry", 5, 0, 103, 24000 ));
		Inventory.myInv.add(new Inventory("Jeep", "Wrangler", 5, 2, 104, 25000 ));
		Inventory.myInv.add(new Inventory("Dodge", "Caravan", 5, 4, 105, 26000 ));
		Inventory.myInv.add(new Inventory("Ford", "Ranger", 5, 2, 106, 20000 ));
		Inventory.myInv.add(new Inventory("Ford", "F150", 5, 2, 107, 27000 ));
		Inventory.myInv.add(new Inventory("Chevy", "Duramax", 5, 3, 108, 33000 ));
		Inventory.myInv.add(new Inventory("Volkswagon", "GTI", 5, 1, 109, 25000 ));
		Inventory.myInv.add(new Inventory("Nissan", "GTR", 5, 1, 110, 102000 ));
		
		String [] topMenu = new String[]{"Our Vewhicles","Tools","Specials","About Us","Contact Info", "Admin", "Exit Program"};
		
		String[][] menu = new String[][]{
			{"List of Vehicles", "Vehicle Chooser", "Go Back", "Exit Program"},
			{ "Schedule Test Drive", "Car Requests", "Go Back", "Exit Program"},
			{ "Sales Events", "Warrenty", "Go Back",  "Exit Program"},
			{"This Dealership", "Sales Team", "Go Back",  "Exit Program"},
			{"Email", "Phone Number", "Go Back",  "Exit Program"},
			{"Inventory", "Options", "Go Back", "Exit Program"},
			
		};
		
		
		
		System.out.printf("%s\n", "|                                                   DICKENS MOTORCARS                                                                                            |");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");

		handleUserChoice(topMenu, menu);
		
	}



	private static void handleUserChoice( String[] topMenu, String[][] menu) {
		int menuChoice = 0;
		boolean error = false;
		while(!error){
		printSingleLevelMenu(topMenu);
		int UserChoice = GetInt("Please Select one of the categories:");
			if(UserChoice==7){
				System.out.println("Thank you for using our program!");
				error=true;
			}else if(UserChoice>0 && UserChoice<7){
		String adminCat = topMenu[UserChoice-1];
		if(adminCat.equals("Admin")){
			adminLogin();
			
		}
		while(menuChoice!=4){
			
			printSingleLevelMenu(menu[UserChoice-1]);
			menuChoice = GetInt("Please Select one of the categories:");
					
			if (menuChoice==1 || menuChoice==2){
				handle(UserChoice, menuChoice,menu,topMenu);
			}else if(menuChoice==3){
				
				handleUserChoice(topMenu, menu) ;
			}
		}
		}else{
			System.out.println("Invalid Choice!");
		}
		
		}
	}
	public static int GetInt1(String Prompt){
		

		int myVal = 0;
		boolean validInput = false;
		
		while(!validInput){
			try
			{
				System.out.println(Prompt);
				myVal = Integer.parseInt(userInput.nextLine());
				if(myVal>0 && myVal<3){
					validInput = true;
				}else{
					System.out.println("Please enter 1 or 2: ");
				}
			}
			catch(NumberFormatException myNumFormatEx){
				System.out.println("You have entered an invalid number!");
			}
		}

		return myVal;
	}

	public static int GetInt(String Prompt){
		

		int myVal = 0;
		boolean validInput = false;
		
		while(!validInput){
			try
			{
				System.out.println(Prompt);
				myVal = Integer.parseInt(userInput.nextLine());
				validInput = true;
			}
			catch(NumberFormatException myNumFormatEx){
				System.out.println("You have entered an invalid number!");
			}
		}

		return myVal;
	}
	public static String getString(String myPrompt){
		System.out.println(myPrompt);
		return userInput.nextLine();
	}

	public static void handle(int userChoice, int menueChoice, String[][] menu, String[] topMenu) {
		
		String category = menu[userChoice-1][menueChoice-1];
		String adminCat = topMenu[userChoice-1];
		if (category.equals("Vehicle Chooser")){
			vehicleChooser();
			
		}else if(category.equals("List of Vehicles")){
			System.out.println(category+"\n Dodge Dart \n Nissan Versa \n Toyota Carmry \n Jeep Wrangler \n Dodge Caravan \n Ford Ranger \n Ford F150 \n Chevy Duramax \n Volkswagon GTI \n Nissan GTR");
		}else if(category.equals("Schedule Test Drive")){
			System.out.println(category+"\n");
			testDrive("Please enter the car you would like to test drive");
		}else if(category.equals("Car Requests")){
			String carRequests= getRequest();
			System.out.println("we will try out best to put a/an "+carRequests+" on our lot");
		}else if(category.equals("Sales Events")){
			System.out.println("We have no upcoming sales events");
		}else if(category.equals("Warrenty")){
			System.out.println("WE do offer warrenty, Please consult your sales associate");
		}else if(category.equals("This Dealership")){
			System.out.println("This Dealership was established in september of 2016 by David Dickens");
		}else if(category.equals("Sales Team")){
			System.out.println("Currently the only member of the sales team is David Dickens");
		}else if(category.equals("Email")){
			System.out.println("You can contact us by email at DickensMotorCars@car.com");
		}else if(category.equals("Phone Number")){
			System.out.println("You can contact us by phone at (443)444-4444");
		}else if(category.equals("Inventory")){
			
			
			for(int i = 0; i < Inventory.myInv.size(); i++){
				Inventory.myInv.get(i).printInv();
				System.out.println();
			
			}
		}else if(category.equals("Options")){
			System.out.println("Please select one of the following options: ");
			int arChoice = GetInt("1 - ADD Inventory\n2 - Remove Inventory\n3 - Edit Inventory\n4 - Search Inventory\n0 - Go Back");
			if(arChoice == 1){
				Inventory.myInv.add(new Inventory());
				
				
			}else if(arChoice==2){
				Inventory.removeInventory();
				
			}else if(arChoice==3){
				Inventory.modifyInventory();
			}else if(arChoice==4){
				Inventory.searchInv();
			}
		}
		
	}




	private static void adminLogin() {
		String adminPassword= "Admin";
		String passwordTry = "null";
		while(adminPassword.equals("Admin")!= passwordTry.equals("Admin")){
			System.out.println("Please Enter the Admin password");
			passwordTry= userInput.nextLine();
			if(adminPassword.equals("Admin")== passwordTry.equals("Admin")){
				System.out.println("Welcome Admin\n");
			
			}else{
			System.out.println("You have entered an incorect password");
			}
		}
		
		
	}
public static int getIndex() {
		
		int index = GetInt("please enter the number corresponding to the entry");
		return index;
	}


	private static String getRequest() {
		System.out.println("Please enter a car you would like us to put on our lot");
		String request= userInput.nextLine();
		return request;
	}


	private static void testDrive(String string) {
		boolean i = false;
		while(i != true){
		
			System.out.println(string);
			String testCar = userInput.nextLine();
			System.out.println("Please enter the date for you test drive: ");
			int testDay = GetInt("Please enter a day in number format:");
			int testMonth = GetInt("Please enter a Month in number format:");
			if(testDay>30 || testDay<1 && testMonth>12 || testMonth<1) {
				System.out.println("Please Enter a correct day and month");
				i = false;
			}else{
				i=true;
				System.out.println("Your test drive for the "+testCar+" Is scheduled for "+testMonth+"/"+testDay+".");
				
			}
		}
	}
	


	public static void printSingleLevelMenu(String[] menu){
		int Menuinput = -1;
		System.out.print("|");
		for( int i = 0; i<menu.length; i++){
			System.out.printf(" %-20s |", " "+(i+1)+" - "+menu[i]);
		}
		System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
	}

	
	private static void vehicleChooser() {
		int nissanPrice = 16000;
		
		int DodgePrice = 18000;
		
		int camryPrice = 24000;
		
		int WranglerPrice = 25000;
		
		int caravanPrice = 26000;
		
		int RangerPrice = 20000;
		
		int f150Price = 27000;
		
		int DuramaxPrice = 33000;
		
		int VolkswagonPrice = 25000;
		
		int GTRPrice = 102000;
		
		System.out.printf("---------------------------------------------------------------------------------------------------------------------------------------------\n");
		System.out.printf("| %-137s |\n", "                                                      DICKENS MOTORCARS");
		System.out.printf("---------------------------------------------------------------------------------------------------------------------------------------------\n");
		System.out.printf("| %-137s |\n", "Welcome to Dickens Motorcars, We are a certiefied auto dealer, deling in a variety of makes and models. This application will");
		System.out.printf("| %-137s |\n", "ask you a series of questions to help you pick your perfect vehicle.");
		System.out.printf("---------------------------------------------------------------------------------------------------------------------------------------------\n");
		System.out.printf("| %-137s |\n", " Please enter your Last name."); String Last = userInput.nextLine();
		System.out.printf("---------------------------------------------------------------------------------------------------------------------------------------------\n");
		System.out.printf("| %-137s |\n", " Please enter your estimated budget as a whole number."); int Budget = GetInt("");
		System.out.printf("---------------------------------------------------------------------------------------------------------------------------------------------\n");
		System.out.printf("| %-137s |\n", " Are you looking a a vehcle for a new driver, if yest type 1 if no type 2?"); int Q1 = GetInt1("");
		System.out.printf("---------------------------------------------------------------------------------------------------------------------------------------------\n");
			if (Q1 == 1)
			{	
				int Q11 =GetInt1(" Does your vehicle need great gas mileage?, if yest type 1 if no type 2?");
				if (Q11 == 1)
				{
					System.out.printf("| %-137s |\n", " You should buy a Nissan Versa, a four door sedan that seats up to 5 comfortably, and gets great gas mileage.");
					System.out.printf("| %-137s |\n", "The model of Nissan Versa we have has a price sticker of 16000.");
					System.out.printf("| %-137s |\n", "we have two options for dealer warrenties.");
					System.out.printf("| %-137s |\n", "Option 1: is a flat 30 day warrenty which costs $1,000.");
					System.out.printf("| %-137s |\n", "Option 2: is a 1 year 30,000 mile warrenty that costs $1,500 + 3% of the sales cost.");
					
				
					int warrenty = GetInt1("Would you like to purchase a dealer warrenty? enter 1 for yes, and 2 for no.");
					if (warrenty == 1)
					{
						
						int warrentOption = GetInt1("Which warrenty would you like? press 1 for option one, 2 for option 2, and 3 for option 3.");
						if (warrentOption == 1)
						{
							System.out.printf("| %-137s |\n", "The total cost of your Vehicle with warrenty option one will be: $ " + (nissanPrice + 1500));
						}
					}
					else if (warrenty == 2)
					{
						System.out.printf("| %-137s |\n", "The total cost of your Vehicle with warrenty option two will be: $ " + (nissanPrice * .03 )+nissanPrice+ 1500);
					}
					else 
					{
					System.out.printf("| %-137s |\n", "Congradualtations the Nissan Versa will be a perfect vehicle for you! It's current price is $ "+nissanPrice);
				
					}
				}
				
				else if (Q11 == 2)
				{
					int Q12 = GetInt1(" Does this vehicle need to go fast or have a great sound system?, if yest type 1 if no type 2?");
					if (Q12 == 1)
					{
						System.out.printf("| %-137s |\n", " You should buy a Dodge Dart, a two four door sedan that has good power and a great sound system and tech package.");
						System.out.printf("| %-137s |\n", "The model of Dodge Dart we have has a price sticker of 18000.");
						System.out.printf("| %-137s |\n", "We have two options for dealer warrenties.");
						System.out.printf("| %-137s |\n", "Option 1: is a flat 30 day warrenty which costs $1,000.");
						System.out.printf("| %-137s |\n", "Option 2: is a 1 year 30,000 mile warrenty that costs $1,500 + 3% of the sales cost.");
					
					
						int warrenty = GetInt1("Would you like to purchase a dealer warrenty? enter 1 for yes, and 2 for no.");
						if (warrenty == 1)
						{
						
							int warrentOption = GetInt1( "Which warrenty would you like? press 1 for option one, 2 for option 2, and 3 no warrenty.");
							if (warrentOption == 1)
							{
								System.out.printf("| %-137s |\n", "The total cost of your Vehicle with warrenty option one will be: $ " + (DodgePrice + 1500));
							}
						}
						else if (warrenty == 2)
						{
							System.out.printf("| %-137s |\n", "The total cost of your Vehicle with warrenty option two will be: $ " + (DodgePrice * .03 )+DodgePrice+ 1500);
						}
						else 
						{
						System.out.printf("| %-137s |\n", "Congradualtations the Dodge Dart will be a perfect vehicle for you! It's current price is $ "+DodgePrice);
						}
					}
					else if (Q12 ==2)
					{
						int Q13 = GetInt1(" Does this Vehicle need to last long term as a daily driver?, if yest type 1 if no type 2?");
						if (Q13 == 1)
						{
							System.out.printf("| %-137s |\n", " You should buy a Toyota Camry, a four door sedan with one of the best reliability ratings in its class.");
							System.out.printf("| %-137s |\n", "The model of Toyota Camry we have has a price sticker of $24000.");
							System.out.printf("| %-137s |\n", "We have two options for dealer warrenties.");
							System.out.printf("| %-137s |\n", "Option 1: is a flat 30 day warrenty which costs $1,000.");
							System.out.printf("| %-137s |\n", "Option 2: is a 1 year 30,000 mile warrenty that costs $1,500 + 3% of the sales cost.");
							
						
							int warrenty = GetInt1("Would you like to purchase a dealer warrenty? enter 1 for yes, and 2 for no.");
							if (warrenty == 1)
							{
					
								int warrentOption = GetInt1("Which warrenty would you like? press 1 for option one, 2 for option 2, and 3 no warrenty.");
								if (warrentOption == 1)
								{
									System.out.printf("| %-137s |\n", "The total cost of your Vehicle with warrenty option one will be: $ " + (camryPrice + 1500));
								}
							else if (warrenty == 2)
							{
								System.out.printf("| %-137s |\n", "The total cost of your Vehicle with warrenty option two will be: $ " + (camryPrice * .03 )+camryPrice+ 1500);
							}
							else 
							{
							System.out.printf("| %-137s |\n", "Congradualtations the Dodge Dart will be a perfect vehicle for you! It's current price is $ "+camryPrice);
							}
							}
						}
					}
			}}
			else if (Q1 == 2)
			{
				int Q2 = GetInt1("Do you need a vehicle that can traverse rough terrain or go off road?, if yest type 1 if no type 2?");
				if (Q2 == 1)
				{
					System.out.printf("| %-137s |\n", " You should buy a Jeep Wrangler, a compact and mid-sized truck with four wheel drive, rated for driving off road.");
					System.out.printf("| %-137s |\n", "The model of Jeep Wrangler we have has a price sticker of $25000.");
					System.out.printf("| %-137s |\n", "We have two options for dealer warrenties.");
					System.out.printf("| %-137s |\n", "Option 1: is a flat 30 day warrenty which costs $1,000.");
					System.out.printf("| %-137s |\n", "Option 2: is a 1 year 30,000 mile warrenty that costs $1,500 + 3% of the sales cost.");
					
				
					int warrenty = GetInt1("Would you like to purchase a dealer warrenty? enter 1 for yes, and 2 for no.");
					if (warrenty == 1)
					{
						
						int warrentOption = GetInt1("Which warrenty would you like? press 1 for option one, 2 for option 2, and 3 no warrenty.");
						if (warrentOption == 1)
						{
							System.out.printf("| %-137s |\n", "The total cost of your Vehicle with warrenty option one will be: $ " + (WranglerPrice + 1500));
						}
					}
					else if (warrenty == 2)
					{
						System.out.printf("| %-137s |\n", "The total cost of your Vehicle with warrenty option two will be: $ " + (WranglerPrice * .03 )+WranglerPrice+ 1500);
					}
					else 
					{
					System.out.printf("| %-137s |\n", "Congradualtations the Dodge Dart will be a perfect vehicle for you! It's current price is $ "+WranglerPrice);
				
					}
				}
			
				else if (Q2 ==2)
				{
					int Q3 = GetInt1("Do you need a vehicle that can Haul or Tow?, if yest type 1 if no type 2?");
					if (Q3 == 1 || Q3 ==2)
					{
						int Q31 = GetInt1("Will you be seldom hauling and towing, or just towing/haul small loads??, if yest type 1 if no type 2?");
						if (Q31 == 1)
						{
							System.out.printf("| %-137s |\n", " You should buy a Ford Ranger, a two door, small sized, 4 wheel drive pick up truck.");
							System.out.printf("| %-137s |\n", "The model of Ford Ranger we have has a price sticker of $20000.");
							System.out.printf("| %-137s |\n", "We have two options for dealer warrenties.");
							System.out.printf("| %-137s |\n", "Option 1: is a flat 30 day warrenty which costs $1,000.");
							System.out.printf("| %-137s |\n", "Option 2: is a 1 year 30,000 mile warrenty that costs $1,500 + 3% of the sales cost.");
		
						
							int warrenty = GetInt1("Would you like to purchase a dealer warrenty? enter 1 for yes, and 2 for no.");
							if (warrenty == 1)
							{
				
								int warrentOption = GetInt1("Which warrenty would you like? press 1 for option one, 2 for option 2, and 3 no warrenty.");
								if (warrentOption == 1)
								{
									System.out.printf("| %-137s |\n", "The total cost of your Vehicle with warrenty option one will be: $ " + (RangerPrice + 1500));
							}
						
							else if (warrenty == 2)
							{
								System.out.printf("| %-137s |\n", "The total cost of your Vehicle with warrenty option two will be: $ " + (RangerPrice * .03 )+RangerPrice+ 1500);
							}
							}
							else 
							{
							System.out.printf("| %-137s |\n", "Congradualtations the Ford Ranger will be a perfect vehicle for you! It's current price is $ "+RangerPrice);
						
							}
						}
						else if (Q31 == 2)
						{
							int Q32 = GetInt1("Do you need a vehicle that can haul or tow large loads and transport up to 5 people?, if yest type 1 if no type 2?");
							if (Q32 == 1)
							{
								System.out.printf("| %-137s |\n", " You should buy a Ford F150, a mid-sized truck that is 4 door and 4 wheel drive.");
								System.out.printf("| %-137s |\n", "The model of Ford F150 we have has a price sticker of $27000.");
								System.out.printf("| %-137s |\n", "We have two options for dealer warrenties.");
								System.out.printf("| %-137s |\n", "Option 1: is a flat 30 day warrenty which costs $1,000.");
								System.out.printf("| %-137s |\n", "Option 2: is a 1 year 30,000 mile warrenty that costs $1,500 + 3% of the sales cost.");
				
							
								int warrenty = GetInt1( "Would you like to purchase a dealer warrenty? enter 1 for yes, and 2 for no.");
								if (warrenty == 1)
								{
								
									int warrentOption = GetInt1("Which warrenty would you like? press 1 for option one, 2 for option 2, and 3 no warrenty.");
									if (warrentOption == 1)
									{
										System.out.printf("| %-137s |\n", "The total cost of your Vehicle with warrenty option one will be: $ " + (f150Price + 1500));
								}
							
								else if (warrenty == 2)
								{
									System.out.printf("| %-137s |\n", "The total cost of your Vehicle with warrenty option two will be: $ " + (f150Price * .03 )+f150Price+ 1500);
								}
								}
								else 
								{
								System.out.printf("| %-137s |\n", "Congradualtations the Ford F150 will be a perfect vehicle for you! It's current price is $ "+f150Price);
							
								}
							}
						
							else if (Q32 == 2)
							{
								int Q33 = GetInt1("Do you need a vehicle that can haul or tow large loads and transport up to 5 people?, if yest type 1 if no type 2?");
								if (Q33 == 1)
								{
									System.out.printf("| %-137s |\n", " You should buy a Chevy Duramax, a large truck that is 4 door and 4 wheel drive and can haul/tow huge loads.");
									System.out.printf("| %-137s |\n", "The model of Chevy Duramax we have has a price sticker of $33000.");
									System.out.printf("| %-137s |\n", "We have two options for dealer warrenties.");
									System.out.printf("| %-137s |\n", "Option 1: is a flat 30 day warrenty which costs $1,000.");
									System.out.printf("| %-137s |\n", "Option 2: is a 1 year 30,000 mile warrenty that costs $1,500 + 3% of the sales cost.");
									
								
									int warrenty = GetInt1("Would you like to purchase a dealer warrenty? enter 1 for yes, and 2 for no.");
									if (warrenty == 1)
									{
									
										int warrentOption = GetInt1("Which warrenty would you like? press 1 for option one, 2 for option 2, and 3 no warrenty.");
										if (warrentOption == 1)
										{
											System.out.printf("| %-137s |\n", "The total cost of your Vehicle with warrenty option one will be: $ " + (DuramaxPrice + 1500));
										}
									}
									else if (warrenty == 2)
									{
										System.out.printf("| %-137s |\n", "The total cost of your Vehicle with warrenty option two will be: $ " + (DuramaxPrice * .03 )+DuramaxPrice+ 1500);
									}
									else 
									{
									System.out.printf("| %-137s |\n", "Congradualtations the Chevy Duramax will be a perfect vehicle for you! It's current price is $ "+DuramaxPrice);
									}
								}	
							
							
							else if (Q33 == 2)
								{
									int Q4 = GetInt1("Do you need a vehicle that can transport up to 8 people?, if yest type 1 if no type 2?");
									if (Q4 == 1)
									{
										System.out.printf("| %-137s |\n", " You should buy a Dodge Caravan, a Van with 4 doors that has seating for 8.");
										System.out.printf("| %-137s |\n", "The model of Dodge Caravan we have has a price sticker of $26000.");
										System.out.printf("| %-137s |\n", "We have two options for dealer warrenties.");
										System.out.printf("| %-137s |\n", "Option 1: is a flat 30 day warrenty which costs $1,000.");
										System.out.printf("| %-137s |\n", "Option 2: is a 1 year 30,000 mile warrenty that costs $1,500 + 3% of the sales cost.");
										 
									
										int warrenty = GetInt1("Would you like to purchase a dealer warrenty? enter 1 for yes, and 2 for no.");
										if (warrenty == 1)
										{
						
											int warrentOption = GetInt1("Which warrenty would you like? press 1 for option one, 2 for option 2, and 3 no warrenty.");
											if (warrentOption == 1)
											{
												System.out.printf("| %-137s |\n", "The total cost of your Vehicle with warrenty option one will be: $ " + (caravanPrice + 1500));
											}
										}
										else if (warrenty == 2)
										{
											System.out.printf("| %-137s |\n", "The total cost of your Vehicle with warrenty option two will be: $ " + (caravanPrice * .03 )+caravanPrice+ 1500);
										}
										else 
										{
										System.out.printf("| %-137s |\n", "Congradualtations the Dodge Caravan will be a perfect vehicle for you! It's current price is $ "+caravanPrice);
										}
									}
								else if (Q4 == 2)
								{
									int Q5 = GetInt1("Do you need a vehicle with High Performance?, if yest type 1 if no type 2?");
									if (Q5 == 1)
									{
											int Q51 = GetInt1("Do you need a vehicle that is fast 0-60 mph with reliable mechanics?, if yest type 1 if no type 2?");
											if (Q51 == 1)
											{
												System.out.printf("| %-137s |\n", " You should buy a Volkswagon GTI, a 2 door hatchback that is turbocharged.");
												System.out.printf("| %-137s |\n", "The model of Volkswagon GTI we have has a price sticker of $25000.");
												System.out.printf("| %-137s |\n", "We have two options for dealer warrenties.");
												System.out.printf("| %-137s |\n", "Option 1: is a flat 30 day warrenty which costs $1,000.");
												System.out.printf("| %-137s |\n", "Option 2: is a 1 year 30,000 mile warrenty that costs $1,500 + 3% of the sales cost.");
								
											
												int warrenty = GetInt1("Would you like to purchase a dealer warrenty? enter 1 for yes, and 2 for no.");
												if (warrenty == 1)
												{
													
													int warrentOption = GetInt1( "Which warrenty would you like? press 1 for option one, 2 for option 2, and 3 no warrenty.");
													if (warrentOption == 1)
													{
														System.out.printf("| %-137s |\n", "The total cost of your Vehicle with warrenty option one will be: $ " + (VolkswagonPrice + 1500));
													}
												}
												else if (warrenty == 2)
												{
													System.out.printf("| %-137s |\n", "The total cost of your Vehicle with warrenty option two will be: $ " + (VolkswagonPrice * .03 )+VolkswagonPrice+ 1500);
												}
												else 
												{
												System.out.printf("| %-137s |\n", "Congradualtations the Volkswagon GTI will be a perfect vehicle for you! It's current price is $ "+VolkswagonPrice);
												}
											}
												else if (Q51 == 2)
												{
													int Q52 = GetInt1("Do you need a vehicle that is fast 0-60 mph with reliable mechanics?, if yest type 1 if no type 2?");
													if (Q52 == 1)
													{
														System.out.printf("| %-137s |\n", " You should buy a Nissan GTR, a 2 door sportcar with a twin turbo v6 engine.");
														System.out.printf("| %-137s |\n", "The model of Nissan GTR we have has a price sticker of $102000.");
														System.out.printf("| %-137s |\n", "We have two options for dealer warrenties.");
														System.out.printf("| %-137s |\n", "Option 1: is a flat 30 day warrenty which costs $1,000.");
														System.out.printf("| %-137s |\n", "Option 2: is a 1 year 30,000 mile warrenty that costs $1,500 + 3% of the sales cost.");
														
													
														int warrenty = GetInt1("Would you like to purchase a dealer warrenty? enter 1 for yes, and 2 for no.");
														if (warrenty == 1)
														{
														
															int warrentOption = GetInt1("Which warrenty would you like? press 1 for option one, 2 for option 2, and 3 no warrenty.");
															if (warrentOption == 1)
															{
																System.out.printf("| %-137s |\n", "The total cost of your Vehicle with warrenty option one will be: $ " + (GTRPrice + 1500));
															}
														}
														else if (warrenty == 2)
														{
															System.out.printf("| %-137s |\n", "The total cost of your Vehicle with warrenty option two will be: $ " + (GTRPrice * .03 )+VolkswagonPrice+ 1500);
														}
														else 
														{
														System.out.printf("| %-137s |\n", "Congradualtations the Nissan GTR will be a perfect vehicle for you! It's current price is $ "+GTRPrice);
														}
													}
												}
									}
									else{
										System.out.println("Unfortunatly we do not have a vehicle that Fits your Needs");
									}
		}
			}
			
		
		
}
}}}}}}
