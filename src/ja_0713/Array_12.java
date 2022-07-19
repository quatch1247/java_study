package ja_0713;

public class Array_12 {

	public static void main(String[] args) {
		
		
		//RUN CONFIGURATION에서 매개변수를 3개 입력하면 결과 값이 출력된다.
		//12 + 23
		//length 매가변수가 3개가 아니라면,
		//system.exit 시스템을 중단시킴
		
		
		if (args.length !=3) {
			System.out.println("usage : java Array_12 num1 OP num2");
			System.exit(0);
		}
		
		int num1 = Integer.parseInt(args[0]);
		char op = args[1].charAt(0); // ARGUMENT 문자열에서 몇번째 값을 가져오겠다
		int num2 = Integer.parseInt(args[2]);
		
		int result = 0;
		
		switch(op) {
		
		case '+':
			result = num1 + num2;
			break;
			
		case '-':
			result = num1 - num2;
			break;
			
		case 'x':
			result = num1 * num2;
			break;
			
		case '/':
			result = num1 / num2;
			break;
			
		default:
		System.out.println("사칙 연산만 가능");
		System.out.println("다른 연산자는 지원되지 않습니다.");
		break;
		}
		
		System.out.println("결과 : " + result);

	}

}
