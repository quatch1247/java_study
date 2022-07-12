package ja_0706;
//**??

public class Arithmetic_6 {

	public static void main(String[] args) {
		
		int a, b ,c;
		a = 13;
		b = 10;
		
		// 13 = 1+4+8 00001101
		// 10 = 1010
		
		c = a & b;
		System.out.println(" a & b = " + c);
		
		
		
		c = a | b;
		System.out.println(" a | b = " + c);
		
		//
		
		c = a ^ b;
		System.out.println(" a ^ b = " + c);

		//비트 XOR 연산자
		c = ~a;
		System.out.println(" ~a  = " + c);
		
		//단항 연산자이며, 비트를 반전한다. 0은 1로 1은 0으로 만듬
		
		int x = 7;
		System.out.printf("%d", ~x);
		

	}

}
