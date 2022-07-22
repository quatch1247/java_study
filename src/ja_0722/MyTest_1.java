package ja_0722;

import ja_0721.MyPackage_22;
import ja_0721.UserPackage_11;

public class MyTest_1 {

	public static void main(String[] args) {
		
		UserPackage_11 obj_1 = new UserPackage_11("korea ", 45);
		MyPackage_22 obj_2 = new MyPackage_22("남자", 67);
		
		obj_1.message("아름다운 사람");
		obj_1.message("즐거운 하루");

		obj_2.show("화려한 금요일");
		obj_2.show("싱그러운 바람");
		
		String abc = obj_2.getName();
		obj_2.getName();
		
		System.out.println(obj_2.getName());
		System.out.println(obj_2.getName());
		System.out.println("abc = " + abc);
		
		
		obj_2.print("kbs", false);
		
	}

}
