package ja_0714;

class Static_1{
	
	static int num = 0;
	int xx = 0;
	int yy = 0;
	
}
//static으로 선언한 변수는 공용의 개념이다.

public class StaticTest {

	public static void main(String[] args) {
		
		Static_1 ss1 = new Static_1();
		Static_1 ss2 = new Static_1();
		Static_1 ss3 = new Static_1();
		
		Static_1.num = 88;
		ss1.xx = 43;
		ss1.yy = 57;
		
		System.out.println("\n ss1.num = " + Static_1.num + "\n ss1.xx = " + ss1.xx + "\n ss1.yy = " + ss1.yy );
		
		Static_1.num = 999;
		ss2.xx = 233;
		ss2.yy = 345;
		
		System.out.println("\n ss2.num = " + Static_1.num + "\n ss2.xx = " + ss2.xx + "\n ss2.yy = " + ss2.yy );
		
		System.out.println("\n ss3.num = " + Static_1.num + "\n ss3.xx = " + ss3.xx + "\n ss2.yy = " + ss3.yy );
		System.out.println("\n Static_1.num = " + Static_1.num + "\n Static_1.xx = " + ss3.xx + "\n Static_1.yy = " + ss3.yy );
		
	}

}
