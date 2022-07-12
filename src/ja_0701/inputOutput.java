package ja_0701;

public class inputOutput {
	public static void main(String[] arg) throws Exception{
		int a, b;
		System.out.println("문자를 입력하시오!! ");
		a= System.in.read();
		
		System.out.println("입력한 문자는 "+(char)a+" 입니다.");
		System.out.println("입력한 ASCII Code 값은 "+a+" 입니다.");
		
		System.out.println("문자를 입력하시오!! ");
		b= System.in.read();
		
		System.out.println("입력한 문자는 "+(char)b+" 입니다.");
		System.out.println("입력한 ASCII Code 값은 "+b+" 입니다.");
	}
}