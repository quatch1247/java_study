package ja_0711;

public class while_3 {

	public static void main(String[] args) {
	
	/*	
		int sum =0;
		int i = 0;
		int j = 0;
		
		while(true)
		{
			if(sum > 13)
			{
				break;
			}
			
			sum = sum + 3*(i-1) - j;
			
			j++;
			i++;
			
		
	}
		
		System.out.println("합이 13을 넘을때 : " + i +"일");
		
		*/
		
		int dal = 0;
		
		int count = 0;
		
		while(true)
		{
			
			dal += 3;
			
			count ++;
			
			if(dal >=13)
			{
				break;
			}
			dal -= 1;
			
			
			System.out.println("dal = " + dal + "m");
			
		}
		System.out.println("벗어나는 날 " +count + "일");
		
	}}
