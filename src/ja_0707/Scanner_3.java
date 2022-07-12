package ja_0707;

import java.util.Scanner;

public class Scanner_3 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		//scanner 클래스를 사용하여 키보드에서 문자열 입력
		
		String greeting, name; 
		
		System.out.print("인사 말을 입력하세요. >>");
		greeting = input.nextLine();
		
		System.out.print("사람 이름을 입력 하세요. >>");
		name = input.nextLine();
		
		String kbs = greeting + name;
		
		System.out.print("입력한 내용 : " + greeting + " 내 이름은 : " + name + "입니다. \n");
		System.out.print("입력한 내용2 :" + kbs);
		// nextLine을 쓰면 문자열을 받을 수 있다.
	
		
	
	}

}
