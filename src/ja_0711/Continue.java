package ja_0711;

public class Continue {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i<10; i++)
		{
			if(i%2 == 0) {
				continue;
				
			}
			sum +=i;
			System.out.print("\t" + i);
		}
		
		System.out.println("\n 1~ 10 사이의 홀수의 합 : " + sum );

	}

}
