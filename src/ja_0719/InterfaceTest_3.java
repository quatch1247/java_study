package ja_0719;


interface Mbc
{
	void play();

}

class kbs{
	void autoPlay(Mbc obj) {
		obj.play();
	}
}

class MySbs implements Mbc{

	@Override
	public void play() {
	System.out.println("Mysbs티비 생방송");
		
	}
	
}

class MyCNN implements Mbc
{

	@Override
	public void play() {
		System.out.println("MyCNN티비 생방송");
		
	}
	
}
public class InterfaceTest_3 {

	public static void main(String[] args) {
		
		kbs obj = new kbs();
		
		obj.autoPlay(new MySbs());
		obj.autoPlay(new MyCNN());
	}

}
