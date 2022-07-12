package ja_0707;

public class Cast_1 {

	public static void main(String[] args) {


		byte bb;
		int ii = 256;
		double dd = 1024.512;
		
		System.out.println("축소 형 변환 결과");
		
		bb = (byte)ii;
		System.out.println("int 형 365를 byte 형으로 바꾸면 : " + bb);
		
		ii = (int)dd;
		System.out.println("double 형 1024.512를 int 형으로 바꾸면 : " + ii);
		
		dd = (byte)dd;
		System.out.println("double 형 1024.512를 byte 형으로 바꾸면 : " + bb);
		

		
		/* 
		 프로그램은 데이터와 명령으로 구성되어 있습니다.
		 데이터를 처리하기 위해서는 다양한 변수가 필요하고, 데이터의 종류에 따라서 다양한 자료형을 사용합니다.
		 그런데 어떠한 경우에 서로 다른 자료형이 혼재되어 사용되기도 합니다.
		 서로 다른 자료형 사이의 연산을 위해서는 자료형을 일치시키는 작업이 필요합니다.
		 이처럼 서로 다른 자료형 사이에서 자료형이 변환되는 것을 형변환이라고 합니다.
		 
		 .확대 형변환(widening) : 자동으로 일어남 => 묵시적 형변환(implicit)
		 
		 .축소 형변환(narrowing) : Casting 해야함 => 명시적 형변환(explicit)
		 
		 .자동규칙
		 byte => char, short =? int => long => float => double
		 
		 .수식에서의 형변환
		 : char, byte, short 는 int로 변환되고, float는 double로 변환됨
		 2개의 피연산자중 하나가 double 이면 나머지도 double 이고 결과도 double임
		 
		 : 수식의 모든 float는 double로 변환되어 연산을 수행함
		 
		 .대입문에서의 형 변환
		 :오른쪽 값이 왼쪽의 자료형으로 변환되어 저장됨
		 :모든 문자는 정수로 변환되어 저장됨
		 :실수형이 정수형으로 변환될때 소수점 이하는 절삭되어 저장
		 
		 형식
		 (자료형) 수식;
		 
		 */
		
	}

}
