package ja_0711;

import java.util.Scanner;

public class while_5 {

public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("첫번째단");
		int first = input.nextInt();
		
		System.out.printf("두번째단");
		int second = input.nextInt();
		
		//스와핑 식 값 교차
		if (first > second)
		{
			int temp =0;
			temp = first;
			first = second;
			second = temp;
		}
		
		
		
		//while 문을 이용한 구구단
		
		int i = first;
		while (i <= second  ) {
			System.out.printf("\n %d단 \n", i);
			
			int j = 1;
			while(j <=9) {
				 System.out.printf("%d * %d = %d\n", i, j, i*j);
				 j++;
			}
			i++;
		}	 
		 

	}
}