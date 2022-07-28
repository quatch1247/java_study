package ja_0728;

import java.util.Stack;

public class Stack_2 {
	
	public static Stack back = new Stack();
	public static Stack forward = new Stack();
	
	
	

	public static void main(String[] args) {
		
		goURL("1.Google");
		goURL("2.Daum");
		goURL("3.Nate");
		goURL("4.Naver");
		
		printprint();
		
		goBack();
		System.out.println("뒤로가기 1");
		
		printprint();
		
		goBack();
		System.out.println("뒤로가기 2");
		
		printprint();
		
		goFoward();
		System.out.println("앞으로 가기");
		
		printprint();
		
		goURL("www.korea.com");
		System.out.println("새로운 주소로 이동 후");
		
		printprint();
	

	}
	
	private static void goFoward() {
		if(!forward.empty()) {
			back.push(back.pop());
		}
	}
	
	private static void goBack() {
		if(!back.empty()) {
			forward.push(back.pop());
		}
	}
	
	private static void printprint() {
		System.out.println("back : " + back);
		System.out.println("forward : " + forward);
		System.out.println("현재화면 : " + back.peek() + "입니다.");
		System.out.println();
	}
	
	private static void goURL(String str) {
		
		back.push(str);
		if(!forward.empty()) {
			forward.clear();
		}
		
//		데이터를 추가하는 작업을 push 라고 한다
//		(리스트에서의 add와 같은 역할이다.)
//		데이터를 삭제하는 작업을 pop이라고 한다.
//		(리스트에서의 remove와 같은 역할)
	
		
	}

}
