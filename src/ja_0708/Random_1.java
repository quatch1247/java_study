package ja_0708;

public class Random_1 {

	 public static void main(String[] args) {


		   
		    for (int i = 1; i <= 100; i++) {
		    	int ch = (int) ((Math.random() * 26) + 65);
		      
		    System.out.printf("%2c", (char)ch);
		    
		    //출력 char 은 %3c 이런식으로 표현
		   
		    if(i % 10 == 0) 
		    {
		      System.out.println();
		    }
		    
		    }
	 }
}




		
		   
		