package ja_0719;

class AA_5{
	
	String str;
	boolean bbb;
	char sex = ' ';


public AA_5(String str, boolean bbb, char sex) {
	this.str = str;
	this.bbb = bbb;
	this.sex = sex;
	
	System.out.println("AA_5 생성자 호출~~ : " + str + "boolean : " + bbb);
	}
}

class BB_5 extends AA_5{
	public BB_5(String aa, boolean kbs, char sex) {
		super(aa, kbs, sex);
		System.out.println("BB_5 생성자 호출 $$$ : " + aa + "boolean : " + kbs);
	}
}

class CC_5 extends BB_5{
	char sex = 'f';
	public CC_5(String mbc, boolean bbb, char sex) {
		super(mbc, bbb, sex);
		System.out.println("CC_5 생성자 호출 ^^^^ : " + mbc + "boolean : " + bbb);
	}
}

public class SuperTest_2 {

	public static void main(String[] args) {

		CC_5 obj_1 = new CC_5("즐거운 화요일 ", true, 'm');
		
		System.out.println(obj_1.str);
		System.out.println(obj_1.bbb);
		System.out.println(obj_1.sex);
		
		

	}

}

