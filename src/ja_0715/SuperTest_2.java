package ja_0715;


class SuperTV{
	boolean power;
	int channel;
	int volumn;
	
	void power_1() {
		power = !power;
	}
	
	void volumnUp() {
		volumn+=2;
	}
	
	void channelUp() {
		channel++;
	}
	
	
	void volumnDown() {
		volumn-=2;
	}
	
	void channelDown() {
		channel--;
	}
	

	
}

class MyTV extends SuperTV
{
	void displayCaption(String str) {
		if(power) {
			System.out.println(str);
		}
	}
}



public class SuperTest_2 {

	public static void main(String[] args) {
		MyTV myTV = new MyTV();
		
		myTV.channel = 9;
		myTV.channelUp();
		myTV.channelUp();
		myTV.channelUp();
		myTV.channelUp();
		
		myTV.volumnUp();
		
		myTV.channelDown();
		myTV.channelDown();
		myTV.channelDown();

		System.out.println(myTV.channel);
		System.out.println(myTV.volumn);
		
		myTV.displayCaption("아름다운 강산");
		myTV.power_1();
		
		myTV.displayCaption("시원한 여름 바람");
		myTV.power_1();
		myTV.power_1();
		
		myTV.displayCaption("신나는 금요일~~");
		
		
		
		

	}

}
