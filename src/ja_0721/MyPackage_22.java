package ja_0721;

public class MyPackage_22 {
	
	String name;
	int age;
	String sex;

	public String getName() {
		return name;
	}
	
	public MyPackage_22(String sex, int age){
		
		this.sex = sex;
		this.age = age;
		
	}

	public void show(String str) {
		
		name = str;
		System.out.println("성별은 : " + sex + " / 나이는 : " + age);
		System.out.println("show() 메소드 호출!!");
		
	}
	
	public void print(String name, boolean sex) {
		System.out.println("나의 이름은 : " + name);
		if(sex) {
			System.out.println("남자 입니다.");
		}else {
			System.out.println("여자 입니다.");
			
		}
	}

}
