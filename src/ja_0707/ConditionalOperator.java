package ja_0707;

public class ConditionalOperator {

	public static void main(String[] args) {
		int a = 14, b = 21, c = 43, d = 59;
		
		int max;
		int min;
		
		//조건연산자
		// 형식 => 조건식 ? 식 1 : 식 2
		
		max = (a > b) ? a: b;
		max = (max > c) ? max : c;
		max = (max > d) ? max : d;

		
		System.out.println("max : " + max);
		
		
		min = (c < d) ? c: d;
		min = (min < b) ? min : b;
		min = (min < a) ? min : a;

		
		
		
		System.out.println("min : " + min);
	}

	
	
}
