package ja_0718;

class AA_3
{
	public AA_3() {
		System.out.println("AA_3 생성자 호출****************");
	}
	int a = 33;
}

class BB_3 extends AA_3
{	
	public BB_3() {
		System.out.println("BB_3 생성자 호출%%%%%%%%%%%%%");
	}
	int b = 55;
}
class CC_3 extends BB_3
{
	public CC_3() {
		super();//이게 생략되어있다 오브젝트를 호출한 것이다.
		System.out.println("CC_3 생성자 호출~~~~~~~~");
		//super(); <- 줄바꾸면 에러생김
	}
	int c = 77;
}

public class SuperTest_1 {

	public static void main(String[] args) {
		
		//A로 하게 되면 BC는 못쓴다
		
		CC_3 obj_1 = new CC_3();
		
		System.out.println("\n obj의 a값 " + obj_1.a);
		System.out.println("\n obj의 b값 " + obj_1.b);
		System.out.println("\n obj의 c값 " + obj_1.c);
	}

}
