package ja_0711;

public class while_1 {

	public static void main(String[] args) {
		int cnt = 0;
		int sum = 0;
		
		int even = 0; 
		int odd = 0;
		
		while(cnt < 100)
		{
			//cnt = cnt + 1;
			//cnt ++;
			
			
			sum += ++cnt;
			
			if (cnt % 2 == 0) { 
				even += cnt; 
			} else {
				odd += cnt; 
			}	
			
		}
		System.out.println(" 짝수합 = " + even); 
		System.out.println(" 홀수합 = " + odd);	
		System.out.println(" 총합계 = " + sum);
	}

}
