package ja_0719;

public class SuperTest_1 {

	public static void main(String[] args) {
	
		Child obj_1 = new Child();
		obj_1.message();
		
	}

}

class Parent
{
	int x = 888;
	
}

class Child extends Parent
{
	int xx = 3456;
	
	void message() {
		
		System.out.println(" x = " + x);
		System.out.println(" this.xx = " + this.xx);
		System.out.println(" super.x = " + super.x);
		
	}
}