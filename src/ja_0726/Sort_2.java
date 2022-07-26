package ja_0726;

import java.util.Arrays;

public class Sort_2 {

	public static void main(String[] args) {
		
		int[] num = {78,66,43,89,94,54,37};
		

		
		System.out.println("\n*********** 정렬 전 문자열 ********* \n");
		
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}
		System.out.println("\n\n********** 오름차순 문자열 ***********\n");
	
		for(int i = 0; i < num.length -1; i++) {
			for(int j = i+1; j < num.length; j++) {
				
				if(num[i] > num[j]) {
					
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
			
		}
		System.out.println("\n\n********** 내림차순 문자열 ***********\n");
		for(int a = 0; a < num.length -1; a++) {
			for(int b = a+1; b < num.length; b++) {
				
				if(num[a] < num[b]) {
					
					int temp = num[a];
					num[a] = num[b];
					num[b] = temp;
				}
				}
			
				
				
				
			}
		for(int a = 0; a < num.length; a++) {
			System.out.print(num[a] + "\t");
			
				
			}
		
	}

}
