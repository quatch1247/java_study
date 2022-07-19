package ja_0714;

	class Method_1
	{
		double x;
		double y;
		
		
		public Method_1(double xx, double yy) { // 생성자
			this.x = xx;
			this.y = yy;
			
		}
		
		public double add() //멤버 메소드
		{
			return( x + y );
			
		}
		
		public double bbam() //멤버 메소드
		{
			return( x - y );
			
		}
		
		public int gop() //멤버 메소드
		{
			return (int) ( x * y );
			
		}
		
		public int nanup() //멤버 메소드
		{
			return (int) ( x / y );
			
		}
	}
	public class Method_Test {
	public static void main(String[] args) {
		
		Method_1 obj = new Method_1(34.567, 676.3422);
		
		double abc = obj.add();
		double def = obj.bbam();
		int ghi = obj.gop();
		int jkl = obj.nanup();
		
		System.out.println("더하기 : " + abc);
		System.out.println("빼기 : " + def);
		System.out.println("곱하기 : " + ghi);
		System.out.println("나누기 : " + jkl);
	

	}

}
