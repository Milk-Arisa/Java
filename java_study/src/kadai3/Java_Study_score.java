package kadai3;

public class Java_Study_score {
	public static void main(String[] args) {
		
		String Student_name="田中";
		double japanese_score=85;
		double math_score=66;
		
		double avarage = avarage_score(japanese_score,math_score);
		
		System.out.println(Student_name+"さんの平均点は" + avarage + "点です。");
		if(avarage<70) {
			System.out.println("不合格");
		}else{
			System.out.println("合格");
		}
		    
	}
	public static double avarage_score(double japanese_score,double math_score) {
		return (japanese_score + math_score)/2;
	}
	
}
