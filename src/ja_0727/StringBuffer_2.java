package ja_0727;

public class StringBuffer_2 {

	public static void main(String[] args) {
		
		
	StringBuffer stbf = new StringBuffer("Java");
	stbf.append("Program");
	
	System.out.println(stbf);

	
	for (int i = 0; i < stbf.length(); i++) {
		
		System.out.print(stbf.charAt(i) + "\t");
		}
	System.out.println();
	
	for (int i = stbf.length()-1; i>=0; i--) {
		System.out.print(stbf.charAt(i) + "\t");
	}
	
	stbf.insert(4, "*");
	//index 4번 위치에 삽입하겠다는 뜻
	
	System.out.println("\n" + stbf);
	
	System.out.println("문자열의 길이 : " + stbf.length());
	
	stbf.setLength(5);
	System.out.println("새로운 문자열의 길이 : " + stbf.length());
	System.out.println("setLength(5) 적용문자열 : " + stbf);
	System.out.println("반전 문자열 : " + stbf.reverse());
	}

}
