package ja_0713;

public class Array_13 {

	public static void main(String[] args) {
		

		//난수를 사용해 많이 던지면 근사치를 가지게 되는
		//final : 값을 변경하지 못하는 상수가 된다.
		
		final int SIZE = 6;
		int[] freq = new int[SIZE];
		
		for(int i = 0; i<10000; i++) {
			++freq[(int)(Math.random()*SIZE)];
		}
		System.out.println("==========================================");
		System.out.println("       면                    빈도수          ");
		System.out.println("==========================================");
		
		for (int i = 0; i < SIZE; i++) {
			
			System.out.println("	" + (i+1) + "         :          " + freq[i]+"");
			
		}
	}

}
