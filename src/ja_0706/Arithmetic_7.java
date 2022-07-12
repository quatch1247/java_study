package ja_0706;

import java.io.IOException;

public class Arithmetic_7 {

	public static void main(String[] args) throws IOException {
		
		
		System.out.print(" 한 숫자를 입력하세요!");

		int a = System.in.read()-48;
		
		int b, c, d;
		
		b = ~a;
		c = b + 1;
		d = ~(~a);
		
		System.out.println(a + "에 대한 1의 보수 : " + b);
		System.out.println(a + "에 대한 2의 보수 : " + c);
		System.out.println(a + "~~a : " + d);
		
		//2의 보수... 보수?
		
		}

}
