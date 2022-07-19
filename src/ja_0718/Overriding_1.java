package ja_0718;



class AA_2
{
	int aa = 55;
	int bb = 77;
	
	void display() {
		System.out.println("AA_2 클래스의 display() ~~~메소드" );
	}
}

class BB_2 extends AA_2
{
	int bb = 478;
	int cc = 888;
	
	void display() {
		System.out.println("BB_2 클래스의 display() @@@메소드" );
	}
}



public class Overriding_1 {

	public static void main(String[] args) {
		
		AA_2 obj_1 = new BB_2();
//		AA_2 obj_1 = new AA_2();
//		BB_2 obj_1 = new BB_2();
		
		obj_1.display();
		System.out.println(obj_1.bb);
	}

}
