package ja_0708;

public class Switch_3 {

	public static void main(String[] args) {


		char ch = (char)(Math.random() * 4 + 'A');
		
		//Math.random 함수 임의의 값을 추출
		//난수의 개념 설명
		//난수발생공식
		
		int score = 0;
		
		switch(ch)
		{
			case 'A':
				score = 90;
				break;
			case  'B':
				score = 80;
				break;
			case 'C':
				score = 70;
				break;
			case 'D':
				score = 60;
				break;
			default:
				score = 0;
				break;
				
		}
		System.out.println("당신의 점수는 " + score + "입니다.");
		
		

	}
	

}
