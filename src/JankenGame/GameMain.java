package JankenGame;

import java.util.Random;
import java.util.Scanner;

public class GameMain {
	public static void main(String[] args) {
//		変数定義
		String[] rockPaperScissors = {"グー","チョキ","パー"};//じゃんけんの配列定義
		int userWin = 0;//ユーザー勝利
		int pcWin = 0;//コンピューター勝利
		
		Random janken =new Random();
		Scanner scanner = new Scanner(System.in);
//		System.out.println(" ");
//		String input_text = scanner.nextLine();
//		System.out.println(input_text);
//		scanner.close();
		
		while(userWin <= 3) {
			System.out.println(userWin);
			userWin++;
		}
		while(pcWin <= 3) {
			System.out.println(pcWin);
			pcWin++;
		}
		
		if(userWin>pcWin)
			System.out.println("あなたの勝ち");
		else
		{
			System.out.println("あなたの負け");
		}
		
		
		
		
	}
}
