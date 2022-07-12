package ja_0706;

import java.io.IOException;

public class Arithmetic_4 {

	public static void main(String[] args) throws IOException {
		
		
		System.out.print("하나의 문자를 입력하시요!");
		
		int yy = System.in.read();
		
		char tt = (char)yy;
		
		//
		
		//char tt = 'k';
		
		if((tt >= 'a' && tt <= 'z')||(tt >= 'A' && tt <= 'Z'))
		{
			System.out.print("입력하신 문자는 유효합니다.!");
		} else {
			System.out.print("입력하신 문자는 유효 하지 않습니다.!");
		}
		
		System.out.println("HellowWorld");
		
		
		//if 문 &&연산자는 좌 우가 참이여야 출력
		//or 문 ||연산자는 좌 우 중 하나만 참이면 전체가 참이된다.

	}

}
