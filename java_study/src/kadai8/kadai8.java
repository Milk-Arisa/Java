package kadai8;

import java.util.Random;
import java.util.Scanner;

public class kadai8 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("あなたの今日のおみくじを引きます。");
		System.out.println("あなたのお名前は？");
		String input_text = scanner.nextLine();
		System.out.println(input_text);
		scanner.close();
		
		String [] omikuji = {"大吉","中吉","小吉","吉","末吉","凶","大凶"};
		Random o =new Random();
			String omi = omikuji[o.nextInt(7)];
			System.out.println(omi);
		
			
		
		
		
	}
}
