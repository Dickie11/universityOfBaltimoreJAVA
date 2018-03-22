import java.util.Scanner;

public class D_Dickens_COSC_FALL2016_Project1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner userInput = new Scanner(System.in);
		
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
		System.out.printf("| %-137s |\n", " Please enter your estimated budget as a whole number."); int Budget = userInput.nextInt();
		System.out.printf("---------------------------------------------------------------------------------------------------------------------------------------------\n");
		System.out.printf("| %-137s |\n", " Are you looking a a vehcle for a new driver, if yest type 1 if no type 2?"); int Q1 = userInput.nextInt();
		System.out.printf("---------------------------------------------------------------------------------------------------------------------------------------------\n");
			if (Q1 == 1)
			{	
				System.out.printf("| %-137s |\n", " Does your vehicle need great gas mileage?, if yest type 1 if no type 2?"); int Q11 = userInput.nextInt();
				if (Q11 == 1)
				{
					System.out.printf("| %-137s |\n", " You should buy a Nissan Versa, a four door sedan that seats up to 5 comfortably, and gets great gas mileage.");
					System.out.printf("| %-137s |\n", "The model of Nissan Versa we have has a price sticker of 16000.");
					System.out.printf("| %-137s |\n", "we have two options for dealer warrenties.");
					System.out.printf("| %-137s |\n", "Option 1: is a flat 30 day warrenty which costs $1,000.");
					System.out.printf("| %-137s |\n", "Option 2: is a 1 year 30,000 mile warrenty that costs $1,500 + 3% of the sales cost.");
					System.out.printf("| %-137s |\n", "Would you like to purchase a dealer warrenty? enter 1 for yes, and 2 for no."); 
				
					int warrenty = userInput.nextInt();
					if (warrenty == 1)
					{
						System.out.printf("| %-137s |\n", "Which warrenty would you like? press 1 for option one, 2 for option 2, and 3 for option 3.");
						int warrentOption = userInput.nextInt();
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
					System.out.printf("| %-137s |\n", " Does this vehicle need to go fast or have a great sound system?, if yest type 1 if no type 2?"); int Q12 = userInput.nextInt();
					if (Q12 == 1)
					{
						System.out.printf("| %-137s |\n", " You should buy a Dodge Dart, a two four door sedan that has good power and a great sound system and tech package.");
						System.out.printf("| %-137s |\n", "The model of Dodge Dart we have has a price sticker of 18000.");
						System.out.printf("| %-137s |\n", "We have two options for dealer warrenties.");
						System.out.printf("| %-137s |\n", "Option 1: is a flat 30 day warrenty which costs $1,000.");
						System.out.printf("| %-137s |\n", "Option 2: is a 1 year 30,000 mile warrenty that costs $1,500 + 3% of the sales cost.");
						System.out.printf("| %-137s |\n", "Would you like to purchase a dealer warrenty? enter 1 for yes, and 2 for no."); 
					
						int warrenty = userInput.nextInt();
						if (warrenty == 1)
						{
							System.out.printf("| %-137s |\n", "Which warrenty would you like? press 1 for option one, 2 for option 2, and 3 no warrenty.");
							int warrentOption = userInput.nextInt();
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
						System.out.printf("| %-137s |\n", " Does this Vehicle need to last long term as a daily driver?, if yest type 1 if no type 2?"); int Q13 = userInput.nextInt();
						if (Q13 == 1)
						{
							System.out.printf("| %-137s |\n", " You should buy a Toyota Camry, a four door sedan with one of the best reliability ratings in its class.");
							System.out.printf("| %-137s |\n", "The model of Toyota Camry we have has a price sticker of $24000.");
							System.out.printf("| %-137s |\n", "We have two options for dealer warrenties.");
							System.out.printf("| %-137s |\n", "Option 1: is a flat 30 day warrenty which costs $1,000.");
							System.out.printf("| %-137s |\n", "Option 2: is a 1 year 30,000 mile warrenty that costs $1,500 + 3% of the sales cost.");
							System.out.printf("| %-137s |\n", "Would you like to purchase a dealer warrenty? enter 1 for yes, and 2 for no."); 
						
							int warrenty = userInput.nextInt();
							if (warrenty == 1)
							{
								System.out.printf("| %-137s |\n", "Which warrenty would you like? press 1 for option one, 2 for option 2, and 3 no warrenty.");
								int warrentOption = userInput.nextInt();
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
			}
			else if (Q1 == 2)
			{
				System.out.printf("| %-137s |\n", "Do you need a vehicle that can traverse rough terrain or go off road?, if yest type 1 if no type 2?"); int Q2 = userInput.nextInt();
				if (Q2 == 1)
				{
					System.out.printf("| %-137s |\n", " You should buy a Jeep Wrangler, a compact and mid-sized truck with four wheel drive, rated for driving off road.");
					System.out.printf("| %-137s |\n", "The model of Jeep Wrangler we have has a price sticker of $25000.");
					System.out.printf("| %-137s |\n", "We have two options for dealer warrenties.");
					System.out.printf("| %-137s |\n", "Option 1: is a flat 30 day warrenty which costs $1,000.");
					System.out.printf("| %-137s |\n", "Option 2: is a 1 year 30,000 mile warrenty that costs $1,500 + 3% of the sales cost.");
					System.out.printf("| %-137s |\n", "Would you like to purchase a dealer warrenty? enter 1 for yes, and 2 for no."); 
				
					int warrenty = userInput.nextInt();
					if (warrenty == 1)
					{
						System.out.printf("| %-137s |\n", "Which warrenty would you like? press 1 for option one, 2 for option 2, and 3 no warrenty.");
						int warrentOption = userInput.nextInt();
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
					System.out.printf("| %-137s |\n", "Do you need a vehicle that can Haul or Tow?, if yest type 1 if no type 2?"); int Q3 = userInput.nextInt();
					if (Q3 == 1)
					{
						System.out.printf("| %-137s |\n", "Will you be seldom hauling and towing, or just towing/haul small loads??, if yest type 1 if no type 2?"); int Q31 = userInput.nextInt();
						if (Q31 == 1)
						{
							System.out.printf("| %-137s |\n", " You should buy a Ford Ranger, a two door, small sized, 4 wheel drive pick up truck.");
							System.out.printf("| %-137s |\n", "The model of Ford Ranger we have has a price sticker of $20000.");
							System.out.printf("| %-137s |\n", "We have two options for dealer warrenties.");
							System.out.printf("| %-137s |\n", "Option 1: is a flat 30 day warrenty which costs $1,000.");
							System.out.printf("| %-137s |\n", "Option 2: is a 1 year 30,000 mile warrenty that costs $1,500 + 3% of the sales cost.");
							System.out.printf("| %-137s |\n", "Would you like to purchase a dealer warrenty? enter 1 for yes, and 2 for no."); 
						
							int warrenty = userInput.nextInt();
							if (warrenty == 1)
							{
								System.out.printf("| %-137s |\n", "Which warrenty would you like? press 1 for option one, 2 for option 2, and 3 no warrenty.");
								int warrentOption = userInput.nextInt();
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
							System.out.printf("| %-137s |\n", "Do you need a vehicle that can haul or tow large loads and transport up to 5 people?, if yest type 1 if no type 2?"); int Q32 = userInput.nextInt();
							if (Q32 == 1)
							{
								System.out.printf("| %-137s |\n", " You should buy a Ford F150, a mid-sized truck that is 4 door and 4 wheel drive.");
								System.out.printf("| %-137s |\n", "The model of Ford F150 we have has a price sticker of $27000.");
								System.out.printf("| %-137s |\n", "We have two options for dealer warrenties.");
								System.out.printf("| %-137s |\n", "Option 1: is a flat 30 day warrenty which costs $1,000.");
								System.out.printf("| %-137s |\n", "Option 2: is a 1 year 30,000 mile warrenty that costs $1,500 + 3% of the sales cost.");
								System.out.printf("| %-137s |\n", "Would you like to purchase a dealer warrenty? enter 1 for yes, and 2 for no."); 
							
								int warrenty = userInput.nextInt();
								if (warrenty == 1)
								{
									System.out.printf("| %-137s |\n", "Which warrenty would you like? press 1 for option one, 2 for option 2, and 3 no warrenty.");
									int warrentOption = userInput.nextInt();
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
								System.out.printf("| %-137s |\n", "Do you need a vehicle that can haul or tow large loads and transport up to 5 people?, if yest type 1 if no type 2?"); int Q33 = userInput.nextInt();
								if (Q33 == 1)
								{
									System.out.printf("| %-137s |\n", " You should buy a Chevy Duramax, a large truck that is 4 door and 4 wheel drive and can haul/tow huge loads.");
									System.out.printf("| %-137s |\n", "The model of Chevy Duramax we have has a price sticker of $33000.");
									System.out.printf("| %-137s |\n", "We have two options for dealer warrenties.");
									System.out.printf("| %-137s |\n", "Option 1: is a flat 30 day warrenty which costs $1,000.");
									System.out.printf("| %-137s |\n", "Option 2: is a 1 year 30,000 mile warrenty that costs $1,500 + 3% of the sales cost.");
									System.out.printf("| %-137s |\n", "Would you like to purchase a dealer warrenty? enter 1 for yes, and 2 for no."); 
								
									int warrenty = userInput.nextInt();
									if (warrenty == 1)
									{
										System.out.printf("| %-137s |\n", "Which warrenty would you like? press 1 for option one, 2 for option 2, and 3 no warrenty.");
										int warrentOption = userInput.nextInt();
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
									System.out.printf("| %-137s |\n", "Do you need a vehicle that can transport up to 8 people?, if yest type 1 if no type 2?"); int Q4 = userInput.nextInt();
									if (Q4 == 1)
									{
										System.out.printf("| %-137s |\n", " You should buy a Dodge Caravan, a Van with 4 doors that has seating for 8.");
										System.out.printf("| %-137s |\n", "The model of Dodge Caravan we have has a price sticker of $26000.");
										System.out.printf("| %-137s |\n", "We have two options for dealer warrenties.");
										System.out.printf("| %-137s |\n", "Option 1: is a flat 30 day warrenty which costs $1,000.");
										System.out.printf("| %-137s |\n", "Option 2: is a 1 year 30,000 mile warrenty that costs $1,500 + 3% of the sales cost.");
										System.out.printf("| %-137s |\n", "Would you like to purchase a dealer warrenty? enter 1 for yes, and 2 for no."); 
									
										int warrenty = userInput.nextInt();
										if (warrenty == 1)
										{
											System.out.printf("| %-137s |\n", "Which warrenty would you like? press 1 for option one, 2 for option 2, and 3 no warrenty.");
											int warrentOption = userInput.nextInt();
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
									System.out.printf("| %-137s |\n", "Do you need a vehicle with High Performance?, if yest type 1 if no type 2?"); int Q5 = userInput.nextInt();
									if (Q5 == 1)
									{
											System.out.printf("| %-137s |\n", "Do you need a vehicle that is fast 0-60 mph with reliable mechanics?, if yest type 1 if no type 2?"); int Q51 = userInput.nextInt();
											if (Q51 == 1)
											{
												System.out.printf("| %-137s |\n", " You should buy a Volkswagon GTI, a 2 door hatchback that is turbocharged.");
												System.out.printf("| %-137s |\n", "The model of Volkswagon GTI we have has a price sticker of $25000.");
												System.out.printf("| %-137s |\n", "We have two options for dealer warrenties.");
												System.out.printf("| %-137s |\n", "Option 1: is a flat 30 day warrenty which costs $1,000.");
												System.out.printf("| %-137s |\n", "Option 2: is a 1 year 30,000 mile warrenty that costs $1,500 + 3% of the sales cost.");
												System.out.printf("| %-137s |\n", "Would you like to purchase a dealer warrenty? enter 1 for yes, and 2 for no."); 
											
												int warrenty = userInput.nextInt();
												if (warrenty == 1)
												{
													System.out.printf("| %-137s |\n", "Which warrenty would you like? press 1 for option one, 2 for option 2, and 3 no warrenty.");
													int warrentOption = userInput.nextInt();
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
													System.out.printf("| %-137s |\n", "Do you need a vehicle that is fast 0-60 mph with reliable mechanics?, if yest type 1 if no type 2?"); int Q52 = userInput.nextInt();
													if (Q52 == 1)
													{
														System.out.printf("| %-137s |\n", " You should buy a Nissan GTR, a 2 door sportcar with a twin turbo v6 engine.");
														System.out.printf("| %-137s |\n", "The model of Nissan GTR we have has a price sticker of $102000.");
														System.out.printf("| %-137s |\n", "We have two options for dealer warrenties.");
														System.out.printf("| %-137s |\n", "Option 1: is a flat 30 day warrenty which costs $1,000.");
														System.out.printf("| %-137s |\n", "Option 2: is a 1 year 30,000 mile warrenty that costs $1,500 + 3% of the sales cost.");
														System.out.printf("| %-137s |\n", "Would you like to purchase a dealer warrenty? enter 1 for yes, and 2 for no."); 
													
														int warrenty = userInput.nextInt();
														if (warrenty == 1)
														{
															System.out.printf("| %-137s |\n", "Which warrenty would you like? press 1 for option one, 2 for option 2, and 3 no warrenty.");
															int warrentOption = userInput.nextInt();
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
			}
			
		
		
}
}}}}}}}}
