package ja_0718;

class AA_4{
	//파이널이 붙은 메소드는 오버라이딩 x
	void display() {
//	final void display() {
		System.out.println("재정의 불가 메소드 display() ~~~");
	}
}

class BB_4 extends AA_4
{
	void display() {
		System.out.println("재정의한 메소드 display() @@@");
	}
}




public class FinalMethod_1 {
	

	public static void main(String[] args) {
		
		BB_4 obj_1 = new BB_4();
		
		obj_1.display();	
		
	}

}
