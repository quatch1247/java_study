package ja_0714;


public class Circle_1 {

	public static void main(String[] args) {
		
		final float PI = 3.1415f; //final이 붙으면 상수화가 되서 값변경이 안된다.
		
		
		int 반지름 = 13;
		
//		PI = 5.345f;
		
		double 넓이 = PI * 반지름 * 반지름;
		double 둘레 = 2 * PI * 반지름;
		

		System.out.printf("원의 넓이 : %7.3f \u33a0 \n", 넓이);
		
		System.out.printf("원의 둘레 : %7.3f \u339d \n", 둘레);
		

	}

}
