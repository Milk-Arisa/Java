package kadai7;
import java.util.Random;
public class kadai7 {
	public static void main(String[] args) {	
		
//		String[] hands = { "グー","チョキ","パー"};
//		Random r = new Random();
//		for (int i=0; i<5; i++) {
//			String hand = hands[r.nextInt(3)];
//			System.out.println(hand);
//		}
//		
		String [] kismy = {"北山","千賀","宮田","横尾","藤ヶ谷","玉森","二階堂"};
		Random k =new Random();
			String kismyft = kismy[k.nextInt(7)];
			System.out.println(kismyft);
		
		
		
	}	
	}
