package ja_0727;


import java.util.Random;

public class Random_2_1 {

	public static void main(String[] args) {
		
		
		//seed값을 주지 않을 경우 일정한 패턴으로 난수가 발생할 수 있다.
		
		//Random 클래스 객체를 이용해
		//270~530사이의 난수 100개를 만드시오
		
		//난수발생공식 (정수화)((상한값 - 하한값+1)*난수발생)+하한값
		//nextINt X
		for(int i=1; i<=10; i++){
		System.out.print(i+"번 \t"); 
		}
		System.out.println();
		
		
		Random rnd = new Random(System.currentTimeMillis());
		int count = 0;
		
		for(int j = 0; j<10; j++) {
		for(int i = 0; i<10; i++) {
			
			System.out.print((int)(rnd.nextDouble()*(530-269))+270+"\t");
			count ++;
		}System.out.println();
			
			
		}

	}

}



