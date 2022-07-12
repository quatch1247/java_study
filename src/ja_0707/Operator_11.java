package ja_0707;

public class Operator_11 {

	public static void main(String[] args) {
		
		
		int x = 3;
		int y = 5;
		int z = -3;
		
		System.out.println("x 는" + x + "이고 , y 는" + y + "일 때" );
		System.out.println("x  | y = " + (x | y) );
		System.out.println("x  & y = " + (x & y) );
		System.out.println("x  ^ y = " + (x ^ y) );
		System.out.println(" ~x = " + (~x + 1) );
		System.out.println(" ~z = " + ~z );
		
		System.out.println("true | false = " + (true | false));
		System.out.println("true & false = " + (true & false));
		System.out.println("true ^ false = " + (true ^ false));
		
		
		int num = 3;
		String num2 = Integer.toBinaryString(num);
		System.out.println(num2);

		
		//
	}

}
