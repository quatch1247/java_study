package ja_0711;

import java.util.Scanner;

public class dowhile_3 {
	
	

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
		
	int i = first-1, j = 1;
		
		do
		{
			
			i++;
			j = 1;
			do
			{
				System.out.println(i+"*"+j+"="+(i*j));
				j++;
			}
			
			while(j<=9);
			System.out.println();
		

	}
		while(i<second);

} 
		 

	}
