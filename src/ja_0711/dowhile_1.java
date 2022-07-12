package ja_0711;

public class dowhile_1 {

	public static void main(String[] args) {

		int cnt = 0, sum = 0;
		int even = 0;
		int odd = 0;
		
		do
		{
			
			sum += ++cnt;
			
			if (cnt % 2 == 0) { 
				even += cnt; 
			} else {
				odd += cnt; 
			}
			
		}
		while(cnt<100);
		
		System.out.println(" 짝수합 = " + even); 
		System.out.println(" 홀수합 = " + odd);	
		System.out.println("1+2+3 +~+100 = "+ sum);

	}
	
	

}


