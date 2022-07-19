package ja_0715;

class AA_5
{
	int a = 33;
	public String b;
}
class BB_5 extends AA_5
{
	int b = 5;
}

class CC_5 extends BB_5
{
	int c = 77;
}


public class SuperTest_1 {

	public static void main(String[] args) {

		
		AA_5 obj_1 = new AA_5();
		BB_5 obj_2 = new BB_5();
		CC_5 obj_3 = new CC_5();
		CC_5 obj_4 = new CC_5();
		
		System.out.println("\n obj_1 : " + obj_1.a);
		System.out.println("\n obj_2 11 : " + obj_1.b);
		System.out.println("\n obj_3 22 : " + obj_3.a);
		System.out.println("\n obj_3 11 : " + obj_3.b);
		System.out.println("\n obj_3 22 : " + obj_3.c);
		System.out.println("\n obj_3 : " + obj_3.c);
		System.out.println("\n obj_3 : " + obj_3.c);
		System.out.println("\n obj_3 : " + obj_3.c);
		System.out.println("\n obj_4 : " + obj_4.c);

	}

}
