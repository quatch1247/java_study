package ja_0720;


public class Exception_2 {

	public static void main(String[] args) {
	
		
		int number = 100;
		int result = 0;
		
		for(int i = 0; i < 10; i++) {
			try {
				result = number / (int)(Math.random()*10);
			} catch (ArithmeticException e) {
				System.err.println(e.getMessage());
			}
			
			System.out.println(result + "\t");
		}
		

	}

}
