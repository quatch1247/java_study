package ja_0725;

public class Wrapper_1 {

	public static void main(String[] args) {
		
		Integer one = new Integer("345");
		Integer two = new Integer("45");
		
		int total = one.intValue() + two.intValue();
		String totalString = one.toString() + two.toString();
		
		System.out.println("one : " + one.intValue() + ", two : " + two.intValue());
		System.out.println("one : "+", two : " + two);
		
		System.out.println("one + two : " + total);
		System.out.println("one.toString() + two.toString() : " + totalString);
		
		System.out.println(total + " >> 2진수 : "+Integer.toBinaryString(total));
		System.out.println(total + " >> 8진수 : "+Integer.toOctalString(total));
		System.out.println(total + " >> 16진수 : "+Integer.toHexString(total));
		
		
		System.out.println(Integer.TYPE);
		
		

	}

}
