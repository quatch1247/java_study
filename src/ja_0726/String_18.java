package ja_0726;

public class String_18 {

	public static void main(String[] args) {
		
		String[] fullName = {"korea.java", "seoul.com", "abc12345.789",
				"789asd.wrk", "king.queen"};
		
		String[] joomin = {"9003231523645", "9821011252364",
						    "9003231523645", "9821011252364",
							"9003231523645", "9821011252364"};
	
		for (int i = 0; i < fullName.length; i++) {
		// fullName 에서 '.'의 위치를 찾는다.
			int index = fullName[i].indexOf('.');
			System.out.println(index);
			
		//fullName의 첫번째 글자부터 '.'이 있는 곳까지 문자열을 추출
			String fileName = fullName[i].substring(0, index);
			
			
			//'.'다음 문자부터 시작 문자열 끝까지 추출
			
			String ext = fullName[i].substring((index+1),fullName[i].length());
			
			System.out.println(fullName[i] + "의 확장자를 제외한 이름 : " + fileName);
			System.out.println(fullName[i] + "의 확장자는" + ext);
			System.out.println();
		}
	}

}
