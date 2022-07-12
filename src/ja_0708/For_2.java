package ja_0708;

public class For_2 {

	public static void main(String[] args) {
		
		
		int cnt = 0;
		int sum = 0;
		
		for (cnt = 1; cnt <=100; cnt++)
		{
			if ((cnt % 3 == 0) && (cnt % 7 == 0)) {

				sum += cnt;
			}
			
		/*
		 *  if (cnt % 3 ==0)
		 *  {
		 *  	if(cnt % 7 ==0)
		 *  	{
		 *  		sum +=cnt;
		 *  	}
		 */
			
			
			/*
			 *  if (cnt % 21 ==0)
			 *  {
			 *  		sum +=cnt;
			 */
			
		}
		System.out.println("3과 7의 공배수 합 : " + sum);

	}

}
