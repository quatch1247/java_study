package ja_0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception_1 {

	public static void main(String[] args) throws IOException {
		
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	
	while(true) {
		
		try {
		System.out.println("첫번째 값을 입력하세요!");
		int num1 = Integer.parseInt(input.readLine());
		
		System.out.println("두번째 값을 입력하세요!");
		int num2 = Integer.parseInt(input.readLine()); // 마우스 오른쪽 SURROUND WITH
		
			System.out.println(" " + num1 + " / " + num2 + " = " + (num1/num2));
			
		} catch (NumberFormatException e) {
			System.err.println("숫자를 입력하세요.");
		}
		  catch (ArithmeticException e) {
		    System.err.println("몫이 0이 될 수 없습니다.");
		    System.err.println(e.getMessage());
	    }
		catch (Exception e) { 							//Exception은 가장 상위에 있기 때문에 가장 아래에 이써야한다
		    System.err.println("Exception이 발생하였습니다.");
	    }
		
		finally {										//Exception이 발생하던지 말던지 항상 처리한다 
			System.out.println("\n 항상 실행되는 내용 \n");
		}
		
		//비정상적인 값을 입력했을때 빨간 오류가 생기는데 그걸 처리해주는것을 Exception handling 이라고 한다.
	}
	}

}
