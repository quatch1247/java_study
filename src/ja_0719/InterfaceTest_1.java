package ja_0719;

interface AA_1
{
	void print1(); // public abstract void print11();
	
}

class BB_1 implements AA_1{

	@Override
	public void print1() {
		System.out.println("AA_1 인터페이스 메소드 재정의");	
	}
	
	public void print2() {
		System.out.println("BB_1 클래스 메소드 print2()");	
	}
}

public class InterfaceTest_1 {

	public static void main(String[] args) {
		
		BB_1 obj_1 = new BB_1();
		
		obj_1.print1();
		obj_1.print2();	
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		AA_1 obj_2 = new BB_1();
		obj_2.print1();
		// obj_2.print2(); 오버라이딩 되지 않았기 때문에 허용x
		
	}

}
