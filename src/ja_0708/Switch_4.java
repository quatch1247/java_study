package ja_0708;

public class Switch_4 {

	public static void main(String[] args) {

		int score =(int)(Math.random() * 10)+1;
		String msg = "";
		score *= 100;
		msg = "당신의 점수는" + score + " 이고, 상품은 ";
		
		switch(score)
		{
		case 700:
			msg += "자전거,";
			break;
		case 800:
			msg += "TV";
			break;
		case 900:
			msg += "노트북";
			break;
		case 1000:
			msg += "자동차";
			break;
		default:
			msg +="볼펜";
			break;
			
		}
		
		System.out.println(msg + "입니다.");
		
		

	}

}
