package ja_0706;

public class ShiftTest_2 {

	public static void main(String[] args) {


		int temp;
		
		System.out.println(-8);
		System.out.println(Integer.toBinaryString(-8));
		System.out.println();	
		
		System.out.println(-4);
		System.out.println(Integer.toBinaryString(-4));
		System.out.println();
		
		System.out.println(-2);
		System.out.println(Integer.toBinaryString(-2));
		System.out.println();
		
		System.out.println(-1);
		System.out.println(Integer.toBinaryString(-1));
		System.out.println();
		
		System.out.println(1);
		System.out.println(Integer.toBinaryString(1));
		System.out.println();
		
		
		temp = -8<<1;
		System.out.println("-8 << 1 = " + temp);
		System.out.println(Integer.toBinaryString(temp));
		System.out.println();
		
		temp = -8<<2;
		System.out.println("-8 << 2 = " + temp);
		System.out.println(Integer.toBinaryString(temp));
		System.out.println();
		
		temp = -8>>1;
		System.out.println("-8 >> 1 = " + temp);
		System.out.println(Integer.toBinaryString(temp));
		System.out.println();
		
		temp = -8>>2;
		System.out.println("-8 >> 2 = " + temp);
		System.out.println(Integer.toBinaryString(temp));
		System.out.println();
		
		
		
	
		System.out.println(-8);
		System.out.println(Integer.toBinaryString(-8));
		System.out.println();
		
		//앞에 00000000000000000001 이런식으로 표현하는데 숫자 앞에 0의 무의미 해서 생략
		
		temp = -1>>>1;
		System.out.println("-8 >>> 2 = " + temp);
		System.out.println(Integer.toBinaryString(temp));
		System.out.println();
		
		
		temp = -8>>>2;
		System.out.println("-8 >>> 2 = " + temp);
		System.out.println(Integer.toBinaryString(temp));
		System.out.println();
		
		

	}

}
