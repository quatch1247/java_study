package ja_0715;


class This2
{
	String name;
	int age;
	char sex;
	
	public This2(String name, int age, char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public This2() { //객첵 먼저 생성된 다음에 syso사용가능
		this("밝은미소", 27, 'm');
	}
	
	public This2(String name, int age) {
		this(name, age, 'f');
	}
	
	public This2(String name, char sex) {
		this(name, 19, sex);
	}
	
	public void display(){
		System.out.println(" 이름은 " + name + " 나이는 " + age + " 성별은 " + sex);
		
	}
	
	
	
}

public class ThisExe_2 {

	public static void main(String[] args) {
		
		This2 t1 = new This2();
		This2 t2 = new This2("민우", 25);
		This2 t3 = new This2("유진", 'f');
		
		t1.display();		
		t2.display();		
		t3.display();		

	}

}
