package ja_0706;

import java.io.IOException;

public class Arithmetic_5 {

	public static void main(String[] args) throws IOException {
		
		
		int ckk;
		
		System.out.print("0또는 1을 입력하세요!");
		ckk = System.in.read();
		
		//-48을 -'0'으로 쓸 수 있다
		//아스키 코드에서 숫자 0은 48이기 때문에
		
		if(ckk == '0')
		{
			System.out.println("23/7 = " + (23 / 7));
		}else
		{
			System.out.println("23%7 = " + (23 % 7));
		}

		
		System.out.println("HellowWorld!!");
	}

	
}
