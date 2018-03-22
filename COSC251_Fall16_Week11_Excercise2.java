
public class COSC251_Fall16_Week11_Excercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		point myPoint_01 = new point();
		/*
		myPoint_01.x = 5;
		myPoint_01.y = 5;
		*/
		System.out.println(myPoint_01.GetValue()[0]);
		System.out.println(myPoint_01.GetValue()[1]);
		
		
		myPoint_01.SetPoint(5, 10);
		
		point.SetDefault(25, 50);
		
		point myPoint_02 = new point();
		
		System.out.println(myPoint_01.GetValue()[0]);
		System.out.println(myPoint_01.GetValue()[1]);
		
		
	}

}

class point{
	private static int xDefault = 0;
	private static int yDefault = 0;
	private int x = xDefault;
	private int y = yDefault;
	public static void SetDefault(int xVal, int yVal){
		xDefault = xVal;
		yDefault = yVal;
	}
	

	public void SetPoint(int xVal, int yVal){
		x = xVal;
		y = yVal;
	}
	
	public int[] GetValue(){
		return new int[]{x,y};
	}
	
}
