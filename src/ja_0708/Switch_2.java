package ja_0708;

import java.util.Scanner;

public class Switch_2 {

	public static void main(String[] args) {
		
		
		System.out.println("숫자를 입력하세요");
		
		int score; 
		Scanner scan = new Scanner(System.in);
		score = scan.nextInt();
		
		switch(score)
		{
		case 100:
			System.out.println("당신의 점수는 100 상품은 자전거 입니다.");
			break;
		case 200:
			System.out.println("당신의 점수는 200 상품은 tv 입니다.");
			break;
		case 300:
			System.out.println("당신의 점수는 300 상품은 노트북 입니다.");
			break;
			
		case 400:
			System.out.println("당신의 점수는 400 상품은 자동차 입니다.");
			break;
			
			default : 
				System.out.println("죄송하지만 당신의 상품은 없습니다ㅋㅋ.");
			
			
		}

	}

}
