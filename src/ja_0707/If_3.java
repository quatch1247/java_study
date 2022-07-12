package ja_0707;

import java.util.Scanner;

public class If_3 {

	public static void main(String[] args) {
		
		//중첩 if문 사용해서 풀어보기
		
		Scanner input = new Scanner(System.in);
		System.out.println("점수를 입력하세요!!");
		
		int grade = input.nextInt();
		
		
		
		
		String hak = "";
		
		if(grade >= 90)
		{
			hak = "A";
			if(grade >= 98)
			{
				hak +="++";
			
			}
			else if(grade <=93 )
			{
				hak += "--";
			}
			
		}
		else if(grade >= 80)
		{
			hak = "B";
			
		}
		else if(grade >= 70)
		{
			hak = "C";
			
		}
		else if(grade >= 60)
		{
			hak = "D";
			
		}
		else {
			hak = "F";
		}
		
		System.out.println("성적은 " + hak + "입니다.");

	}

}
