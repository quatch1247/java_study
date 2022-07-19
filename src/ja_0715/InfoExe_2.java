package ja_0715;


class Info2{
	private String name;
	private int age;
	private char sex;
	private String tel;
	
	// 생성자 Overloading
	// 두 메서드가 같은 이름을 갖고 있으나 인자의 수나 자료형이 다른 경우를 말한다.
	
	public Info2(String n ,int a, char s, String t) { //생성자 Overloading
		name = n;
		age = a;
		sex = s;
		tel = t;
	}
	
	public Info2(String n ,int a, String t) { 
		name = n;
		age = a;
		sex = 'm';
		tel = t;
	}
	
	public Info2(String n , char s, String t) { //생성자
		name = n;
		age = 77;
		sex = s;
		tel = t;
	}
	
	public Info2(int a , char s, String t) { //생성자
		name = "장미";
		age = a;
		sex = s;
		tel = t;
	}
	
	public Info2(String n,String t) { //생성자
		name = n;
		age = 25;
		sex = 'f';
		tel = t;
	}
	
	public Info2() { //생성자
		name = "해바라기";
		age = 36;
		sex = 'm';
	}
	
	public Info2(int a , char s) { //생성자
		name = "장미";
		age = a;
		sex = s;
		tel = "010-9999-9999";
	}
	
	
	public void display() {	 //멤버 메소드
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + sex);
		System.out.println("전화번호 : " + tel);
	}
	
}

public class InfoExe_2 {

	public static void main(String[] args) {
		
		Info2 info1 = new Info2("백일홍", 17, 'f', "010-1234-1234");
		Info2 info2 = new Info2("들국화", 33, "010-1111-1111");
		Info2 info3 = new Info2("맨드라미", 'm', "010-2222-2222" );
		Info2 info4 = new Info2(26, 'f', "010-3333-3333");
		Info2 info5 = new Info2("Anonymous", "010-5555-5555");
		Info2 info6 = new Info2(67,'m');
		
		info1.display();
		System.out.println();
		
		info2.display();
		System.out.println();
		
		info3.display();
		System.out.println();
		
		info4.display();
		System.out.println();
		
		info5.display();
		System.out.println();
		
		info6.display();
		System.out.println();
	
	}

}
