package ja_0715;

class Info {
	private String name; // 이름
	private int age; // 나이
	private char sex; // 성별
	private String tel; // 전화번호

	public Info(String n, int a, char s, String t) {
		name = n; // 이름 초기화
		age = a; // 나이 초기화
		sex = s; // 성별 초기화
		tel = t; // 성별 초기화
	}

	public void display() { // 정보 출력 메소드
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + sex);
		System.out.println("전화번호 : " + tel);
		System.out.println();
	}
}

public class InfoExe {

	public static void main(String[] args) {

		Info obj1 = new Info("홍길동", 27, 'm', "010-1234-5678"); // obj1 초기화

		Info obj2 = new Info("수선화", 36, 'f', "010-9999-9999"); // obj2 초기화

		obj1.display();
		obj2.display();

	}

}
