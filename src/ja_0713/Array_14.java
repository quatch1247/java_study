package ja_0713;

import java.util.Scanner;

public class Array_14 {
	
	//데이터 위치 검색하기

	public static void main(String[] args) {
		
		int[] data = {0, 10, 20, 30, 40,50,60,70,80,90,100};
		
		int value, index = -1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("탐색할 값을 입력하세요");
		
		value = input.nextInt();
		
		input.close(); // new Scanner를 System.in을 해주었기 때문에 반드시 close를 해주어야 한다.
		
		for (int i = 0; i < data.length; i++) {
			if(data[i]==value) {
				
				index = i;
			}
		}
		
		if(index < data.length && index >= 0) {
			System.out.println("\n 찾는 "+ value + " 값은 " + (index + 1)+ " 번째 위치에 있습니다.");
			System.exit(0);
			
		}else {
			
			System.out.println("\n 찾는"+ value + " 값은 존재하지 않습니다.");
			System.exit(0);
		}
		

	}

}
