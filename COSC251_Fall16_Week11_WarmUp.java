
public class COSC251_Fall16_Week11_WarmUp {

	public static void main(String[] args) {

		/*
		 * Week 11 Warm Up
		 * 
		 * The following arrays contain all of the homework grades for the students in a class
		 * Create a method that prints out the students with their homework average
		 */
		
		String[] myStudents = {"Morris, J.", "Kaplan, K.", "Smith, K.", "Holmes, R.", "Watson, E.", "Brenner, W."};
		
		int[][] hwGrades = {
				{96, 55, 78, 85, 89, 93, 99, 92, 88, 80}, //"Morris, J."
				{87, 85, 90, 95, 98, 99, 94, 95, 95, 99}, //"Kaplan, K."
				{78, 45, 60, 80, 86, 87, 80, 72, 77, 65}, //"Smith, K."
				{76, 88, 87, 84, 90, 92, 89, 89, 84, 86}, //"Holmes, R."
				{62, 51, 54, 78, 73, 80, 95, 77, 70, 83}, //"Watson, E."
				{80, 79, 93, 87, 91, 100, 97, 87, 90, 91}  //"Brenner, W."
			};
		
		PrintGrades(myStudents, hwGrades);
		
	//end Main method	
	}

	public static void PrintGrades(String[] myStudents, int[][] hwGrades) {
		double avg =0;
		for(int i = 0; i < myStudents.length; i++){
			avg = 0;
			for(int j = 0; j < hwGrades[i].length; j++){
				avg += hwGrades[i][j];
			
			}
			avg = avg/hwGrades[i].length;
			System.out.printf("%-15s | %.2f%n", myStudents[i], avg);
		}
	
	}

	
}//end Class
