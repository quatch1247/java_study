package ja_0711;

public class while_2 {

	public static void main(String[] args) {
		
		
		int sum =0;
		int i = 0;
		
		while(true)
		{
			if(sum > 100)
			{
				break;
			}
			
			sum += i;
			
			i++;
			
			System.out.println(i +"\t = " + sum);
			
		}
		
		System.out.println("합이 100을 넘을때 i 값 : " + i);
		
		
		

	}

}
