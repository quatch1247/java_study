package ja_0720;

public class Exception_5 {

	public static void main(String[] args) {
	
		try {
			Exception obj = new Exception("고의로 만든 예외 발생");
			throw obj;
		}catch(Exception e){
			System.err.println("내가 만든 예외");
			e.printStackTrace();
		}
		

	}

}
