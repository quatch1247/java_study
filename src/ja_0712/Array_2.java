package ja_0712;

public class Array_2 {

	public static void main(String[] args) {
		
		int[] month = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
		//int[] month = new int[12]; // 이거랑 다른 방법
		
		//배열 이름을 찍고 .length을 쓰면 사이즈를 알 수 있다.
		System.out.println(month.length);
		
		
		for(int i = 0; i < month.length; i++) 
		{
			System.out.println((i+1 + "월 " + month[i] + "일"));
			
		}
		

	}

}
