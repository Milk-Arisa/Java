package kadai9;

public class kadai9 {

	public static void main(String[] args){
//		int total = add(7,5);
//		System.out.println(total);

//	public static int add(int a, int b) {
//		return a+ b;
//	}
	
	double height = 1.62;
	double weight = 55.0;
	String myName = "キスマイ";
	
	double bmiResult = BMI(height,weight);
	
	System.out.println(myName+"さんのBMIは"+ bmiResult+"です。");
	}
	
	public static double BMI(double heightValue,double weightValue){
		return weightValue/(heightValue*heightValue);
	}
}
	

