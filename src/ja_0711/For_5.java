package ja_0711;

import java.io.IOException;

public class For_5 {

	public static void main(String[] args) throws IOException {
		
		
		
		System.out.printf("첫번째단");
		int first = 0;
		
		first = System.in.read()-48;
		
		//enter 값 처리
		System.in.read();
		System.in.read();
		
		
		
		System.out.printf("두번째단");
		int second = 0;
		
		second = System.in.read()-48;
		
		
		
		//스와핑 식 값 교차
		if (first > second)
		{
			int temp =0;
			temp = first;
			first = second;
			second = temp;
		}
		
		
		
		
		//For을 이용한 구구단
		
		 for( int i = first ; i <= second; i++) { 
			 
			    System.out.printf("\n %d단 \n", i);
			    
	     for(int j= 1; j <=9; j++) {
			    
	    	 System.out.printf("%d * %d = %d\n", i, j, i*j);
			    }
			  }
		 

	}
	
	

}
