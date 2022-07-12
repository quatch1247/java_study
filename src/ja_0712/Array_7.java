package ja_0712;

public class Array_7 {

	public static void main(String[] args) {
	 
		int[] mbc = new int[100];
		int kk = 0;
		
		for (int i = 0; i < mbc.length; i++) {
			
			mbc[i] = i;
			
			kk++;
			
			System.out.print(mbc[i] + "\t");
			
			if (kk%10 == 0) {
				System.out.print("\n");
				
			}
		}
		System.out.println("kbs 배열의 크기 : " + mbc.length );
		
		
		
//	        String path = System.getProperty("user.dir");
//	        System.out.println("현재 작업 경로: " + path);
    }
	
	}

