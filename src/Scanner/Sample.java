package Scanner;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("名前を入力してください > ");
		String input_text = scanner.nextLine();
		System.out.println(input_text + "が入力されました");
		scanner.close();
		
		
		
		
	
	}
}
