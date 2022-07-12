package ja_0712;

public class Lotto_1023 {

	public static void main(String[] args) {
		
		int[] ball = new int[45];
		for (int i = 0; i < ball.length; i++) {
			
			ball[i] = i+1;
			
		}
		
		int temp = 0;
	
		
		for (int i = 0; i < 9999; i++) {
			int j = (int)(Math.random()*45); // 0~45까지의 임의의 숫자

			temp = ball[0];
			ball[0] = ball[j];
			ball[j]  = temp;
			
		}
		
		System.out.println();
		System.out.println("\n 1023차 로또 당첨번호 \n");
		
		for (int i = 0; i < 6; i++) {
			
			System.out.print(ball[i] + "\t");
			
		}
		System.out.println();
		System.out.println("\n 보너스 당첨 번호\n");
		System.out.println("\t" +ball[6]+"번 입니다.\n");
		
		
	}

}
