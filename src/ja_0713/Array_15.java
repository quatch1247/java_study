package ja_0713;

public class Array_15 {

	public static void main(String[] args) {
	
		//숫자 분석
		//c
		
		int[] number = new int[10];
		int[] count = new int[10];
		
		for (int i = 0; i < count.length; i++) {
			
			System.out.print((number[i] = (int)(Math.random()*10)) + "");
			
		}
		
		System.out.println("\n");
		
		for (int i = 0; i < number.length; i++) {
			
			count[number[i]]++;
		}
		
		for (int i = 0; i < number.length; i++) {
			System.out.println(" " + i +" 의 갯수 : "+ count[i]);
			
		}

	}

}
