package ja_0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception_6 {

													//JVM에 떠넘긴거
	public static void main(String[] args) throws NumberFormatException, ArithmeticException, IOException {
//	try {
//		input();
//	}catch(ArithmeticException e) {
//		e.printStackTrace();
//		
//	}catch(IOException e) {
//		e.printStackTrace();
//		
//	}catch(NumberFormatException e) {
//		e.printStackTrace();
//		
//	}
		input();
}
	
	public static void input()throws ArithmeticException, IOException, NumberFormatException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("첫번째 값을 입력하세요 =>");
			int num1 = Integer.parseInt(in.readLine());
			
			System.out.println("두번째 값을 입력하세요 =>");
			int num2 = Integer.parseInt(in.readLine());
			
			dividing(num1, num2);
		}
	}
	
	public static void dividing(int num1, int num2)throws ArithmeticException{
		
		System.err.println(num1 + "/" + num2 + " = " + num1 /num2);
			
		}
	}

