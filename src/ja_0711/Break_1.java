package ja_0711;

import java.io.IOException;

public class Break_1 {

	public static void main(String[] args) throws IOException {
	
			
		int sum = 0;
		int i;
		int cnt = 0;
		
		// 1~ 100 사이의 3의 배수의 합이 200을 넘는 순간의 3의 배수의 값은?
		
		for(i=1; i<=100 ; i++)
		{ 
			
			if(i%3 == 0) // 3의 배수
			{
				cnt ++;
				sum += i;
				System.out.print(i + "\t");
				
				if( cnt%5 ==0)
				{
					System.out.println();
				}
				
				
				
				if( sum > 200)
				{
					break;
				}
			}
		}
		System.out.println("\n 합 : " + sum);
		System.out.println("\n 3의 배수 : " + i);
		
	}

}
