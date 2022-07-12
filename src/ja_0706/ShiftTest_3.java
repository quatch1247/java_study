package ja_0706;

public class ShiftTest_3 {

	public static void main(String[] args) {
	
		
	// 숫자 20의 3번째 비트는 무엇인가?
		
		int num = 20;
		System.out.println(Integer.toBinaryString(num));
		
		//Integer.toBinaryString(num)
		//10진수 값을 2진수로 바꾸고 2진수를 10진수로 바꿔주는 함수를 지원.
		
		num = num >> 2;
		num = num & 1;
		
		System.out.println("20의 3번째 비트는 : " + num);
		
		
		
		
		
		
		
		
		
		

	}

}
