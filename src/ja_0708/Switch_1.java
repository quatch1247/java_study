package ja_0708;

import java.io.IOException;

public class Switch_1 {

	public static void main(String[] args) throws IOException {

		int a;
		System.out.print("1~9 사이의 값을 입력하세요!");
		a = System.in.read()-'0';
		
		
		switch(a)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
			System.out.println( a + "는 홀수 입니다.");
			break;
		
		case 2:
		case 4:
		case 6:
		case 8:	
			System.out.println( a + "는 짝수 입니다.");
			break;
		default:
			System.out.println(a + "는 숫자 입니다.");
				
		}
		/*
		 switch 문에 사용된 수식은 정수형자료(문자포함) 이어야 한다.
		 case문에 사용되는 값은 오로지 한개의 값만 사용할 수 있다.
		 if문 처럼 논리값을 사용할 수 없다.
		 case문에 실행문이 여러개 나오더라도 중괄호({})를 사용하지 않는다
		 break문이 없으면 다음 case문으로 넘어간다.
		 */
		
	}

}
