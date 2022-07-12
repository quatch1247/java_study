package ja_0706;

public class Arithmetic_3 {

	public static void main(String[] args) {
		
		boolean a,b,c,d;
		
		//단축 논리연산자
		// &(and), |(or), !(not)
		//단축 논리 연산자(short circuit logical operator)
		// &&, ||
		
		a= (3 > 10)&(10 > 3);
		b= (3 > 10)&&(10 > 3);
		//앞이 참이면 뒤 계산 x
		
		c= (10 > 3)|(3 > 10);
		d= (10 > 3)||(3 > 10);
		//앞이 거짓이면 뒤 연산x
		
		//& 는 앞의 조건식이 false 여도 뒤의 조건식이 true인지 false 인지 판별한다. 어차피 결과는 false인데도 말이다.
		//&& 는 앞의 조건식이 false 라면, 뒤의 조건식은 true인지 false인지 신경쓰지 않는다. 어차피 결과는 false이기 때문이다.
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		

	}

}
