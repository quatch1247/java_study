package ja_0711;

public class Return {

	//void가 붙는건 리턴 타입이 없다.
	public static void main(String[] args) {
		
		

		int result1;
		int result2;
		int result3;
		double result4;
		
		
		test(14,53); // 리턴 받지 않는 메소드, void이다.
		
		result1 = sum(15, 27); //덧셈
		result2 = bbalsam(33, 27); //뺄셈
		result3 = gopsam(23, 7); //곱셈
		result4 = nanutsam(35, 4); // 나눗셈
		
		
			
		System.out.println("15 + 27 = " + result1);	
		System.out.println("33 - 27 = " + result2);
		System.out.println("23 * 7 = " + result3);
		System.out.println("25 / 4 = " + result4);
	
		

	}
	
	static void test(int x, int y)
	{
		System.out.println("14 + 53 = " + (x+  y));
		return;
	}
	
	static int sum(int x, int y)
	{
		return ( x + y);
		
	}
	static int bbalsam(int x, int y)
	{
		return ( x - y);
		
	}
	static int gopsam(int x, int y)
	{
		return ( x * y);
		
	}
	static double nanutsam(int x, int y)
	{
		return ( x / y);
		
	}

}
