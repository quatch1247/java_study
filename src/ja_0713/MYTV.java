package ja_0713;



//클래스, 메소드 독립돈 객체

class TV{
	
	//TV의 속성 (멤버 변수 ==필드)
	String color; // 색상
	boolean power; // 전원(on/off)
	int channel; // 채널
	
	
	//TV기능 메소드
	void spower() //tv를 켜거나 끄는 기능의 메소드
	{
		power = !power;
	}
	
	void channelUp() //tv채널을 높이는 기능을하는 메소드
	{
		++channel;
	}
	
	void channelDown() //tv채널을 높이는 기능을하는 메소드
	{
		
		--channel;
	}
	
	
	
	
}

public class MYTV {

	public static void main(String[] args) {
		
		TV  ttvv = new TV();//스택영역에 레퍼런스 변수 ttvv를 위한 공간이 마련된다.
		
//		new에 의한 인스턴스 생성이란 필드, 메서드 값들을 저장할 수 있는 
//		별도의 공각은 heap 영역에 배당받는 것을 의마한다.
//		참조변수는 생성된 인스턴스의 주소를 저장하기 위해
//		스택영역에 메모리를 할당한다.
		
		TV ttvv2 = new TV(); 
		
		ttvv.spower();
		ttvv2.spower();
		
		ttvv.channel = 7;
		ttvv2.channel = 11;
		
		ttvv.channelUp();
		ttvv.channelUp();
		ttvv.channelUp();
		
		ttvv2.channelDown();
		ttvv2.channelDown();
		ttvv2.channelDown();
		ttvv2.channelDown();
		ttvv2.channelDown();
		
		
		System.out.println("현재 ttvv는 " + ttvv.power + "상태입니다.");
		System.out.println("현재 TV 채널은 " + ttvv.channel + "번 입니다.");
		
		System.out.println("현재 ttvv2는 " + ttvv2.power + "상태입니다.");
		System.out.println("현재 TV 채널은 " + ttvv2.channel + "번 입니다.");
		
		
		

	}

}
