package ja_0707;

public class ConditionalOperator_1 {

	public static void main(String[] args) {


		int x = 10;
		int y = -25;
		
		int absX = ( x >= 0)? x: -x;
		int absY = (y >= 0)? y: -y;
		
		System.out.println("x = 10 일때, x의 절대 값은 = " + absX);
		System.out.println("x = -25 일때, y의 절대 값은 = " + absY);

	}

}
