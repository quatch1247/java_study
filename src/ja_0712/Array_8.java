package ja_0712;

import java.util.Arrays;

public class Array_8 {

	public static void main(String[] args) {
	
		
		int[] score = {83,64,35,97,58,73};
		int max = score[0];
		int min = score[0];
		
		for(int i = 1; i < score.length; i++) {
			
			if(score[i]>max) {
				
				max = score[i];
			}
		}
		
		//최소값은 최댓값에서 if문의 부등호만 바꿔주면 된다.
		
		for(int i = 1; i<score.length; i++) {
			
			if(score[i]<min) {
				
				min = score[i];
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		System.out.println("Stream 을 이용한 방법 ");
		System.out.println("최대값 : " + Arrays.stream(score).max().getAsInt());
		System.out.println("최소값 : " + Arrays.stream(score).min().getAsInt());
	}

}
