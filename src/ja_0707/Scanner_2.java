package ja_0707;
import java.util.Scanner;


public class Scanner_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double a, b;
		double c;
		double e;
		
		System.out.print("실수형 데이터 2개를 입력하세요");
		//scanner 클래스를 사용하여 키보드에서 실수 입력
		
		a = input.nextFloat(); //scanner 클래스의 메소드
		b = input.nextDouble();
		
		c = a + b;
		e = a / b;
		
		System.out.printf("%f + %f = %1.0f\n", a, b, c);
		System.out.println(Math.round(e));
		
		

	}

}
