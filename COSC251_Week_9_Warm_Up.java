

public class COSC251_Week_9_Warm_Up {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Create the method ShowArray to print out all of the values of the array in a list.
		 * 
		 * 
		 */
		
		int[] dataSet = new int[]{24,16,56,23,22,45,80,54,37,37,37,43,22,49,72};
	
		ShowArray(dataSet);
		
	
		
	//END main method
	}
	
	public static void ShowArray(int[] theArray){
		
		for(int i = 0; i < theArray.length; i++){
			System.out.println("Value at " + i + " = " + theArray[i]);
		}
		
	}	
	
//END class COSC251_Week_9_Warm_Up
}








