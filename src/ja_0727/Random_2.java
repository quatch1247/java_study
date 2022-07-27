package ja_0727;

import java.util.Random;

public class Random_2 {

	public static void main(String[] args) {
		
		
		//seed값을 주지 않을 경우 일정한 패턴으로 난수가 발생할 수 있다.
		
		//Random 클래스 객체를 이용해
		//270~530사이의 난수 100개를 만드시오
		
		Random rnd = new Random(System.currentTimeMillis());
		int count = 0;
		
		for(int i = 0; i<100; i++) {
			System.out.print(rnd.nextInt()+"\t");
			count ++;
			
			if(count%7 ==0) {
				System.out.println();
			}
		}

	}

}
