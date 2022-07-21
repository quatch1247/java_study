package ja_0721;

public class Random_1 {

	public static void main(String[] args) {
		
		int number = 0;
		int count = 0;
		//237 ~ 500 사이의 10개 발생
		
		for(int i = 0; i<1000; i++) {
			
			number = (int)(Math.random()*(57 - 35 + 1)+15);
			count ++;
			
			System.out.printf("%5d", number);
			
			if(count%10 ==0) {
				System.out.println();
			}
			
		}

	}

}
