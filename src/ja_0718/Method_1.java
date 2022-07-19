package ja_0718;

class Super_1{
	
	public void display() {
		System.out.println("Super_1 class display Method###");
		show();
	}

	protected void message() {
	System.out.println("Super_1 class message Method***");
	}


	void print() {
	System.out.println("Super_1 class print Method~~~");
	}
	
	protected void show() {
		System.err.println("Super_1 class show Method~~~");
		}
	//out 대신 err를 쓰면 빨간색으로 뜬다
	//메서드 안에서 메서드 호출가능
	
	}

public class Method_1 extends Super_1 {

	public static void main(String[] args) {
		
		Method_1 obj_1 = new Method_1();
		
		obj_1.display();
		obj_1.message();
		obj_1.print();
		//obj_1.show();
		
		
		

	}


}
