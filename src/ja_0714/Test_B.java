package ja_0714;


class A_1{
	
	public int x = 10;  // 멤버 변수
	public int y = 30; // 멤버 변수
	
	
	public int add() {
		return(x+y);
	}
	
}



public class Test_B {

	public static void main(String[] args) {
	
		
		A_1 obj = new A_1();
		
		obj.x = 55;
		obj.y = 77;
		
		System.out.println("x = " + obj.x);	
		System.out.println("y = " + obj.x);
		System.out.println("(x+y) = " + obj.add());
	}

}
