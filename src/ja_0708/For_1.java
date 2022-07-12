package ja_0708;

public class For_1 {

	public static void main(String[] args) {
		
		int evensum = 0;
		int oddsum = 0;
		int num = 0;
		
		
		for(int cnt = 0; cnt <= 100 ; cnt ++)
		{
			
			if(cnt % 2 ==0 ) {
			
			evensum += cnt; // cnt = cnt + 1
							// sum = sum + num
			
		}else {
			
			oddsum += cnt;
			
		}
	}
		
		System.out.println("\n 짝수의 합  = " + evensum);
		System.out.println("\n 홀수의 합  = " + oddsum);

}
}
