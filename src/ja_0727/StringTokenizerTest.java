package ja_0727;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		
		String str = "자바는 다양한, 문자열 처리, 날짜 처리, " + 
					"시간처리, 를 위한 메소드를, 갖고 있습니다.";
		
		StringTokenizer stt = new StringTokenizer(str, ",");
		System.out.println("토큰','의 수 : " + stt.countTokens());
		
		while(stt.hasMoreTokens()) {
			System.out.println(stt.nextToken());
		}
	}

}
