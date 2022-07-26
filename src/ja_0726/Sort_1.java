package ja_0726;

import java.util.Arrays;

public class Sort_1 {

	public static void main(String[] args) {
		
		int[] num = {78,66,43,89,94,54,37};
		
		Arrays.sort(num);
		System.out.println("\n 정렬 후 숫자  : " + Arrays.toString(num));
		
		String[] eng = {"사랑", "자바", "Love", "LOVE", "愛"};
		
		
		
		System.out.println("\n*********** 정렬 전 문자열 ********* \n");
		
		for(int i = 0; i < eng.length; i++) {
			System.out.print(eng[i] + "\t");
		}
		System.out.println("\n\n********** 정렬 후 문자열 ***********\n");
		
	

	
		for(int i = 0; i < eng.length -1; i++) {
			for (int j = i+1; j < eng.length; j++) {
				
				if(eng[i].compareTo(eng[j])<0) {
					
					String temp = eng[i];
					eng[i] = eng[j];
					eng[j] = temp;
				}
				
				
			}
		}
		
		for (int i = 0; i < eng.length; i++) {
			System.out.print(eng[i] + "\t");
			
		}
		
		
	}

}
