public class COSC251_Week_10_Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Week 10 Arrays
		 * 
		 * Exercise 1
		 * 
		 * Multi-dimensional arrays are arrays that contain multiple arrays
		 *
		 * The code for creating arrays is similar to single dimensional array
		 * Here is an example of a 2 dimensional array
		*/
		
		
		
		String[][] authors = new String[][]{
			{"Stephen King", "H. P. Lovecraft", "Peter Straub"},               //authors[0]
			{"Danielle Steel", "Agatha Cristie", "Arthur Conan Doyle"},        //authors[1]
			{"J. K. Rowlings", "George R. R. Martin", "J. R. R. Tolken"},      //authors[2]
			{"Ray Bradbury", "Arthur C. Clark", "H. G. Wells"}                 //authors[3]
		};
		
		//This call creates that same structure, but with no initialized values
		String[][] books = new String[4][3];
		
		/*
		 * There are 4 arrays within authors, and 3 authors within each of those array.
		 * To access one of those arrays you would use the normal call of 
		     author[arrayIndex]
		*To access elements of those arrays you use an additional set of square brackets 
		     author[arrayIndex][itemIndex]
		
		*Based on this information, make some guesses as to what the following values will be
		
		authors.length      = 4 
		
		authors[1][2]   	= "Author Conan Doyle"
		
		authors[2][1]   	= "George R R Martin"
		
		authors[0].length 	= 3
		
		authors[3][2].charAt(6) = "W"
		
		The call for the element that contains the value "H. P. Lovecraft"         authors[0][1]
		
		
		The call for the element that contains the value "Ray Bradbury"            authors[3][0]
		
		
		
		*
		*/
		
		  System.out.println("authors.length         = " + authors.length + "\n");
          

	        System.out.println("authors[1][2]       = " + authors[1][2] + "\n");
	                

	        System.out.println("authors[2][1]       = " + authors[2][1] + "\n");
	                        

	        System.out.println("authors[0].length     = " + authors[0].length + "\n");
	                        

	        System.out.println("authors[3][2].charAt(6) = " + authors[3][2].charAt(6) + "\n");
	                        

	        System.out.println("The call for the element that contains the value \"H. P. Lovecraft\"");
	                
	        for (int i=0; i< authors.length; i++){
	            
	            for (int j=0; j< authors[i].length; j++){
	                
	                if (authors[i][j].equalsIgnoreCase("H. P. Lovecraft")) {
	                    
	                    System.out.println("authors[" + i + "][" + j + "]\n");
	                }
	            }
	            
	        }
	        
	        System.out.println("The call for the element that contains the value \"Ray Bradbury\"");
	        
	        
	        for (int i=0; i< authors.length; i++){
	            
	            for (int j=0; j< authors[i].length; j++){
	                
	                if (authors[i][j].equalsIgnoreCase("Ray Bradbury")) {
	                    
	                    System.out.println("authors[" + i + "][" + j + "]\n");
	                }
	            }
	            
	        }


		
	//End main method
	}

	
	
//End class
}
