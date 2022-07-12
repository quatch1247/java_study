package ja_0707;

import java.io.IOException;

public class If_2 {

	public static void main(String[] args) throws IOException {
		
		int a;
		System.out.print("문자를 입력하세요!!");
		
		a = System.in.read();
		
		if((a >= 'A') && (a<='Z'))
		{
			System.out.println(" " + (char)a + "는 대문자입니다.");
		}
		
		else if((a >= 'a') && (a<='z'))
		{
			System.out.println(" " + (char)a + "는 소문자입니다.");
		}
		
		else if((a >= 48) && (a<='9'))
		{
			System.out.println(" " + (char)a + "는 숫자입니다.");
		}
		
		

	}

}
