package ja_0725;

public class Wrapper_3 {

	public static void main(String[] args) {
	
//		https://velog.io/@99gaga/Java-equals-%EC%99%80-hashCode%EC%9D%98-%EA%B4%80%EA%B3%84
		
		Integer kbs_1 = new Integer(300);
		Integer mbc_1 = new Integer(300);
		
		System.out.println("kbs_1 == mbc_1 : " + (kbs_1 == mbc_1));
		
		System.out.println("kbs_1.equals(mbc_1) : " + (kbs_1.equals(mbc_1)));
		
		System.out.println("kbs_1.toString() : " + kbs_1.toString());
		System.out.println("mbc_1.toString() : " + mbc_1.toString());

		System.out.println("MAX_VALUE : " + Integer.MAX_VALUE);
		System.out.println("MIN_VALUE : " + Integer.MIN_VALUE);
		
		System.out.println("SIZE : " + Integer.SIZE + "bits" );
		System.out.println("TYPE : " + Integer.TYPE);
		System.out.println("hashCode : " +kbs_1.getClass().hashCode() );
		System.out.println("hashCode : " +mbc_1.getClass().hashCode() );
	}

}
