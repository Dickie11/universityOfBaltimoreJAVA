public class COSC251_Week12_Warm_Up{
	public static void main(String[] args) {
	/*
	 * Week 12 - classes and objects
	 * 
	 * Warm Up
	 * 
	 * This program has a class below called BankAccount
	 * 
	 * Create a new instance of an object of datatype BankAccount.
	 * 
	 * Print out the default accountName of the instance.
	 * 
	 * Assign it a new accountName of "Savings Account" using the setName method.
	 *  
	 *  Print out that new name.
	 *  Print out the bankName.
	 * 
	 * 
	 */
	BankAccount BankAccountinstance01= new BankAccount();
	String Accountname;
	Accountname=BankAccountinstance01.getName();
	System.out.println(Accountname);
	BankAccountinstance01.setName("SavingsAccount");
	Accountname=BankAccountinstance01.getName();
	System.out.println(Accountname);
	System.out.println(BankAccount.bankName);
	}
}

class BankAccount
{
   private String accountName; // instance variable
 
   public static String bankName = "MD Savings and Loans";
   
   // method to set the name in the object              
   public void setName(String newName)      
   {                                             
      this.accountName = newName; // store the name
   }         

   // method to retrieve the name from the object
   public String getName()        
   {                                    
      return accountName; // return value of name to caller        
   }         
} // end class BankAccount

