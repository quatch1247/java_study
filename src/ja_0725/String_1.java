package ja_0725;

public class String_1 {

	public static void main(String[] args) {
		
	char[]ss = {'k','o','r','e', 'a'};
	
	String str1 = "Hello"; // 문자열 대입
			
	String str2 = new String("java");
	String str3 = new String(ss);
	
	
	System.out.println(ss);
	System.out.println(str1);
	System.out.println(str2);
	System.out.println(str3);
	System.out.println(str1+str2+str3);
	System.out.println();
	System.out.println(ss.hashCode());
	System.out.println(str1.hashCode());
	System.out.println(str2.hashCode());
	System.out.println(str3.hashCode());
	
	String kbs1 = "Hello";
	System.out.println(kbs1.hashCode());

	}

}
