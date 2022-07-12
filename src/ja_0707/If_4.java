package ja_0707;

import java.io.IOException;

public class If_4 {

	public static void main(String[] args) throws IOException {
		
		
		
		int ch;
		System.out.println("문자를 입력 하세요 : ");
		ch = System.in.read();
		
		if(ch == 'A'|| ch == 'a')
		{
			System.out.println("America");
			System.out.println("Australia");
		}
		else if(ch == 'K'|| ch == 'k')
		{
			System.out.println("Korea");
			System.out.println("Kuwait");
		}
		
		else if(ch == 'M'|| ch == 'm')
		{
			System.out.println("Mexcio");
			System.out.println("Monaco");
		}
		
		
		//이거 스캐너로 바꾸기

	}

}
