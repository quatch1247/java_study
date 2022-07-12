package ja_0701;

public class inputOutput2 {
	public static void main(String[] arg) throws Exception{
		int a;
		System.out.println("문자를 입력하시오!! ");
		a= System.in.read();
		
		System.out.println("입력한 문자는 "+(char)a+" 입니다.");
		System.out.println("입력한 ASCII Code 값은 "+a+" 입니다.");
		
		System.in.read();
		System.in.read();

		System.out.println("두번째 문자를 입력하시오!! ");
		a= System.in.read();
		
		System.out.println("입력한 문자는 "+(char)a+" 입니다.");
		System.out.println("입력한 ASCII Code 값은 "+a+" 입니다.");
	}
}