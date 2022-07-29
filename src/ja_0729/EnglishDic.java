package ja_0729;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class EnglishDic {
	public static void main(String[] args) throws Exception {
		
		
		
		Map<String, String> st = new HashMap<String, String>();
		
		st.put("map", "지도");
		st.put("java", "자바");
		st.put("school", "학교");
		st.put("korea", "대한민국");
		st.put("seoul", "대한민국 수도");
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			System.out.println("영어 단어를 입력하시오.");
			String key = input.readLine();
			if(key.equals("quit"))
				break;
			System.out.println("단어의 의미는 " + st.get(key));
		}while(true);
	}
}
