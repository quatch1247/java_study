package ja_0725;

public class Wrapper_2 {

	public static void main(String[] args) {
		
	Integer abc_1 = new Integer(789);
	Integer abc_2 = new Integer(456);
	
	int kbs_1 = (int) abc_1;		//UnBoxing
	int kbs_2 = abc_2;				//Auto UnBoxing
	
	Integer bbc_1 = (Integer) 357; // Boxing
	Integer bbc_2 = 589;		   //Auto Boxing
	
	Integer king_1 = abc_1 + abc_2; //Wrapper 끼리 연산
	Integer king_2 = kbs_1 + kbs_2; //기본형끼리 연산 후 Auto Boxing
	
	int queen_1 = abc_1 + kbs_1;	//기본형과 Wrapper 형 연산
	
	System.out.println("abc_1 : " + abc_1);
	System.out.println("abc_2 : " + abc_2);
	System.out.println("kbs_1 : " + kbs_1);
	System.out.println("kbs_2 : " + kbs_2);
	System.out.println("bbc_2 : " + bbc_1);
	System.out.println("bbc_2 : " + bbc_2);
	System.out.println("king_1 : " + king_1);
	System.out.println("king_2 : " + king_2);
	System.out.println("queen_1 : " + queen_1);

	
//	오토박싱과 언박싱을 사용해야 할때
//	레퍼런스 타입과 기본 타입 사이의 "임피던스 불일치"가 있는 경우에만
//	사용(기본타입을 쓸 수 없는 경우에만)
//	예를 들에 Map이나 Set같은 Java Collection에는 기본 타입을
//	못넣으니까 이런 경우에는 레퍼런스 타입을 쓰면 된다.
//	하지만 과학 계산이나, 성능에 민감한 계산 코드에 오토박싱 / 언박싱을
//	사용하는건 적절하지 않다. Integer는 int를 완벽히 대체할 수 없다.
//	오토박싱과 언박싱은 기본 타입과 레퍼런스 타입 사이의 구분을 흐릿하게 만들어
//	주지만 그 차이를 완벽히 없애는 것은 아니다.

	}

}
