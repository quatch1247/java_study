package ja_0722;

public class Integer_1 {

	public static void main(String[] args) {
	
		
		Integer kbs_1 = new Integer(300);
		Integer mbc_1 = new Integer(300);
		
		System.out.println(kbs_1.getClass().hashCode());
		System.out.println(mbc_1.getClass().hashCode());
		
		System.out.println("kbs_1 == mbc_1 : " + (kbs_1 == mbc_1));
		System.out.println();
		
		System.out.println("kbs_1.equals(mbc_1) : " + (kbs_1.equals(mbc_1)));
		System.out.println();
		
		System.out.println("kbs_1.toString() : " + kbs_1.toString());
		System.out.println("mbc_1.toString() : " + mbc_1.toString());
		System.out.println();
		
		System.out.println("kbs_1.hashCode() : " + kbs_1.hashCode());
		System.out.println("mbc_1.hashCode() : " + mbc_1.hashCode());
		System.out.println("kbs_1.hashCode() : " + kbs_1.hashCode(789));
		System.out.println("mbc_1.hashCode() : " + mbc_1.hashCode(456));
		System.out.println();
		
		System.out.println("MAX_VALUE : " + Integer.MAX_VALUE);
		System.out.println("MIN_VALUE : " + Integer.MIN_VALUE);
		System.out.println();
		
		System.out.println("SIZE : " + Integer.SIZE + "hits");
		System.out.println();
		
	}

}
