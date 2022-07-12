package ja_0707;

import java.util.Scanner;

public class If_1 {

	public static void main(String[] args) {
		
		
		System.out.println("방문 횟수를 적으세요!");
		
		Scanner input = new Scanner(System.in);
		int visitCount = input.nextInt();
		
		if(visitCount < 1) {
			System.out.println("처음 오셨군요, 방문해 주셔서 감사합니다.");
		}else
		{
			System.out.println("처음 오셨군요, 방문해 주셔서 감사합니다.");
			System.out.println(visitCount+1 + "번 방문 하셨습니다");
		}
		
		
		
		
		
		
		
	}

}
