package ja_0725;

public class Wrapper_7 {

	public static void main(String[] args) {
		
		
		char[]obj = {'1','a',' ','#','B'};
		
		for(int i = 0; i<obj.length; i++) {
			
			System.out.println("\n 문자 [" + obj[i] + "] : ");
			
			if(Character.isDefined(obj[i])) {
				System.out.println("유니코드 입니다.");
			}
			if(Character.isDigit(obj[i])) {
				System.out.println("숫자입니다.");
			}
			if(Character.isLetter(obj[i])) {
				System.out.println("문자입니다.");
			}
			if(Character.isLowerCase(obj[i])) {
				System.out.println("소문자입니다.");
			}
			if(Character.isUpperCase(obj[i])) {
				System.out.println("대문자입니다.");
			}
			if(Character.isSpace(obj[i])) {
				System.out.println("공백문자입니다.");
			}
			if(Character.isAlphabetic(obj[i])) {
				System.out.println("알파벳 입니다.");
			}
			
		}

	}

}
